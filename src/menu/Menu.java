package menu;
import game.Game;
import characters.Character;
import characters.Magicien;
import characters.Warrior;

import java.lang.reflect.Field;
import java.util.Scanner;

//Menu
public class Menu {

    private Scanner scanner;

    public Menu(){
        this.scanner = new Scanner(System.in);
    }




    public void modify(Character hero) {
        System.out.println("Il est encore temps de modifier ton nom : veux tu le modifier ? oui/non");
        //Scanner modify = new Scanner(System.in);
        String nameModify = this.scanner.nextLine();
        if (nameModify.equals("oui")) {
            //setter

            //Scanner nameMod = new Scanner(System.in);
            String mod = this.scanner.nextLine();
            hero.setName(mod);
        }
        if (nameModify.equals("non")) {
            System.out.println("C'est parti !");
            Game game = new Game(hero);
            game.play();
        } else {
            modify(hero);
        }

    }

    public Character init() {
        //selection du nom
        System.out.println("Entrez votre Nom");
        //Scanner sc = new Scanner(System.in);
        String userName = this.scanner.nextLine();
        System.out.println("Vous avez saisi : " + userName);

        //selection de la classe
        System.out.println("Selectionnez votre classe : Warrior ou Magicien");
        //Scanner userChar = new Scanner(System.in);
        String userChoice = this.scanner.nextLine();

        //vérification des choix utilisateur
        try {
            Class<?> currentHero = Class.forName("characters." + userChoice);
            Character hero = (Character) currentHero.newInstance();
            hero.setName(userName);
            /*Class<?> c =hero.getClass().getSuperclass();
            Field nameField = c.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(String.class, userName);
            nameField.setAccessible(false);*/
            System.out.println("Vous avez choisi : " + userChoice);
            System.out.println("Votre nom : " + hero.getName());
            System.out.println("vos points de vies : " + hero.getHealth());
            System.out.println("Vos points de force : " + hero.getStrength());
            return hero;
        } catch( Exception e ) {
            System.out.println("Cette classe n'existe pas !");
            //Quitte le programme si rien n'est fait
                init();

        }

        /*if (userChoice.equals("Guerrier")) {
            Character hero = new Warrior(userName); //
            System.out.println("Vous avez choisi : " + userChoice);
            System.out.println("vos points de vies : " + hero.getHealth());
            System.out.println("Vos points de force : " + hero.getStrength());
            return hero;
        } else if (userChoice.equals("Mage")) {
            Character hero = new Magicien(userName);
            System.out.println("Vous avez choisi : " + userChoice);
            System.out.println("vos points de vies : " + hero.getHealth());
            System.out.println("Vos points de force : " + hero.getStrength());
            return hero;
        }*/


        //quitte le programme si choix = exit
        if (userChoice.equals("exit")) {
            java.lang.System.exit(0);
        }


        return null;
    }

    //On propose de lancer le jeu
    public void start() {
        System.out.println("Tapez 'start' pour jouer ou 'exit' pour quitter");
        //Scanner start = new Scanner(System.in);
        String gameStart = this.scanner.nextLine();
        if (gameStart.equals("start")) {
            Character hero = init();
            ready(hero);
        } else if (gameStart.equals("exit")) {
            System.out.println("@+ gros !");
            java.lang.System.exit(0);
        } else {
            start();
        }
    }

    //On vérifie si le joueur est prêt
    public void ready(Character hero) {
        System.out.println("la partie va commencer êtes vous prêt ? oui/non");
        //Scanner ready = new Scanner(System.in);
        String playerReady = this.scanner.nextLine();
        if (playerReady.equals("oui")) {
            modify(hero);

        } else if (playerReady.equals("non")) {
            System.out.println("Êtes vous sûr ? oui/non");
           // Scanner sure = new Scanner(System.in);
            String playerSure = this.scanner.nextLine();
            if (playerSure.equals("oui")) {
                java.lang.System.exit(0);
            } else {
                ready(hero);
            }
        } else {
            System.out.println("Concentre toi gros");
            ready(hero);
        }
    }

}

