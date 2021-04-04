public class Saturn extends Planet implements Printable {

    private int numberOfRings;
    private String compositionOfRings;

    public int getNumberOfRings() {
        return numberOfRings;
    }

    public void setNumberOfRings(int numberOfRings) {
        this.numberOfRings = numberOfRings;
    }

    public String getCompositionOfRings() {
        return compositionOfRings;
    }

    public void setCompositionOfRings(String compositionOfRings) {
        this.compositionOfRings = compositionOfRings;
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