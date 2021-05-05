package enemies;

public abstract class Enemy {
    String name;
    int health;
    int strength;
    String image;

    public Enemy() {
    }

    public Enemy(String name) {
        this.name = name;
    }

    public Enemy(String name, int health, int strength, String image) {
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
    public void setName(String name ) {
        this.name = name;

    }

    public String getName(){

        return name;
    }

    public void setHealth(int health){
        this.health = health;
    }
}
