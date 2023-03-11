package Animals.Basics;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class WildAnimal extends Animal {

    /**место обитания*/
    private String habitat;
    /**дата обнаружения вида животного*/
    private Calendar discoveryDate;

    /**
     * Конструктор абстрактного дикого животного
     * @param weight    вес;
     * @param growth    рост;
     * @param eyeColor  цвет глаз;
     * @param habitat   место обитания;
     * @param yearDate  год нахождения;
     * @param monthDate месяц нахождения;
     * @param dayDate   день нахождения.
     */
    protected WildAnimal(double weight, double growth, String eyeColor, String habitat,
                         int yearDate, int monthDate, int dayDate) {
        super(weight, growth, eyeColor);
        this.habitat = habitat;
        this.discoveryDate = new GregorianCalendar(yearDate, monthDate, dayDate);
    }

    public abstract String voice();

    @Override
    public String toString() {
        return String.format("Вид: %s\n" +
                        "Место обитания: %s\n" +
                        "Дата обнаружения: %s-%s-%s\n" +
                        "Вес: %.1f кг\n" +
                        "Рост: %.1f м\n" +
                        "Цвет глаз: %s\n",
                this.getClass().getSimpleName(),
                this.habitat,
                this.discoveryDate.get(Calendar.YEAR),
                this.discoveryDate.get(Calendar.MONTH),
                this.discoveryDate.get(Calendar.DAY_OF_MONTH),
                this.getWeight(),
                this.getGrowth(),
                this.getEyeColor());
    }
}
