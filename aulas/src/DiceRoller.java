import java.util.Random;

public class DiceRoller {
    Random random;

    DiceRoller() {
        this.random = new Random();
    }

    void roll() {
        System.out.println(
            "Dice face: " + this.random.nextInt(6) + 1
        );
    }
}
