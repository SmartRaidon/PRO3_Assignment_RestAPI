package dk.via.pro3_assignment_restapi.model;

import java.time.LocalDate;

public class Animal
{
  private int regNum;
  private double weight;
  private LocalDate date;
  private String origin;

  public Animal() {}

  public Animal(int regNum, double weight, LocalDate date, String origin)
  {
    this.regNum = regNum;
    this.weight = weight;
    this.date = date;
    this.origin = origin;
  }

  public int getRegNum()
  {
    return regNum;
  }

  public void setRegNum(int regNum)
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
