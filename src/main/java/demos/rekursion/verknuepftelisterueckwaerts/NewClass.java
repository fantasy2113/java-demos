/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos.rekursion.verknuepftelisterueckwaerts;

/**
 * @author trainer
 */
public class NewClass {
	public void printList(Node n) {
		if (n != null) {

			printList(n.next);
			System.out.println(n.value + " ");
		}
	}

}
