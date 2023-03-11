public class Wolf extends WildAnimal{

    private boolean isLeader;

    /**
     * Конструктор для создания волка
     * @param weight    вес;
     * @param growth    рост;
     * @param eyeColor  цвет глаз;
     * @param habitat   место обитания;
     * @param yearDate  год нахождения;
     * @param monthDate месяц нахождения;
     * @param dayDate   день нахождения;
     * @param leader    является ли лидером.
     */
    public Wolf(double weight, double growth, String eyeColor, String habitat,
                int yearDate, int monthDate, int dayDate, boolean leader) {
        super(weight, growth, eyeColor, habitat, yearDate, monthDate, dayDate);
        this.isLeader = leader;
    }

    /**
     * Конструктор, создающий волка по умолчанию.
     */
    public Wolf() {
        this(30.5, 1.5, "Карий", "Тайга",
                1990, 6, 12, false);
    }

    @Override
    public String voice() {
        return "Волк воет УУУУУ";
    }

    @Override
    public String toString() {
        return String.format("%sЛидер: %b\n",
                super.toString(),
                this.isLeader);
    }
}
