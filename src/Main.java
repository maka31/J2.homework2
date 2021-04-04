public class Main {

    public static void main(String[] args) {
        createObject("Venus");
        createObject("Earth");
        createObject("Saturn");
    }

    public static Planet createObject(String className) {
        switch (className) {
            case "Saturn":
                Saturn saturn = new Saturn();
                saturn.setDiameter(120536);
                saturn.setDensity(687);
                saturn.setOrbitalPeriod(10759.22);
                saturn.setTemp(new Temperature(-139, -189));
                saturn.setOrder(OrderInSolarSystem.SIXTH);
                saturn.setAtmosphericComposition("hydrogen and helium");
                saturn.setNumberOfRings(30);
                saturn.setCompositionOfRings("ice particles and rocky debris");
                saturn.print();
                break;
            case "Earth":
                Earth earth = new Earth();
                earth.setDiameter(12742);
                earth.setDensity(5515.3);
                earth.setOrbitalPeriod(365.25);
                earth.setTemp(new Temperature(-89, 58));
                earth.setOrder(OrderInSolarSystem.THIRD);
                earth.setAtmosphericComposition("nitrogen and oxygen");
                earth.setPopulation(7.8);
                earth.setNumberOfContinents(7);
                earth.print();
                break;
            case "Venus":
                Venus venus = new Venus();
                venus.setDiameter(12103.6);
                venus.setDensity(5200);
                venus.setOrbitalPeriod(224.7);
                venus.setTemp(new Temperature(460, 470));
                venus.setOrder(OrderInSolarSystem.SECOND);
                venus.setAtmosphericComposition("carbon dioxide");
                venus.setNumberOfVolcanoes(1600);
                venus.setVolcanoName("Maat Mons");
                venus.print();
                break;
        }
        return new Planet();
    }
}
