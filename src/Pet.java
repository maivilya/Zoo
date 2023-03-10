import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Pet extends Animal implements Weaselable{

    /**имя*/
    private String name;
    /**порода*/
    private String breed;
    /**наличие прививок*/
    private boolean isVaccinated;
    /**цвет шерсти*/
    private String coatColor;
    /**дата рождения*/
    private Calendar birthDate;

    /**
     * Параметризированный конструктор домашнего питомца
     * @param breed        порода
     * @param name         имя
     * @param coatColor    цвет шерсти
     * @param weight       вес;
     * @param growth       рост;
     * @param eyeColor     цвет глаз;
     * @param isVaccinated наличие прививок;
     * @param yearDate     год рождения;
     * @param monthDate    месяц рождения;
     * @param dayDate      день рождения.
     */
    protected Pet(String breed, String name, String coatColor, double weight, double growth,
                  String eyeColor, boolean isVaccinated, int yearDate, int monthDate, int dayDate) {
        super(weight, growth, eyeColor);
        this.breed = breed;
        this.name = name;
        this.coatColor = coatColor;
        this.isVaccinated = isVaccinated;
        this.birthDate = new GregorianCalendar(yearDate, monthDate, dayDate);
    }

    public String getName() {
        return name;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public abstract String voice();

    @Override
    public  abstract String weasel();

    @Override
    public String toString() {
        return String.format("%s\n" +
                        "Порода: %s\n" +
                        "Имя: %s\n" +
                        "Цвет шерсти: %s\n" +
                        "Вес: %.1f kg\n" +
                        "Рост: %.1f m\n" +
                        "Цвет глаз: %s\n" +
                        "День рождения: %s-%s-%s\n" +
                        "Наличие прививок: %b\n",
                this.getClass().getSimpleName(),
                this.breed,
                this.name,
                this.coatColor,
                this.getWeight(),
                this.getGrowth(),
                this.getEyeColor(),
                this.birthDate.get(Calendar.YEAR),
                this.birthDate.get(Calendar.MONTH),
                this.birthDate.get(Calendar.DAY_OF_MONTH),
                this.isVaccinated);
    }
}
