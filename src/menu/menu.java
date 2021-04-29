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
            characters.Warrior hero = new Warrior(userName, 5, randInt(5,10), "img"); //
            System.out.println("Vous avez choisi : " + userChoice);

            System.out.println("vos points de vies : " + hero.getHealth());
            System.out.println("Vos points de force : " + hero.getStrength());
        }
        else if (userChoice.equals("Mage")){
            characters.Magicien hero = new Magicien(userName, "img", randInt(3, 6), randInt(8, 15));
            System.out.println("Vous avez choisi : " + userChoice);
            System.out.println("vos points de vies : " + hero.getHealth());
            System.out.println("Vos points de force : " + hero.getStrength());
        }

        //quitte le programme si choix = exit
        else if (userChoice.equals("exit")){
            java.lang.System.exit(0);
        }

        //Quitte le programme si rien n'est fait
        else {
            System.out.println("Erreur, veuillez reessayer");
            init();
        }

    }
    //Entrée du programme
    public static void main(String[] args) {
        init();

    }


}

