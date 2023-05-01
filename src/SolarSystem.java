package src;

public enum SolarSystem {

    MERCURY(1, 0, 0.387, 2439.7, null, "VENUS"),
    VENUS(2,  0.387, 0.723, 6051.8, "MERCURY", "EARTH"),
    EARTH(3, 0.723, 1, 6371, "VENUS", "MARS"),
    MARS(4, 1.52, 1.524, 3389.5, "EARTH", "JUPITER"),
    JUPITER(5, 5.20, 5.203, 69911, "MARS", "SATURN"),
    SATURN(6, 9.58, 9.537, 58232, "JUPITER", "URANUS"),
    URANUS(7, 19.18, 19.191, 25362, "SATURN", "NEPTUNE"),
    NEPTUNE(8, 30.07, 30.069, 24622, "URANUS", null);

    private int distanceFromTheSun;
    private double distanceFromThePreviousPlanet;
    private double distanceToTheSun;
    private double radius;
    private String previousPlanet;
    private String nextPlanet;

    SolarSystem(int distanceFromTheSun, double distanceFromThePreviousPlanet, double distanceToTheSun, double radius, String previousPlanet, String nextPlanet) {
        this.distanceFromTheSun = distanceFromTheSun;
        this.distanceFromThePreviousPlanet = distanceFromThePreviousPlanet;
        this.distanceToTheSun = distanceToTheSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
    }

    public String getNextPlanet() {

        return nextPlanet;
    }
}
