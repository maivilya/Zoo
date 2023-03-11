import Animals.Zoo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner userChoose = new Scanner(System.in);
        Zoo zoo = new Zoo();
        showMenu(zoo, userChoose);
        userChoose.close();
    }

    private static void showMenu(Zoo a, Scanner in) {
        System.out.print(menu());
        int choose = in.nextInt();
        switch(choose){
            case 1:
                addAnimal(a, in);
                showMenu(a, in);
            case 2:
                a.zooInfoIndex();
                removeAnimal(a, in);
                showMenu(a, in);
            case 3:
                infoAnimal(a, in);
                showMenu(a, in);
            case 4:
                animalVoice(a, in);
                showMenu(a, in);
            case 5:
                a.zooInfo();
                showMenu(a, in);
            case 6:
                a.zooVoice();
                showMenu(a, in);
            case 7:
                break;
            default:
                System.out.println(incorrectOperation());
                showMenu(a, in);
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

    private static void addAnimal(Zoo a, Scanner in) {
        System.out.print(setAnimalMenu());
        int choose = in.nextInt();
        switch (choose) {
            case 1:
                a.addCat(in);
                showMenu(a, in);
            case 2:
                a.addDog(in);
                showMenu(a, in);
            case 3:
                a.addTiger(in);
                showMenu(a, in);
            case 4:
                a.addWolf(in);
                showMenu(a, in);
            case 5:
                a.addChicken(in);
                showMenu(a, in);
            case 6:
                showMenu(a, in);
        }
    }

    private static void removeAnimal(Zoo a, Scanner in) {
        System.out.print("Кого вы хотите удалить из зоопарка?: ");
        int choose = in.nextInt();
        a.removeAnimal(choose);

    }

    private static void infoAnimal(Zoo a, Scanner in) {
        System.out.print("О каком животном вы хотите узнать: ");
        int choose = in.nextInt();
        a.animalInfo(choose);
    }

    private static void animalVoice(Zoo a, Scanner in) {
        System.out.print("У какого животного издать звук: ");
        int choose = in.nextInt();
        a.animalVoice(choose);
    }
}