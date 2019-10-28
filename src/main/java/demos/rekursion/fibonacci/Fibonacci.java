/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos.rekursion.fibonacci;

/**
 * @author trainer
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass obj = new NewClass();
        for (int i = 1; i <= 20; i++) {
            System.out.print(obj.fibonacci(i) + " ");
        }

    }

}
