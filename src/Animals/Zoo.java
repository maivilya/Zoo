package Animals;

import Animals.Basics.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    public static List<Animal> zoo = new ArrayList<>();

    static {
        zoo.add(new Cat());
        zoo.add(new Dog());
        zoo.add(new Wolf());
        zoo.add(new Tiger());
        zoo.add(new Chicken());
    }

    public void addCat(Scanner input) {
        System.out.print("Порода: ");
        String breed = input.next();
        System.out.print("Имя: ");
        String name = input.next();
        System.out.print("Цвет шерсти: ");
        String coatColor = input.next();
        System.out.print("Цвет глаз: ");
        String eyeColor = input.next();
        System.out.print("Вес: ");
        double weight = input.nextDouble();
        System.out.print("Рост: ");
        double growth = input.nextDouble();
        System.out.print("Наличие прививок: ");
        boolean isVaccinated = input.nextBoolean();
        System.out.print("Наличие шерсти: ");
        boolean isFur = input.nextBoolean();
        System.out.print("Год рождения: ");
        int year = input.nextInt();
        System.out.print("Месяц рождения: ");
        int month = input.nextInt();
        System.out.print("День рождения: ");
        int day = input.nextInt();
        Zoo.zoo.add(new Cat(breed, name, coatColor, weight, growth, eyeColor, isVaccinated, year, month, day, isFur));
    }

    public void addDog(Scanner input){
        System.out.print("Порода: ");
        String breed = input.next();
        System.out.print("Имя: ");
        String name = input.next();
        System.out.print("Цвет шерсти: ");
        String coatColor = input.next();
        System.out.print("Цвет глаз: ");
        String eyeColor = input.next();
        System.out.print("Вес: ");
        double weight = input.nextDouble();
        System.out.print("Рост: ");
        double growth = input.nextDouble();
        System.out.print("Наличие прививок: ");
        boolean isVaccinated = input.nextBoolean();
        System.out.print("Наличие дрессировки: ");
        boolean isTraining = input.nextBoolean();
        System.out.print("Год рождения: ");
        int year = input.nextInt();
        System.out.print("Месяц рождения: ");
        int month = input.nextInt();
        System.out.print("День рождения: ");
        int day = input.nextInt();
        Zoo.zoo.add(new Dog(breed, name, coatColor, weight, growth, eyeColor, isVaccinated, year, month, day, isTraining));
    }

    public void addTiger(Scanner input) {
        System.out.print("Вес: ");
        double weight = input.nextDouble();
        System.out.print("Рост: ");
        double growth = input.nextDouble();
        System.out.print("Цвет глаз: ");
        String eyeColor = input.next();
        System.out.print("Место обитания: ");
        String habitat = input.next();
        System.out.print("Год нахождения: ");
        int year = input.nextInt();
        System.out.print("Месяц нахождения: ");
        int month = input.nextInt();
        System.out.print("День нахождения: ");
        int day = input.nextInt();
        zoo.add(new Tiger(weight, growth, eyeColor, habitat, year, month, day));
      }

    public void addWolf(Scanner input) {
        System.out.print("Вес: ");
        double weight = input.nextDouble();
        System.out.print("Рост: ");
        double growth = input.nextDouble();
        System.out.print("Цвет глаз: ");
        String eyeColor = input.next();
        System.out.print("Место обитания: ");
        String habitat = input.next();
        System.out.print("Год нахождения: ");
        int year = input.nextInt();
        System.out.print("Месяц нахождения: ");
        int month = input.nextInt();
        System.out.print("День нахождения: ");
        int day = input.nextInt();
        System.out.print("День нахождения: ");
        boolean isLeader = input.nextBoolean();
        zoo.add(new Wolf(weight, growth, eyeColor, habitat, year, month, day, isLeader));
    }
}
