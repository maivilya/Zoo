package Animals.Basics;

public abstract class Animal {

    private double weight;
    private double growth;
    private final String eyeColor;

    /**
     * Конструктор абстрактного животного
     * @param weight   вес;
     * @param growth   рост;
     * @param eyeColor цвет глаз;
     */
    protected Animal(double weight, double growth, String eyeColor) {
        this.weight = weight;
        this.growth = growth;
        this.eyeColor = eyeColor;
    }

    public double getWeight() {
        return weight;
    }

    public double getGrowth() {
        return growth;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public abstract String voice();

    public abstract String toString();
}
