package dk.via.pro3_assignment_restapi.repository;

import dk.via.pro3_assignment_restapi.model.Animal;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AnimalRepository implements IAnimalRepository
{
  private final Map<Long, Animal> animals = new HashMap<>();



  @Override public Animal save(Animal animal)
  {
    animals.put(animal.getRegNum(), animal);
    return animal;
  }

  @Override public Optional<Animal> findById(int id)
  {return animals.values()
      .stream()
      .filter(a -> a.getRegNum() == id)
      .findFirst();

  }

  @Override public List<Animal> findByDate(LocalDate date)
  {return animals.values()
      .stream()
      .filter(a -> a.getDate().equals(date))
      .toList();

  }

  @Override public List<Animal> findByOrigin(String origin)
  {return animals.values()
      .stream()
      .filter(a -> a.getOrigin().equalsIgnoreCase(origin))
      .toList();

  }

  @Override public List<Animal> findAll()
  {return animals.values().stream().toList();

  }
}
