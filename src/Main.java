package src;

public class Main {
    public static void main(String[] args) {
        CardRank cardNumbers = CardRank.valueOf("QUEEN");
        System.out.println(cardNumbers.getNumbers());

        SolarSystem solarSystem = SolarSystem.VENUS;
        System.out.println(solarSystem.getNextPlanet());
    }
}