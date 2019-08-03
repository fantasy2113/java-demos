/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursion.ggt;

/**
 * @author trainer
 */
public class GGT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass obj = new NewClass();

        System.out.println(obj.ggt(50, 13));
        System.out.println(obj.ggt(13, 50));
        System.out.println(obj.ggt(15, 98765));
        System.out.println(obj.ggt(111, 113));
        System.out.println(obj.ggt(77, 154));
    }

}
