package characters.abilities;

public class Potion_Standard extends Potion {
    public Potion_Standard(){
        super();
    }
    public Potion_Standard(int hp, String name){
        this.hp = 2;
        this.name = "Potion Standard";
    }
    public int getHp(){
        return hp;
    }
}
