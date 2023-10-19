public class Coffee {
    String name;
    float howMuchCoffee = 1.0f; // 1 = 100%

    Coffee(String name) {
        this.name = name;
    }

    void drink() {
        howMuchCoffee -= 0.2f;
        System.out.println("It has been drunk!");
        System.out.println("Total coffee (%): " + (howMuchCoffee * 100));
    }

    void spill() {
        howMuchCoffee -= 0.05f;
        System.out.println("It was spilled/spilt!");
        System.out.println("Total coffee (%): " + (howMuchCoffee * 100));
    }
}
