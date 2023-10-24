public class GameScene extends Scene {
    @Override
    void Load() {
        System.out.println("Loading game scene...");

        System.out.println("All the content of game scene was loaded successfully");
    }

    @Override
    void Render() {
        System.out.println("Game scene is rendering!");
    }

    @Override
    void Unload() {
        System.out.println("Game scene was unloaded!");
    }

    @Override
    void Update() {
        System.out.println("Game scene is updating.");
    }
}
