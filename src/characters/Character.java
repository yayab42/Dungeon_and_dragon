package characters;

/**
 *Classe parente des personnages jouable
 */
public abstract class Character {


    private String name;
    private int health;
    private int strength;
    private String image;
    private String type;


    private int playerCase;

    public Character() {
        this.playerCase = 1;
        this.name = "";
        this.health = 0;
        this.strength = 0;
        this.image = "";
        this.type="";
    }

    public Character(String name) {
        this();
        this.name = name;
    }

    public Character(String name, int health, int strength, String image, String type) {
        this(name);
        this.health = health;
        this.strength = strength;
        this.image = image;
        this.type = type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
