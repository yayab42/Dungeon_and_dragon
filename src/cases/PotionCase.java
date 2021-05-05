package cases;
import characters.Character;
import characters.abilities.Potion;
public class PotionCase extends Case{
    Potion potion;

    @Override
    public void deploy(Character hero) {
        System.out.println("Vous avancez dans une pièce dans laquelle une potion se trouve, vous la buvez et récupérez " + potion.getHp() + "HP !");
        hero.setHealth(hero.getHealth()+potion.getHp());
    }

    public PotionCase(){

    }

    public PotionCase(Potion potion){
        this.potion = potion;
    }
}
