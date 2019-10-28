/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos.rekursion.verknuepftelisterueckwaerts;

/**
 * @author trainer
 */
public class VerknuepfteListeRueckwaerts {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Node node1 = new Node(1, null);
		Node node2 = new Node(2, null);
		Node node3 = new Node(3, null);
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		new NewClass().printList(node1);
	}

}
