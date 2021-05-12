package cases;

import characters.abilities.*;
import enemies.Dragon;
import enemies.Enemy;
import enemies.Gobelin;
import enemies.Sorcier;
import java.util.ArrayList;

/**
 * On initialise 64 cases contenant chacune un des objets
 */
public class Board {
    /**
     * On set les attributs du tableau de jeu
     */
    ArrayList<Case> liste = new ArrayList<Case>();
    Enemy Dragon = new Dragon();
    Enemy gobelin = new Gobelin();
    Enemy Sorcier = new Sorcier();
    Spell Eclair = new Eclair();
    Spell BouleDeFeu = new Boule_de_feu();
    Weapon sword = new Sword();
    Weapon mace = new Mace();
    Potion potion = new Potion_Standard();
    Potion grandePotion = new Grande_potion();

    /**
     * Mise en place de chaque case indépendamment
     */
    public Board(){
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new EmptyCase());
        liste.add(new PotionCase(grandePotion));
        liste.add(new PotionCase(grandePotion));
        liste.add(new PotionCase(potion));
        liste.add(new PotionCase(potion));
        liste.add(new PotionCase(potion));
        liste.add(new PotionCase(potion));
        liste.add(new PotionCase(potion));
        liste.add(new PotionCase(potion));
        liste.add(new EnemyCase(Dragon));
        liste.add(new EnemyCase(Dragon));
        liste.add(new EnemyCase(Dragon));
        liste.add(new EnemyCase(Dragon));
        liste.add(new EnemyCase(gobelin));
        liste.add(new EnemyCase(gobelin));
        liste.add(new EnemyCase(gobelin));
        liste.add(new EnemyCase(gobelin));
        liste.add(new EnemyCase(gobelin));
        liste.add(new EnemyCase(gobelin));
        liste.add(new EnemyCase(gobelin));
        liste.add(new EnemyCase(gobelin));
        liste.add(new EnemyCase(gobelin));
        liste.add(new EnemyCase(gobelin));
        liste.add(new EnemyCase(Sorcier));
        liste.add(new EnemyCase(Sorcier));
        liste.add(new EnemyCase(Sorcier));
        liste.add(new EnemyCase(Sorcier));
        liste.add(new EnemyCase(Sorcier));
        liste.add(new EnemyCase(Sorcier));
        liste.add(new EnemyCase(Sorcier));
        liste.add(new EnemyCase(Sorcier));
        liste.add(new EnemyCase(Sorcier));
        liste.add(new EnemyCase(Sorcier));
        liste.add(new WeaponCase(sword));
        liste.add(new WeaponCase(sword));
        liste.add(new WeaponCase(sword));
        liste.add(new WeaponCase(sword));
        liste.add(new WeaponCase(mace));
        liste.add(new WeaponCase(mace));
        liste.add(new WeaponCase(mace));
        liste.add(new WeaponCase(mace));
        liste.add(new WeaponCase(mace));
        liste.add(new SpellCase(Eclair));
        liste.add(new SpellCase(Eclair));
        liste.add(new SpellCase(Eclair));
        liste.add(new SpellCase(Eclair));
        liste.add(new SpellCase(Eclair));
        liste.add(new SpellCase(BouleDeFeu));
        liste.add(new SpellCase(BouleDeFeu));
    }

    public Case getCase(int playerCase){
        return liste.get(playerCase-1);
    }
    public int getLength(){

        return liste.size();
    }

    public ArrayList<Case> getList(){return liste;}
}
