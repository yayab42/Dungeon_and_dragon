package cases;
import characters.Character;
import characters.Warrior;
import characters.abilities.Weapon;

/**
 * Case Weapon
 */
public class WeaponCase extends Case {
    /**
     *Action de la case Arme
     */
    private Weapon weapon;
    @Override
    public void deploy(Character hero) {
        if (hero instanceof Warrior) {
            System.out.println("Vous trouvez une arme sur le sol, c'est une " + weapon.getWeaponName() + "!");
            System.out.println("Vous êtes de type Guerrier et pouvez vous en servir");
            System.out.println("Vous la ramassez et obtenez + " + weapon.getWeaponLevel() + "points d'attaque !");
            hero.setStrength(hero.getStrength() + weapon.getWeaponLevel());
            System.out.println("Vos points d'attaque : " + hero.getStrength());
        } else {
            System.out.println("Vous trouvez une arme sur le sol, c'est une " + weapon.getWeaponName() + "!");
            System.out.println("Vous n'êtes malheureusement pas de type Guerrier et ne savez pas comment vous en servir, dépité, vous laissez l'arme avant de repartir");
        }
    }

    public WeaponCase() {

    }

    public WeaponCase(Weapon weapon) {
        this.weapon = weapon;
    }

}
