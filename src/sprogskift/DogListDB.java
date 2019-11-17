package sprogskift;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DogListDB implements DogListI{	
	ArrayList<Dog> dogList;

	public DogListDB(String dbname) { 
		dogList = dogList(dbname);
	}
	
	@Override
	public ArrayList<Dog> dogList (String dbname){ 
		dogList = new ArrayList<>();
		return dogList;
	}

	public void printList(int numofdogs) {
		for (int i = 0;i<numofdogs;i++) {
			System.out.println(dogList.get(i));
		}
	}
	
}
