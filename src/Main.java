public class Main {

    public static void main(String[] args) {
        createObject("Venus");
        createObject("Earth");
        createObject("Saturn");
    }

    public static Planet createObject(String className) {
        switch (className) {
            case "Saturn":
                Saturn saturn = new Saturn(120536, 687, 10759.22, new Temperature(-139, -189),
                        "hydrogen and helium", 30,
                        "ice particles and rocky debris");
                saturn.print();
                break;
            case "Earth":
                Earth earth = new Earth(12742, 5515.3, 365.25, new Temperature(-89, 58),
                        "nitrogen and oxygen", 7.8, 7);
                earth.print();
                break;
            case "Venus":
                Venus venus = new Venus(12103.6, 5200, 224.7, new Temperature(460, 470),
                        "carbon dioxide", 1600, "Maat Mons");
                venus.print();
                break;
        }
        return new Planet();
    }
}
