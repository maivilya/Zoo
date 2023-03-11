public abstract class Bird extends Animal{

    private double flyHeight;

    /**
     * Конструктор абстрактной птицы
     * @param weight   вес;
     * @param growth   рост;
     * @param eyeColor цвет глаз;
     */
    protected Bird(double weight, double growth, String eyeColor, double flyHeigth) {
        super(weight, growth, eyeColor);
        this.flyHeight = flyHeigth;
    }

    public abstract String fly();

    @Override
    public String toString() {
        return String.format("Вид: %s\n" +
                        "Вес: %.1f кг\n" +
                        "Рост: %.1f м\n" +
                        "Цвет глаз: %s\n" +
                        "Высота полета: %.1f\n",
                this.getClass().getSimpleName(),
                this.getWeight(),
                this.getGrowth(),
                this.getEyeColor(),
                this.flyHeight);
    }
}
