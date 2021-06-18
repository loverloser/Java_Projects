package com.labanovich.dmdev.t4.Car;

import java.util.Objects;

/**
 * 2. Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.=
 * Создать 4 класса, являющихся наследниками Car.=
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString()=
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 */

public abstract class Car {
     private String mark;
     private String model;
     private int year;
     private String color;

     public Car(String mark, String model, int year, String color) {
          this.mark = mark;
          this.model = model;
          this.year = year;
          this.color = color;
     }

     public String getMark() {
          return mark;
     }

     public void setMark(String mark) {
          this.mark = mark;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public int getYear() {
          return year;
     }

     public void setYear(int year) {
          this.year = year;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Car car = (Car) o;
          return year == car.year && Objects.equals(mark, car.mark) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
     }

     @Override
     public int hashCode() {
          return Objects.hash(mark, model, year, color);
     }

     @Override
     public String toString() {
          return "Car{" +
                  "mark='" + mark + '\'' +
                  ", model='" + model + '\'' +
                  ", year=" + year +
                  ", color='" + color + '\'' +
                  '}';
     }
}
