package characters;


import characters.abilities.Weapon;
import utils.Utils;

/**
 *Classe qui représente un Guerrier et utilisation des constructeurs de la classe parente afin de donner des valeurs de vie et de force propres au guerrier
 */
public class Warrior extends Character {



    public Warrior() {

        super("" ,5, Utils.randInt(5, 10), "img", "Guerrier");
    }


    public Warrior(String name) {

        super(name ,5, Utils.randInt(5, 10), "img", "Guerrier");
    }

    public Warrior(String warriorName, int warriorHealth, int warriorStrength, String warriorImg, String warriorType) {
        super(warriorName, warriorHealth, warriorStrength, warriorImg, warriorType);
    }

    public Warrior(String warriorName, int warriorHealth, int warriorStrength, String warriorImg, Weapon weapon, String warriorType) {
        super(warriorName, warriorHealth, warriorStrength, warriorImg, warriorType);
    }


}



