public class SolarSystem {
    String name;
    int numberOfPlanets;
    int numberOfMoons;
    boolean hasAsteroidBelt;
    double diameter;
    String dominantElement;
    double age;
    String galacticLocation;
    boolean hasLife;
    String governingForce;

    public SolarSystem() {
        System.out.println("default constructor in solar system");
    }

    public SolarSystem(String name, int numberOfPlanets, int numberOfMoons, boolean hasAsteroidBelt, double diameter) {
        this();
        this.name = name;
        this.numberOfPlanets = numberOfPlanets;
        this.numberOfMoons = numberOfMoons;
        this.hasAsteroidBelt = hasAsteroidBelt;
        this.diameter = diameter;
        System.out.println("Constructor 2: Calls Constructor 1");
    }

    public SolarSystem(String name, int numberOfPlanets, int numberOfMoons, boolean hasAsteroidBelt, double diameter, String dominantElement, double age) {
        this(name, numberOfPlanets, numberOfMoons, hasAsteroidBelt, diameter);
        this.dominantElement = dominantElement;
        this.age = age;
        System.out.println("Constructor 3: Calls Constructor 2");
    }

    public SolarSystem(String name, int numberOfPlanets, int numberOfMoons, boolean hasAsteroidBelt, double diameter, String dominantElement, double age, String galacticLocation, boolean hasLife) {
        this(name, numberOfPlanets, numberOfMoons, hasAsteroidBelt, diameter, dominantElement, age);
        this.galacticLocation = galacticLocation;
        this.hasLife = hasLife;
        System.out.println("Constructor 4: Calls Constructor 3");
    }

    public SolarSystem(String name, int numberOfPlanets, int numberOfMoons, boolean hasAsteroidBelt, double diameter, String dominantElement, double age, String galacticLocation, boolean hasLife, String governingForce) {
        this(name, numberOfPlanets, numberOfMoons, hasAsteroidBelt, diameter, dominantElement, age, galacticLocation, hasLife);
        this.governingForce = governingForce;
        System.out.println("Constructor 5: Calls Constructor 4");
    }

    public static void main(String[] args) {
        SolarSystem system = new SolarSystem("Milky Way", 8, 219, true, 1.0E12, "Hydrogen", 13.6E9, "Orion Arm", true, "Gravity");
    }
}
