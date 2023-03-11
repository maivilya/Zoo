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
        return  "1. Добавить животное в зоопарк\n" +
                "2. Удалить животное из зоопарка\n" +
                "3. Просмотреть информацию о животном\n" +
                "4. Заставить животное издать звук\n" +
                "5. Просмотреть информацию зоопарке\n" +
                "6. Заставить зоопарк издавать звуки\n" +
                "7. Выйти\n" +
                "Выберите пункт меню: ";
    }

    private static String setAnimalMenu() {
        return  "1. Добавить кота\n" +
                "2. Добавить собаку\n" +
                "3. Добавит тигра\n" +
                "4. Добавить волка\n" +
                "5. Добавить курицу\n" +
                "6. Назад\n" +
                "Выберите пункт меню: ";
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