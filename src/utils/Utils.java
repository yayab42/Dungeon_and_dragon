package utils;

import java.util.Random;

public final class Utils {
    //définition d'une fonction random pour points de vie
    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

}
