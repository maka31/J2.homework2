public class Planet {

    private double diameter;
    private double density;
    private double orbitalPeriod;
    private Temperature temp;
    private OrderInSolarSystem order;
    private String atmosphericComposition;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public OrderInSolarSystem getOrder() {
        return order;
    }

    public void setOrder(OrderInSolarSystem order) {
        this.order = order;
    }

    public String getAtmosphericComposition() {
        return atmosphericComposition;
    }

    public void setAtmosphericComposition(String atmosphericComposition) {
        this.atmosphericComposition = atmosphericComposition;
    }
}
