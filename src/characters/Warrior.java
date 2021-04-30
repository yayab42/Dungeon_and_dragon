package characters;

//Warriors
public class Warrior extends Character {

    private Weapon weapon = new Weapon();
    public Warrior() {

        super();
        this.weapon = new Weapon();
    }

    public Warrior(String name) {

        super(name);
        this.weapon = new Weapon();
    }

    public Warrior(String warriorName, int warriorHealth, int warriorStrength, String warriorImg) {
        super(warriorName, warriorHealth, warriorStrength, warriorImg);
        this.weapon = new Weapon();
    }
    public void setName(String name ) {
        this.name = name;

    }

    public String getName(){
        return name;
    }


}




