package com.katetaier13;

import com.vehicles.Car;
import com.vehicles.Lorry;
import com.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {
	/*1)  Автомобили. Создать класс Car в пакете vehicles , Engine в пакете details и Driver в пакете professions.
          Класс Driver содержит поля - ФИО, стаж вождения.
          Класс Engine содержит поля - мощность, производитель.
          Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
          Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
          "Поворот направо" или "Поворот налево".
          А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
          Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
          Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
          Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью
          Пусть класс Driver расширяет класс Person.

          2) В класс Person вместо поля возраст добавить поле дата рождения как строка типа "18.12.1985"
          - добавить метод который выводит количество полных лет на данный момент.*/

        Car car = new Car("BMW", "super car", 1800);
        car.start();
        car.stop();
        car.turnRight();
        car.turnLeft();
        System.out.println();
        System.out.print(car + "\n\n");
        Lorry lorry = new Lorry("Truck", "Freight transportation", 6000, 2000);
        System.out.print(lorry + "\n\n");
        SportCar sportCar = new SportCar("Lamborghini", "Formula 1", 3000, 270.5);
        System.out.print(sportCar + "\n\n");
        System.out.println("The current date is: " + Person.getCurrentDate());
        System.out.println("The ages of the drivers: ");
        String dateOfBirth = "1987-09-16";
        System.out.println(Person.getYears(dateOfBirth));
        dateOfBirth = "1975-03-14";
        System.out.println(Person.getYears(dateOfBirth));
        dateOfBirth = "1999-08-17";
        System.out.print(Person.getYears(dateOfBirth) + " ");
        System.out.println("respectively.");
    }
}