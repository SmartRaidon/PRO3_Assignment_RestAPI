package dk.via.pro3_assignment_restapi.repository;

import dk.via.pro3_assignment_restapi.model.Animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
  List<Animal> findByDate(LocalDate date);
  List<Animal> findByOriginIgnoreCase(String origin);
}
