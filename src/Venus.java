public class Venus extends Planet implements Printable {

    private int numberOfVolcanoes;
    private String volcanoName;

    public int getNumberOfVolcanoes() {
        return numberOfVolcanoes;
    }

    public void setNumberOfVolcanoes(int numberOfVolcanoes) {
        this.numberOfVolcanoes = numberOfVolcanoes;
    }

    public String getVolcanoName() {
        return volcanoName;
    }

    public void setVolcanoName(String volcanoName) {
        this.volcanoName = volcanoName;
    }

    public void print() {
        System.out.println("Planet: " + getClass().getSimpleName() + " \uD83C\uDF15" + "\nDiameter: " + getDiameter() +
                " km" + "\nDensity: " + getDensity() + " kg/m3" + "\nOrbital period: " + getOrbitalPeriod() + " days" +
                "\nTemperature: " + getTemp().getMin() + "°C(min), " + getTemp().getMax() + "°C(max)" +
                "\nOrder in Solar System: " + getOrder() + "\nAtmosphere consists of: " + getAtmosphericComposition() +
                "\nNumber of volcanoes: " + getNumberOfVolcanoes() + "\nHighest volcano's name: " + getVolcanoName() +
                "\n________________________________________");
    }
}
