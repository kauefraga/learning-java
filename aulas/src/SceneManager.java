public class SceneManager {
    private static SceneManager instance;
    Scene currentScene;

    public void update() {
        currentScene.Update();
    }

    public void render() {
        currentScene.Render();
    }

    static SceneManager getInstance() {
        if (instance == null) instance = new SceneManager();
        return instance;
    }

    static void changeScene(Scene newScene) {
        if (instance.currentScene != null) instance.currentScene.Unload();

        newScene.Load();
        instance.currentScene = newScene;
    }
}
