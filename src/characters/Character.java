package characters;

public abstract class Character {
    String name;
    int health;
    int strength;
    String image;


    private int playerCase;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
        this.playerCase = 1;
    }

    public Character(String name, int health, int strength, String image) {
        this.playerCase = 1;
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

    public int getPlayerCase() {
        return playerCase;
    }

    public void setPlayerCase(int playerCase) {
        this.playerCase = playerCase;
    }
}
