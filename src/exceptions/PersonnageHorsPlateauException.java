package exceptions;

/**
 * Exception pour faire revenir sur le plateau un joueur qui quitterait le plateau
 */
    public class PersonnageHorsPlateauException extends Exception {
    /**
     *Exception personnage hors plateau
     * @param e
     */

    public PersonnageHorsPlateauException(String e) {
            super(e);
        }
    }

