package cases;
import characters.Character;
import enemies.Enemy;


public class EnemyCase extends Case{
    Enemy enemy;

    @Override
    public void deploy(Character hero) {
        System.out.println("Vous entrez dans une pièce dans laquelle se trouve un enemie, c'est un " + enemy.getName() + "!!");
        System.out.println("Un terrible combat s'engage ...");
        hero.setHealth(hero.getHealth()- enemy.getStrength());
        if(hero.getHealth()>0 && enemy.getHealth()>0){
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
