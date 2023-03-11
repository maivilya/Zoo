public class Tiger extends WildAnimal{

    /**
     * Конструктор для создания тигра
     * @param weight    вес;
     * @param growth    рост;
     * @param eyeColor  цвет глаз;
     * @param habitat   место обитания;
     * @param yearDate  год нахождения;
     * @param monthDate месяц нахождения;
     * @param dayDate   день нахождения;
     */
    public Tiger(double weight, double growth, String eyeColor, String habitat,
                int yearDate, int monthDate, int dayDate) {
        super(weight, growth, eyeColor, habitat, yearDate, monthDate, dayDate);
    }

    /**
     * Конструктор, создающий тигра по умолчанию.
     */
    public Tiger() {
        this(120, 3, "Оранжевый", "Индия",
                2003, 9, 7);
    }

    @Override
    public String voice() {
        return "Тигр рычит РРРРРР";
    }

    @Override
    public String toString() {
        return String.format("%s",super.toString());
    }
}
