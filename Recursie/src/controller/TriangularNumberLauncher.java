package controller;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Calculate triangular numbers both iteratively and recursively
 */
public class TriangularNumberLauncher {

    public static void main(String[] args) {
        System.out.println(recursiveTriangleNumber(4));
    }

    public static int triangleNumber(int height) {
        int triangleNumber = 0;

        for (int layer = 1; layer <= height; layer++) {
            triangleNumber += layer;
        }

        return triangleNumber;
    }

    public static int recursiveTriangleNumber(int height) {
        if (height < 0) {
            throw new IllegalArgumentException("Triangle numbers for negative heights are undefined.");
        } else if (height == 0) {
            return 0;
        }

        return height + recursiveTriangleNumber(height - 1);
    }
}
