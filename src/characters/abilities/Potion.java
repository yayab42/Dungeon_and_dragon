package characters.abilities;

/**
 *Classe parente des potions
 */
public abstract class Potion {

    /**
     *Classe parente des potions
     */
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
