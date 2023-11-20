package controller;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Calculate a base number to an exponent, both iteratively and recursively
 */
public class PowerLauncher {

    public static int iterativePower(int base, int exponent) {
        int power = 1;

        for (int i = 0; i < exponent; i++) {
            power *= base;
        }

        return power;
    }
}
