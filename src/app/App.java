package app;
import characters.Character;
import menu.Menu;
import connexion.DB;

/**
 * App
 */
public class App {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.start();
    }
}

