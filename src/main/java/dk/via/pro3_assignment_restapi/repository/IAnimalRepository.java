package dk.via.pro3_assignment_restapi.repository;

import dk.via.pro3_assignment_restapi.model.Animal;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IAnimalRepository
{
  Animal save(Animal animal);
  Optional<Animal> findById(int id);
  List<Animal> findByDate(LocalDate date);
  List<Animal> findByOrigin(String origin);
  List<Animal> findAll();

}
