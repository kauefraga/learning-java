public class MenuScene extends Scene {

    @Override
    void Load() {
        System.out.println("Loading menu scene...");

        System.out.println("All the content of menu scene was loaded successfully");
    }

    @Override
    void Render() {
        System.out.println("Menu scene is rendering!");
    }

    @Override
    void Unload() {
        System.out.println("Menu scene was unloaded!");
    }

    @Override
    void Update() {
        System.out.println("Menu scene is updating.");
    }
}
