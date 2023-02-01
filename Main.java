public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("Kepler", 2, 4, true);
        Satellite satellite = new Satellite("Carme", 175, 65);
        Star star = new Star("Alpha Centavra", 430, 670);

        planet.suitableForLife();
        System.out.println("Планета " + planet.name + " буде жити ще " + planet.cycleLife() + " млрд. років");
        satellite.showTides();
        star.clasification();
        System.out.println("Зірка " + star.name + " буде світити ще " + star.starBright() + " млрд. років");
        satellite.canAttack(3_000_000);
        planet.canAttack(1_000_000);
        System.out.println(planet.obert(2)+" днів пройшло");
    }
}