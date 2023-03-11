public class Chicken extends Bird{
    /**
     * Параметризированный конструктор для создания курицы
     * @param weight    вес;
     * @param growth    рост;
     * @param eyeColor  цвет глаз;
     * @param flyHeight высота полета
     */
    public Chicken(double weight, double growth, String eyeColor, double flyHeight) {
        super(weight, growth, eyeColor, flyHeight);
        super.setFlyHeight(0);
    }

    /**
     * Конструктор, создающий курицу по умолчанию.
     */
    public Chicken() {
        this(3, 0.5, "Черный", 0);
    }

    @Override
    public String voice() {
        return "Курица кукарекает кукареку";
    }

    @Override
    public String fly() {
        return "Курица не умеет летать, полет неудался";
    }

    @Override
    public String toString() {
        return String.format("%s",super.toString());
    }
}
