package characters;

public abstract class Character {
    String name;
    int health;
    int strength;
    String image;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, int health, int strength, String image) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.image = image;

    }
    public int getHealth(){

        return health;
    }
    public int getStrength(){

        return strength;
    }

    public void setStrength(int strength){this.strength = strength;}
    public void setName(String name ) {
        this.name = name;

    }

    public void setHealth(int hp){
        this.health = hp;
    }

    public String getName(){

        return name;
    }
}
