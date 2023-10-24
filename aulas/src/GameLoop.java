public class GameLoop {
    public static void main(String[] args) {
        Scene gameScene = new GameScene();
        SceneManager.getInstance();
        SceneManager.changeScene(gameScene);

        while (true) {
            SceneManager.getInstance().update();

            SceneManager.getInstance().render();
        }
    }
}
