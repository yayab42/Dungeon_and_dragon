package utils;

import java.util.Random;
//Fonctions utiles

/**
 * Fonctions utilesw
 */
public final class Utils {
    /**
     * fonction random entre deux valeur
     * @param min
     * @param max
     * @return
     */
    //définition d'une fonction random pour points de vie
    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

}
