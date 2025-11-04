package dk.via.pro3_assignment_restapi.controller;

import dk.via.pro3_assignment_restapi.model.Animal;
import dk.via.pro3_assignment_restapi.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals") // or maybe just "/animals"
public class AnimalController
{
  private final AnimalService service;

  public AnimalController(AnimalService service)
  {
    this.service = service;
  }

  @PostMapping
  public Animal registerAnimal(@RequestBody Animal animal)
  {
    return service.register(animal);
  }

  @GetMapping("/all")
  public List<Animal> getAnimals()
  {
    return service.getAnimals();
  }

  @GetMapping("/{id}")
  public Animal getAnimal(@PathVariable int id)
  {
    return service.getAnimalsById(id);
  }

  @GetMapping("/date/{date}")
  public List<Animal> getAnimalsByDate(@PathVariable String date)
  {
    return service.getAnimalsByDate(date);
  }

  @GetMapping("/origin/{origin}")
  public List<Animal> getAnimalsByOrigin(@PathVariable String origin)
  {
    return service.getAnimalsByOrigin(origin);
  }
}
