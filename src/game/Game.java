package game;
import cases.Board;
import cases.Case;
import characters.Character;
import exceptions.PersonnageHorsPlateauException;
import utils.Utils;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *Objet  : Game responsable du déroulé du jeu
 */
public class Game {

    private Scanner scanner;
    private Board board;
    private Character hero;
    private int playerCase;
    public Game(){

       this.scanner = new Scanner(System.in);
    }
    //Lancement du jeu


    public Game(Character hero){
        this();
        this.hero = hero;
        this.board = new Board();
        this.playerCase = 1;
    }

    public Game(Board board, Character hero, int playerCase){
        this();
        this.board = board;
        this.hero = hero;
        this.playerCase = playerCase;
    }
    public void play() {

        System.out.println(hero.getName());
        Collections.shuffle(board.getList(), new Random());
        while (hero.getPlayerCase() < board.getLength() && hero.getHealth()>0) {
            System.out.println("Tapez !roll pour lancer le dé");
            //Scanner rollDice = new Scanner(System.in);
            String roll = this.scanner.nextLine();
            int currentRoll;
            if (roll.equals("!roll")) {
                currentRoll = Utils.randInt(1, 6);
                System.out.println("Vous avez fait " + currentRoll);
                try {
                    hero.setPlayerCase(hero.getPlayerCase() + currentRoll);

                    if (hero.getPlayerCase() > board.getLength()) {
                        throw new PersonnageHorsPlateauException("erreur");
                    }
                } catch (PersonnageHorsPlateauException e) {
                    hero.setPlayerCase(board.getLength());

                }
                System.out.println("Vous vous trouvez sur la case " + hero.getPlayerCase() + "/64");
                Case currentCase = board.getCase(hero.getPlayerCase());
                currentCase.deploy(hero);
            }


        }
        System.out.println("Partie terminée !");
        System.out.println("Voulez vous recommencer ? oui/non");
        //Scanner retry = new Scanner(System.in);
        String playerRetry = this.scanner.nextLine();
        if (playerRetry.equals("oui")) {
            hero.setPlayerCase(1);
            play();
        } else if (playerRetry.equals("non")) {
            System.out.println("@+ gros");
            System.exit(0);
        }


    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Character getHero() {
        return hero;
    }

    public void setHero(Character hero) {
        this.hero = hero;
    }

    public int getPlayerCase() {
        return playerCase;
    }

    public void setPlayerCase(int playerCase) {
        this.playerCase = playerCase;
    }
}
