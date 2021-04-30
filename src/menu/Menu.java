package menu;

import characters.Character;
import characters.Magicien;
import characters.Warrior;

import java.util.Scanner;

import exceptions.PersonnageHorsPlateauException;
import utils.Utils;

//Menu
public class Menu {


    //Lancement du jeu
    public void play(Character hero) {
        System.out.println(hero.getName());
        int[] board = new int[64];
        int playerCase = 1;
        while (playerCase < board.length) {
            System.out.println("Tapez !roll pour lancer le dé");
            Scanner rollDice = new Scanner(System.in);
            String roll = rollDice.nextLine();
            int currentRoll;
            if (roll.equals("!roll")) {
                currentRoll = Utils.randInt(1, 6);
                System.out.println("Vous avez fait " + currentRoll);
                try {
                    playerCase = playerCase + currentRoll;

                    if (playerCase > board.length) {
                        throw new PersonnageHorsPlateauException("erreur");
                    }
                } catch (PersonnageHorsPlateauException e) {
                    playerCase = board.length;
                }
                System.out.println("Vous vous trouvez sur la case " + playerCase + "/64");
            }


        }
        System.out.println("Partie terminée !");
        System.out.println("Voulez vous recommencer ? oui/non");
        Scanner retry = new Scanner(System.in);
        String playerRetry = retry.nextLine();
        if (playerRetry.equals("oui")) {
            play(hero);
        } else if (playerRetry.equals("non")) {
            System.out.println("@+ gros");
            System.exit(0);
        }

    }

    public void modify(Character hero) {
        System.out.println("Il est encore temps de modifier ton nom : veux tu le modifier ? oui/non");
        Scanner modify = new Scanner(System.in);
        String nameModify = modify.nextLine();
        if (nameModify.equals("oui")) {
            //setter

            Scanner nameMod = new Scanner(System.in);
            String mod = nameMod.nextLine();
            hero.setName(mod);
        }
        if (nameModify.equals("non")) {
            System.out.println("C'est parti !");
            play(hero);
        } else {
            modify(hero);
        }

    }

    public Character init() {
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
            Character hero = new Warrior(userName, 5, Utils.randInt(5, 10), "img"); //
            System.out.println("Vous avez choisi : " + userChoice);
            System.out.println("vos points de vies : " + hero.getHealth());
            System.out.println("Vos points de force : " + hero.getStrength());
            return hero;
        } else if (userChoice.equals("Mage")) {
            Character hero = new Magicien(userName, "img", Utils.randInt(3, 6), Utils.randInt(8, 15));
            System.out.println("Vous avez choisi : " + userChoice);
            System.out.println("vos points de vies : " + hero.getHealth());
            System.out.println("Vos points de force : " + hero.getStrength());
            return hero;

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
        return null;
    }

    //On propose de lancer le jeu
    public void start() {
        System.out.println("Tapez 'start' pour jouer ou 'exit' pour quitter");
        Scanner start = new Scanner(System.in);
        String gameStart = start.nextLine();
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
        Scanner ready = new Scanner(System.in);
        String playerReady = ready.nextLine();
        if (playerReady.equals("oui")) {
            modify(hero);

        } else if (playerReady.equals("non")) {
            System.out.println("Êtes vous sûr ? oui/non");
            Scanner sure = new Scanner(System.in);
            String playerSure = sure.nextLine();
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

