package dk.via.pro3_assignment_restapi.service;

import dk.via.pro3_assignment_restapi.model.Animal;
import dk.via.pro3_assignment_restapi.repository.IAnimalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AnimalService
{
    private IAnimalRepository animalRepository;

    public Animal register(Animal animal){
        animalRepository.save(animal);
        return animal;
    }
    public List<Animal>  getAnimals(){
        List<Animal> animals = animalRepository.findAll();
        return animals;
    }

    public Animal getAnimalsById(long id){
       // List<Animal> animals = animalRepository.findAll();
    //return animals.stream().filter(animal -> animal.getRegNum() == id).findFirst().orElse(null);
   return animalRepository.findById(id).get();
    }

 public List<Animal> getAnimalsByDate(String date){
     LocalDate newDate = LocalDate.parse(date);
    return animalRepository.findByDate(newDate);
 }

    public  List<Animal>  getAnimalsByOrigin(String origin){
        return animalRepository.findByOriginIgnoreCase(origin);
    }

}
