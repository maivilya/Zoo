public class Cat extends Pet{
    /**наличие шерсти*/
    private boolean isFur;

    /**
     * Параметризированный конструктор для создания кота
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
     * @param isFur        наличие шерсти.
     */
    public Cat(String breed, String name, String coatColor, double weight, double growth,
                  String eyeColor, boolean isVaccinated, int yearDate, int monthDate, int dayDate,
                  boolean isFur) {
        super(breed, name, coatColor, weight, growth, eyeColor, isVaccinated, yearDate, monthDate, dayDate);
        this.isFur = isFur;
        if (isFur == false) {
            super.setCoatColor("Лысый");
        }
    }

    /**
     * Конструктор, создающий кота по умолчанию.
     */
    public Cat() {
        this("Карнавальный", "Семён", "Белый в коричневых пятнах", 3.5, 0.6,
                "Голубой", true, 2009, 10, 12, true);
    }

    /**
     * Метод голоса кота
     * @return строковое представление голоса кота
     */
    @Override
    public String voice() {
        return String.format("Кот %s мяукает", super.getName());
    }

    /**
     * Метод проявление ласки у кота
     * @return строковое представление проявление ласки у кота
     */
    @Override
    public String weasel() {
        return String.format("Кот %s мурлычет", super.getName());
    }

    @Override
    public String toString() {
        return String.format("%sНаличие шерсти: %b\n",
                super.toString(),
                this.isFur);
    }
}
