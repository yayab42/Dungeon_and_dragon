package cases;
import characters.Character;

/**
 * Case vide
 */
public class EmptyCase implements Case {
    /**
     *
     * @param hero Action de la case video
     */
    @Override
    public void deploy(Character hero) {
        System.out.println("Vous entrez dans une pièce vide, il ne se passe rien, une odeur désagréable vous chatouille le nez, c'est sûrement votre haleine.");

    }

    public EmptyCase(){

    }
}
