public class Saturn extends Planet implements Printable {

    private int numberOfRings;
    private String compositionOfRings;

    public Saturn(double diameter, double density, double orbitalPeriod, Temperature temp,
                  String atmosphericComposition, int numberOfRings, String compositionOfRings) {
        super.setDiameter(diameter);
        super.setDensity(density);
        super.setOrbitalPeriod(orbitalPeriod);
        super.setTemp(temp);
        super.setOrder(OrderInSolarSystem.SIXTH);
        super.setAtmosphericComposition(atmosphericComposition);
        this.numberOfRings = numberOfRings;
        this.compositionOfRings = compositionOfRings;
    }

    public int getNumberOfRings() {
        return numberOfRings;
    }

    public String getCompositionOfRings() {
        return compositionOfRings;
    }

    public void print() {
        System.out.println("Planet: " + getClass().getSimpleName() + " \uD83E\uDE90" + "\nDiameter: " + getDiameter() +
                " km" + "\nDensity: " + getDensity() + " kg/m3" + "\nOrbital period: " + getOrbitalPeriod() + " days" +
                "\nTemperature: " + getTemp().getMin() + "°C(min), " + getTemp().getMax() + "°C(max)" +
                "\nOrder in Solar System: " + getOrder() + "\nAtmosphere consists of: " + getAtmosphericComposition() +
                "\nNumber of rings: " + getNumberOfRings() + "\nComposition of rings: " + getCompositionOfRings() +
                "\n________________________________________");
    }
}