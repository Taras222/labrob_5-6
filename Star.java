public class Star {
    String name;
    int temperature;
    int weight;

    public Star(String name, int temperature, int weight) {
        this.name = name;
        this.temperature = temperature;
        this.weight = weight;
    }

    int starBright() {
        int res = 0;
        if (temperature > 200 && weight < 500) {
            res = 2;
        } else if (temperature > 400 && weight < 1500) {
            res = 4;
        } else if (temperature > 600 && weight < 2000) {
            res = 10;
        }
        return res;
    }

    void clasification() {
        if (temperature < 500) {
            System.out.println("Червоний гігант");
        } else if (temperature > 500 && temperature < 1500) {
            System.out.println("Звичайна жовта зірка");
        } else if (temperature > 1500 && temperature < 3000) {
            System.out.println("Білий карлик");
        } else {
            System.out.println("Чорна діра");
        }
    }
}
