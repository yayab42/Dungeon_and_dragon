package menu;

import characters.Magicien;
import characters.Warrior;

import java.util.Random;
import java.util.Scanner;


//Menu
public class menu {

    //définition d'une fonction random pour points de vie
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static void play() {
        System.out.println("Ok on joue");
    }

    public static void modify(){
        System.out.println("Il est encore temps de modifier ton nom : veux tu le modifier ? oui/non");
        Scanner modify = new Scanner(System.in);
        String nameModify = modify.nextLine();
        if(nameModify.equals("oui")){
            //setter
        }
        if(nameModify.equals("non")) {
            System.out.println("C'est parti !");
            play();
        }
        else{
            modify();
        }

    }
    public static void init() {
        //selection du nom
        System.out.println("Entrez votre Nom");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Vous avez saisi : " + userName);

        //selection de la classe
        System.out.println("Selectionnez votre classe : Guerrier ou Mage");
        Scanner userChar = new Scanner(System.in);
        String userChoice = userChar.nextLine();

        //vérification des choix utilisateur
        if (userChoice.equals("Guerrier")) {
            characters.Warrior hero = new Warrior(userName, 5, randInt(5, 10), "img"); //
            System.out.println("Vous avez choisi : " + userChoice);

            System.out.println("vos points de vies : " + hero.getHealth());
            System.out.println("Vos points de force : " + hero.getStrength());
        } else if (userChoice.equals("Mage")) {
            characters.Magicien hero = new Magicien(userName, "img", randInt(3, 6), randInt(8, 15));
            System.out.println("Vous avez choisi : " + userChoice);
            System.out.println("vos points de vies : " + hero.getHealth());
            System.out.println("Vos points de force : " + hero.getStrength());
        }

        //quitte le programme si choix = exit
        else if (userChoice.equals("exit")) {
            java.lang.System.exit(0);
        }

        //Quitte le programme si rien n'est fait
        else {
            System.out.println("Erreur, veuillez reessayer");
            init();
        }

    }

    //On propose de lancer le jeu
    public static void start() {
        System.out.println("Tapez 'start' pour jouer ou 'exit' pour quitter");
        Scanner start = new Scanner(System.in);
        String gameStart = start.nextLine();
        if (gameStart.equals("start")) {
            init();
            ready();
        } else if (gameStart.equals("exit")) {
            System.out.println("@+ gros !");
            java.lang.System.exit(0);
        } else {
            start();
        }
    }

    //On vérifie si le joueur est prêt
    public static void ready() {
        System.out.println("la partie va commencer êtes vous prêt ? oui/non");
        Scanner ready = new Scanner(System.in);
        String playerReady = ready.nextLine();
        if (playerReady.equals("oui")) {
                modify();

        } else if (playerReady.equals("non")) {
            System.out.println("Êtes vous sûr ? oui/non");
            Scanner sure = new Scanner(System.in);
            String playerSure = sure.nextLine();
            if (playerSure.equals("oui")) {
                java.lang.System.exit(0);
            } else {
                ready();
            }
        } else {
            System.out.println("Concentre toi gros");
            ready();
        }
    }

    //Entrée du programme
    public static void main(String[] args) {
        start();

    }


}

