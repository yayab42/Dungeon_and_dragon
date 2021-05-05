package menu;

import cases.Case;
import cases.PlayerCase;
import characters.Character;
import characters.Magicien;
import characters.Warrior;
import cases.Board;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import exceptions.PersonnageHorsPlateauException;
import utils.Utils;

//Menu
public class Menu {

    private Scanner scanner;

    public Menu(){
        this.scanner = new Scanner(System.in);
    }

    //Lancement du jeu
    public void play(Character hero) {
        System.out.println(hero.getName());
        //int[] board = new int[64];
        PlayerCase playerCase = new PlayerCase(0);
        //int playerCase = 1;
        Board board = new Board();
        Collections.shuffle(board.getList(), new Random());
        while (playerCase.getCase() < board.getLength() && hero.getHealth()>0) {
            System.out.println("Tapez !roll pour lancer le dé");
            //Scanner rollDice = new Scanner(System.in);
            String roll = this.scanner.nextLine();
            int currentRoll;
            if (roll.equals("!roll")) {
                currentRoll = Utils.randInt(1, 6);
                System.out.println("Vous avez fait " + currentRoll);
                try {
                    playerCase.setCase(playerCase.getCase() + currentRoll);

                    if (playerCase.getCase() > board.getLength()) {
                        throw new PersonnageHorsPlateauException("erreur");
                    }
                } catch (PersonnageHorsPlateauException e) {
                    playerCase.setCase(board.getLength());

                }
                System.out.println("Vous vous trouvez sur la case " + playerCase.getCase() + "/64");
                Case currentCase = board.getCase(playerCase.getCase());
                currentCase.deploy(hero);
            }


        }
        System.out.println("Partie terminée !");
        System.out.println("Voulez vous recommencer ? oui/non");
        //Scanner retry = new Scanner(System.in);
        String playerRetry = this.scanner.nextLine();
        if (playerRetry.equals("oui")) {
            play(hero);
        } else if (playerRetry.equals("non")) {
            System.out.println("@+ gros");
            System.exit(0);
        }


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
            play(hero);
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
        System.out.println("Selectionnez votre classe : Guerrier ou Mage");
        //Scanner userChar = new Scanner(System.in);
        String userChoice = this.scanner.nextLine();

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

