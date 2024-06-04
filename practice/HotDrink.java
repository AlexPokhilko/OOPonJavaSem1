package practice;

public class HotDrink extends Product{
    private int temperature;
    private int volume;

    public HotDrink(String name, double cost, int volume, int temperature) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
               "name='" + super.getName() + '\'' +
               "volume='" + this.volume + '\'' +
               "temperature='" + this.temperature + '\'' +
               ", cost=" + super.getCost() +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrink)) {
            return false;
        }

        HotDrink that = (HotDrink) o;

        return super.getName().equalsIgnoreCase(that.getName())
               && super.getCost() == that.getCost()
               && getVolume() == that.getVolume()
               && getTemperature() == that.getTemperature();
    }

}
