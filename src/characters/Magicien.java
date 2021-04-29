package characters;

//Casters
public class Magicien extends Character {

    public Magicien() {
        super();
    }

    public Magicien(String name) {
    }

    public Magicien(String magicienName, String magicienImg, int magicienHealth, int magicienStrength) {
        name = magicienName;
        health = magicienHealth;
        strength = magicienStrength;
        image = magicienImg;
    }
}

