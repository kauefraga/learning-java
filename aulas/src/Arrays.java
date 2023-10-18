public class Arrays {
    public static void main(String[] args) {
        String[] cars = { "Camaro", "Corvette", "Tesla" };

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        int[] numbers = new int[5];

        numbers[0] = 1;
        System.out.println(numbers[0]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Enhanced version
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
