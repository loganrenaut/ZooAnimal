public class Rhinoceros implements iAnimal {
    private final String animalType = "Rhinoceros";
    private int anIdTag;
    private final int minTemperature = -2;
    private final int maxTemperature = 93;

    @Override
    public String getAnimalType() {
        return animalType;
    }

    @Override
    public int getIdTag() {
        return anIdTag;
    }

    @Override
    public void setIdTag(int anIdTag) {
        this.anIdTag = anIdTag;

    }

    // Temperature in Fahrenheit
    @Override
    public int getMinTemperature() {
        return minTemperature;
    }

    // Temperature in Fahrenheit
    @Override
    public int getMaxTemperature() {
        return maxTemperature;
    }
}
