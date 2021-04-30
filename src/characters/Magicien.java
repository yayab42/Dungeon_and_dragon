package characters;

//Casters
public class Magicien extends Character {

   private Spell spell;

    public Magicien() {

        super();
        this.spell = new Spell();
    }

    public Magicien(String name) {
        this.name = name;
        this.spell = new Spell();
    }

    public Magicien(String magicienName, String magicienImg, int magicienHealth, int magicienStrength) {
        super(magicienName, magicienHealth, magicienStrength, magicienImg);
        this.spell = new Spell();
    }
    public void setName(String name ) {
        this.name = name;

    }

    public String getName(){
        return name;
    }

}

