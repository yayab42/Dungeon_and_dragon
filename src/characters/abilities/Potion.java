package characters.abilities;

public abstract class Potion {
    private int hp;
    private String name;


    public Potion(){

    }

    public Potion(int hp, String name) {
        this.hp = hp;
        this.name=name;
    }

    public int getHp(){
        return hp;
    }
}
