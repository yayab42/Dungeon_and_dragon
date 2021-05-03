package characters.abilities;

import characters.abilities.Potion;

public class Grande_potion extends Potion {

    public Grande_potion(){
        super();
    }
    public Grande_potion(int hp, String name){
        this.hp = 5;
        this.name = "Grande potion de vie";
    }
    public int getHp(){
        return hp;
    }
}
