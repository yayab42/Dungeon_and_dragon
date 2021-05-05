package cases;

import characters.Character;
import characters.Magicien;
import characters.Warrior;
import characters.abilities.Spell;
import characters.abilities.Weapon;

public class SpellCase extends Case{
    Spell spell;

    @Override
    public void deploy(Character hero) {

        if (hero instanceof Magicien) {
            System.out.println("Vous trouvez un livre de magie sur le sol, il parle de " + spell.getSpellName() + "!");
            System.out.println("Vous êtes de type Mage et vous pouvez l'apprendre");
            System.out.println("Vous le lisez et obtenez + " + spell.getSpellLevel() + "points d'attaque !");
            hero.setStrength(hero.getStrength() + spell.getSpellLevel());
            System.out.println("Vos points d'attaque : " + hero.getStrength());
        } else {
            System.out.println("Vous trouvez un livre de magie sur le sol, il parle de " + spell.getSpellName() + "!");
            System.out.println("Vous n'êtes malheureusement pas de type Mage et ne savez pas comment vous en servir, dépité, vous laissez le livre avant de repartir");
        }
    }

    public SpellCase(Spell spell){
        this.spell = spell;
    }
}
