package cases;
import characters.Character;
import enemies.Enemy;
import cases.PlayerCase;
import java.util.Scanner;


public class EnemyCase extends Case{
    Enemy enemy;

    @Override
    public void deploy(Character hero) {
        System.out.println("Vous entrez dans une pièce dans laquelle se trouve un enemie, c'est un " + enemy.getName() + "!!");
        System.out.println("Un terrible combat s'engage ...");
        while(enemy.getHealth()>0){
        enemy.setHealth(enemy.getHealth()-hero.getStrength());
        System.out.println("Vous infligez " + hero.getStrength() + " de dégats !");
        if(enemy.getHealth()>0){
            hero.setHealth(hero.getHealth()- enemy.getStrength());
            System.out.println(enemy.getName() + "Vous inflige " + enemy.getStrength() + " de dégats !");
            System.out.println("Le combat semble difficile, voulez vous fuir ou continuer le combat ?  fuir/continuer");
            Scanner fuir = new Scanner(System.in);
            String playerEscape = fuir.nextLine();
            if(playerEscape.equals("fuir")){

            }
        }
        }

        if(hero.getHealth()>0 && enemy.getHealth()<=0){
            System.out.println("Vous avez gagné le combat !");
            System.out.println("Vos points de vie : " + hero.getHealth());
        }
        else {
            System.out.println("Vous êtes mort dans d'attroces souffrances  CHEH");
        }
    }

    public EnemyCase(){

    }
    public EnemyCase(Enemy enemy){
        this.enemy= enemy;
    }
}
