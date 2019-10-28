/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos.rekursion.potenzrechnung;

/**
 * @author trainer
 */
public class NewClass {
    public double power(double x, int n) {
        double y;
        if (n == 0)
            return 1.0;
        y = power(x, n / 2);
        y = y * y;
        if (n % 2 == 0)
            return y;
        return x * y;

    }

}
