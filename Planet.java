public class Planet extends Time implements Asteroid{
    String name;
    int age;
    int weight;
    boolean habitableZone;

    public Planet(String name, int age, int weight, boolean habitableZone) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitableZone = habitableZone;
    }

    void suitableForLife() {
        if (habitableZone) {
            System.out.println("Планета - " + name + " придатна для життя");
        } else {
            System.out.println("Планета - " + name + " не придатна для життя");
        }
    }

    int cycleLife() {
        int result = 0;
        if (age < 3 && weight < 5) {
            result = (int) (7 + Math.random() * 15);
        } else if ((age > 3 && age < 7) && (weight > 5 && weight < 9)) {
            result = (int) (4 + Math.random() * 7);
        }
        return result;
    }

    @Override
    public void canAttack(int weight) {
        if(weight >= 2_000_000){
            System.out.println("Астероїд знищить все");
        }else {
            System.out.println("Якась частина залишиться цілою");
        }
    }

    @Override
    int obert(int cntObert) {
        return cntObert*365;
    }
}