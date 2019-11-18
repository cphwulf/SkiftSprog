/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprogskift;

import com.sun.javafx.scene.shape.PathUtils;

/**
 *
 * @author thor
 */
public class Node {
	Dog data;
	Node next;

	public Node(Dog data) {
		this.data = data;
	}

	public void setNext(Node node) {
		this.next = node;
	}
	public Node getNext() {
		return this.next;
	}
	public Dog getData() {
		return this.data;
	}
	
}
