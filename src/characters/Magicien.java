package characters;


import characters.abilities.Spell;
import utils.Utils;

/**
 *Classe qui représente un magicien et utilisation des constructeurs de la classe parente afin de donner des valeurs de vie et de force propres au magicien
 */
public class Magicien extends Character {

    private Spell spell;

    public Magicien() {
        super("",Utils.randInt(3, 6), Utils.randInt(8, 15),"img" );
        this.spell = new Spell();
    }

    public Magicien(String name) {
       super(name,Utils.randInt(3, 6), Utils.randInt(8, 15),"img" );
        this.spell = new Spell();

    }

    public Magicien(String magicienName, String magicienImg, int magicienHealth, int magicienStrength) {
        super(magicienName, magicienHealth, magicienStrength, magicienImg);
        this.spell = new Spell();
    }

}

