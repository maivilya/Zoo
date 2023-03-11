import Animals.Zoo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zoo zoo = new Zoo();
        zoo.zooInfo();
    }

    private static String showMenu() {
        return  "1. Добавить животное в зоопарк\n" +
                "2. Удалить животное из зоопарка\n" +
                "3. Просмотреть информацию о животном\n" +
                "4. Заставить животное издать звук\n" +
                "5. Просмотреть информацию зоопарке\n" +
                "6. Заставить зоопарк издавать звуки\n" +
                "7. Выйти\n" +
                "Выберите пункт меню: ";
    }
}