/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprogskift;

/**
 *
 * @author thor
 */
public class Dansk implements SprogI{

	public void printMenu() {
		System.out.println("Velkommen til hundeuddelingen");
		System.out.println("1) vis hundelisten");
		System.out.println("2) vælg hund");
		System.out.println("3) søg hund efter navn");
		System.out.println("4) Skift til engelsk");
		System.out.println("9) afslut programmet");
		System.out.println("Indstast valg: ");
	}
	public void printLang() {
		System.out.println("Skift sprog: ");
		System.out.println("1) Dansk");
		System.out.println("2) Engelsk");
	}
	
}
