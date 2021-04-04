public class Earth extends Planet implements Printable {

    private double population;
    private int numberOfContinents;

    public Earth(double diameter, double density, double orbitalPeriod, Temperature temp,
                 String atmosphericComposition, double population, int numberOfContinents) {
        super.setDiameter(diameter);
        super.setDensity(density);
        super.setOrbitalPeriod(orbitalPeriod);
        super.setTemp(temp);
        super.setOrder(OrderInSolarSystem.THIRD);
        super.setAtmosphericComposition(atmosphericComposition);
        this.population = population;
        this.numberOfContinents = numberOfContinents;
    }

    public double getPopulation() {
        return population;
    }

    public int getNumberOfContinents() {
        return numberOfContinents;
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
