/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos.rekursion.fakultaet;

/**
 * @author trainer
 */
public class NewClass {
    public int fak(int b) {
        if (b == 1) return 1;
        return b * fak(b - 1);

    }
}
