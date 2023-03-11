public class Dog extends Pet {

    /**наличие дрессировки*/
    private boolean isTraining;
    /**необходимое количество занятий дрессировки*/
    private int completeTrain = 3;

    /**
     * Параметризированный конструктор для создания собаки
     * @param breed        порода
     * @param name         имя
     * @param coatColor    цвет шерсти
     * @param weight       вес;
     * @param growth       рост;
     * @param eyeColor     цвет глаз;
     * @param isVaccinated наличие прививок;
     * @param yearDate     год рождения;
     * @param monthDate    месяц рождения;
     * @param dayDate      день рождения;
     * @param isTraining   наличие дрессировки.
     */
    public Dog(String breed, String name, String coatColor, double weight, double growth,
               String eyeColor, boolean isVaccinated, int yearDate, int monthDate, int dayDate,
               boolean isTraining) {
        super(breed, name, coatColor, weight, growth, eyeColor, isVaccinated, yearDate, monthDate, dayDate);
        this.isTraining = isTraining;
    }

    public Dog() {
        this("Доберман", "Бо", "Темно-кричневый", 20, 1.7,
                "Карий", true, 2018, 1, 4, false);
    }

    /**
     * Метод дрессировки собаки
     * @return Результаты дрессировок в виде строки.
     */
    @Override
    public String train() {
        int countTrains = 0;

        if (this.isTraining == false) {
            while (this.completeTrain != 0) {
                this.completeTrain--;
                return String.format("Собака %s в процессе дрессировки, осталось занятий: %d",
                        super.getName(),
                        this.completeTrain - countTrains);
            }
            this.isTraining = true;
        }
        return String.format("Собака %s уже отдрессирована", super.getName());
    }

    @Override
    public String voice() {
        return String.format("Собака %s гавкает", super.getName());
    }

    @Override
    public String weasel() {
        return String.format("Собака %s прыгает от счастья", super.getName());
    }

    @Override
    public String toString() {
        return String.format("%sДрессировка: %b\n",
                super.toString(),
                this.isTraining);
    }
}
