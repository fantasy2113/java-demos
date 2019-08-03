/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursion.dezimalnachbinaer;

/**
 * @author trainer
 */
public class NewClass {
    public void printBinary(int b) {
        if (b > 0) {
            printBinary(b / 2);
            System.out.printf("%d", b % 2);
        }


    }

}
