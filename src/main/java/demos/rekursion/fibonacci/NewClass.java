/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos.rekursion.fibonacci;

/**
 * @author trainer
 */
public class NewClass {
    public int fibonacci(int num) {
        if (num == 1 || num == 2)
            return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
