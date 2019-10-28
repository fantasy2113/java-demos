/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos.rekursion.ggt;

/**
 * @author trainer
 */
public class NewClass {
	public int ggt(int a, int b) {
		int temp = a;
		if (a < b) {
			a = b;
			b = temp;
		}
		if (b == 0)
			return a;
		return ggt(b, (a % b));
	}

}
