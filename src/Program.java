import Animals.Zoo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zoo zoo = new Zoo();
        showMenu(zoo, input);
        input.close();
    }

    private static void showMenu(Zoo a, Scanner input) {
        System.out.print(menu());
        int choose = input.nextInt();
        switch(choose){
            case 1:
                addAnimal(a, input);
                showMenu(a, input);
            case 2:
                a.zooInfoIndex();
                removeAnimal(a, input);
                showMenu(a, input);
            case 3:
                infoAnimal(a, input);
                showMenu(a, input);
            case 4:
                animalVoice(a, input);
                showMenu(a, input);
            case 5:
                a.zooInfo();
                showMenu(a, input);
            case 6:
                a.zooVoice();
                showMenu(a, input);
            case 7:
                break;
            default:
                System.out.println(incorrectOperation());
                showMenu(a, input);
        }
    }

    private static String incorrectOperation() {
        return "Вы ввели некорректную операцию";
    }

    private static String menu() {
        return """
                1. Добавить животное в зоопарк
                2. Удалить животное из зоопарка
                3. Просмотреть информацию о животном
                4. Заставить животное издать звук
                5. Просмотреть информацию зоопарке
                6. Заставить зоопарк издавать звуки
                7. Выйти
                Выберите пункт меню:\s""";
    }

    private static String setAnimalMenu() {
        return """
                1. Добавить кота
                2. Добавить собаку
                3. Добавит тигра
                4. Добавить волка
                5. Добавить курицу
                6. Назад
                Выберите пункт меню:\s""";
    }

    private static void addAnimal(Zoo a, Scanner input) {
        System.out.print(setAnimalMenu());
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                a.addCat(input);
                showMenu(a, input);
            case 2:
                a.addDog(input);
                showMenu(a, input);
            case 3:
                a.addTiger(input);
                showMenu(a, input);
            case 4:
                a.addWolf(input);
                showMenu(a, input);
            case 5:
                a.addChicken(input);
                showMenu(a, input);
            case 6:
                showMenu(a, input);
        }
    }

    private static void removeAnimal(Zoo a, Scanner input) {
        System.out.print("Кого вы хотите удалить из зоопарка?: ");
        int choose = input.nextInt();
        a.removeAnimal(choose);

    }

    private static void infoAnimal(Zoo a, Scanner input) {
        System.out.print("О каком животном вы хотите узнать: ");
        int choose = input.nextInt();
        a.animalInfo(choose);
    }

    private static void animalVoice(Zoo a, Scanner input) {
        System.out.print("У какого животного издать звук: ");
        int choose = input.nextInt();
        a.animalVoice(choose);
    }
}