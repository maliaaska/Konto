package com.milewskiarkadiuszmodul8.asmilewskiModul11;

import java.time.Year;

public class Main {
    public static void main( String[] args) {

//        Dog dog1 = new Dog(20, 6.0, "Labrador");
//        Dog dog2 = new Dog(5, 4.0, "Chihuahua");
//        Fish fish1 = new Fish(45.56, 1);
//        Fish fish2 = new Fish(23, 3);
//        Animal animal1 = new Animal(AnimalSize.BIG, 50.0);
//        Animal animal2 = new Animal(AnimalSize.MEDIUM, 15.0);
//
//
//        Animal[] animals = {dog1, dog2, fish1, fish2, animal1, animal2};
//
//        // Tworzenie obiektu klasy Zoo
//        Zoo zoo = new Zoo(animals);
//
//        // Testowanie polimorfizmu
//        zoo.testAllAnimals();


        Person person = new Person("Krzysiek", 1994);
        System.out.println(person);

        Employee employee = new Employee("Arek", 1990, 7000, 1);
        System.out.println(employee);

        SalariedEmployee salariedEmployee = new SalariedEmployee("Krystian", 1984, 4023.02, 2, 500);
        System.out.println(salariedEmployee);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Monica" , 1999, 1000, 3, 193, 45.23, 69.99);
        System.out.println(hourlyEmployee);



//        person.yearPrint();
//        person.yearCheck(person.getBirthYear());
//        System.out.println(person.getBirthYear());
//        person.getAge();


    }
}
