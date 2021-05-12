package characters.abilities;

/**
 *Classe parente des sorts
 */
public class Spell {

    /**
     *Classe parente des sorts
     */
   private String name;
   private int level;

    public Spell() {

    }

    public Spell (String name, int level){
        this.name = name;
        this.level =level;
    }
    public void setSpellName(String name) {
        this.name = name;
    }

    public void setSpellLevel(int level){
        this.level = level;
    }
    public String getSpellName(){
        return name;
    }
    public int getSpellLevel(){
        return level;
    }
}