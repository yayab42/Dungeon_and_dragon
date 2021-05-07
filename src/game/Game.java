package game;
import menu.Menu;
import cases.Board;
import cases.Case;
import characters.Character;
import exceptions.PersonnageHorsPlateauException;
import utils.Utils;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner scanner;

    public Game(){
        this.scanner = new Scanner(System.in);
    }
    //Lancement du jeu
    public void play(Character hero) {
        System.out.println(hero.getName());
        Board board = new Board();
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
            play(hero);
        } else if (playerRetry.equals("non")) {
            System.out.println("@+ gros");
            System.exit(0);
        }


    }

}
