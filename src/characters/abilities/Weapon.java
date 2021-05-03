package characters.abilities;

public class Weapon {
    private String name;
    private int level;

    public Weapon() {

    }

    public Weapon(String name, int level){
        this.name = name;
        this.level =level;
    }

    public void setWeaponName(String name ) {
        this.name = name;
   
    }
    
    public void setWeaponLevel(int level){
        this.level = level;
    }
    public String getWeaponName(){
        return name;
    }
    public int getWeaponLevel(){
        return level;
    }


}