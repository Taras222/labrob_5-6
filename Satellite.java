public class Satellite implements Asteroid{
    String name;
    int distanceFromPlanet;
    int brightness;

    public Satellite(String name, int distanceFromPlanet, int brightness) {
        this.name = name;
        this.distanceFromPlanet = distanceFromPlanet;
        this.brightness = brightness;
    }

    boolean tides() {
        boolean res;
        if (brightness < 70 && distanceFromPlanet < 200) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    void showTides() {
        if (tides()) {
            System.out.println("Потужність припливів висока");
        } else {
            System.out.println("Потужність припливів низька");
        }
    }

    @Override
    public void canAttack(int weight) {
        if(weight >= 1_000_000){
            System.out.println("Астероїд знищить все");
        }else {
            System.out.println("Якась частина залишиться цілою");
        }
    }
}