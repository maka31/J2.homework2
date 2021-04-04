public class Venus extends Planet implements Printable {

    private int numberOfVolcanoes;
    private String volcanoName;

    public Venus(double diameter, double density, double orbitalPeriod, Temperature temp,
                 String atmosphericComposition, int numberOfVolcanoes, String volcanoName) {
        super.setDiameter(diameter);
        super.setDensity(density);
        super.setOrbitalPeriod(orbitalPeriod);
        super.setTemp(temp);
        super.setOrder(OrderInSolarSystem.SECOND);
        super.setAtmosphericComposition(atmosphericComposition);
        this.numberOfVolcanoes = numberOfVolcanoes;
        this.volcanoName = volcanoName;
    }

    public int getNumberOfVolcanoes() {
        return numberOfVolcanoes;
    }

    public String getVolcanoName() {
        return volcanoName;
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
