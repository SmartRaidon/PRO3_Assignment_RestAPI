package dk.via.pro3_assignment_restapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "animal")
public class Animal
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long regNum;

  @Column(name = "weight")
  private double weight;
  @Column(name = "date", nullable = false)
  private LocalDate date;
  @Column(name = "origin", nullable = false)
  private String origin;

  public Animal() {}

  public Animal(long regNum, double weight, LocalDate date, String origin)
  {
    this.regNum = regNum;
    this.weight = weight;
    this.date = date;
    this.origin = origin;
  }

  public long getRegNum()
  {
    return regNum;
  }

  public void setRegNum(long regNum)
  {
    this.regNum = regNum;
  }

  public double getWeight()
  {
    return weight;
  }

  public void setWeight(double weight)
  {
    this.weight = weight;
  }

  public LocalDate getDate()
  {
    return date;
  }

  public void setDate(LocalDate date)
  {
    this.date = date;
  }

  public String getOrigin()
  {
    return origin;
  }

  public void setOrigin(String origin)
  {
    this.origin = origin;
  }
}
