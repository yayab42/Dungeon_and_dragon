package characters;

import characters.abilities.Weapon;

//Warriors
public class Warrior extends Character {

    private Weapon weapon;
    public Warrior(Weapon weapon) {

        super();
        this.weapon = weapon;
    }

    public Warrior(String name, Weapon weapon) {

        super(name);
        this.weapon = weapon;
    }
    public Warrior(String warriorName, int warriorHealth, int warriorStrength, String warriorImg) {
        super(warriorName, warriorHealth, warriorStrength, warriorImg);
    }
    public Warrior(String warriorName, int warriorHealth, int warriorStrength, String warriorImg, Weapon weapon) {
        super(warriorName, warriorHealth, warriorStrength, warriorImg);
        this.weapon =weapon;
    }
    public void setName(String name ) {
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public int setWeapon(){
        return weapon.getWeaponLevel();
    }
}




