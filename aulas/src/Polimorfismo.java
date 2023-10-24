public class Polimorfismo {
    public static void main(String[] args) {
        // capacidade de um objeto de se identificar como mais de um tipo

        GameScene gameScene = new GameScene();
        MenuScene menuScene = new MenuScene();

        Scene[] scenes = { gameScene, menuScene };

        for (Scene s : scenes) {
            s.Load();
            s.Update();
            s.Render();
            s.Unload();
        }
    }
}
