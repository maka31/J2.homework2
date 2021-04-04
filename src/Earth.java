public class Earth extends Planet implements Printable {

    private double population;
    private int numberOfContinents;

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public int getNumberOfContinents() {
        return numberOfContinents;
    }

    public void setNumberOfContinents(int numberOfContinents) {
        this.numberOfContinents = numberOfContinents;
    }

    public void print() {
        System.out.println("Planet: " + getClass().getSimpleName() + " \uD83C\uDF0D" + "\nDiameter: " + getDiameter() +
                " km" + "\nDensity: " + getDensity() + " kg/m3" + "\nOrbital period: " + getOrbitalPeriod() + " days" +
                "\nTemperature: " + getTemp().getMin() + "°C(min), " + getTemp().getMax() + "°C(max)" +
                "\nOrder in Solar System: " + getOrder() + "\nAtmosphere consists of: " + getAtmosphericComposition() +
                "\nPopulation by 2021: " + getPopulation() + " billion" + "\nNumber of continents: " +
                getNumberOfContinents() + "\n________________________________________");
    }
}
