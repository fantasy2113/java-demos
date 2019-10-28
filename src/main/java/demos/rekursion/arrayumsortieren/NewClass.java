/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos.rekursion.arrayumsortieren;

/**
 * @author trainer
 */
public class NewClass {
	public void reverse(int[] numbers) {
		if (numbers.length == 0)
			return;
		int[] a = new int[numbers.length - 1];
		for (int i = 0; i < numbers.length - 1; i++) {
			a[i] = numbers[i + 1];

		}
		reverse(a);
		System.out.print(numbers[0] + " ");

	}
}
