package at.juergenbergmann.lotto;

import java.util.HashSet;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> gezogen = new HashSet<>();
		Random rnd = new Random();
		Integer zahl;
		
		for(Integer i=0; i<12; i++) {
			for(Integer j=0; j<6; j++) {
				do {
					zahl = rnd.nextInt(45) + 1;
				}
				while(!gezogen.add(zahl));
			}
			
			for(Integer k : gezogen) {
				System.out.print(k + " ");
			}
			System.out.println();
			gezogen.clear();
		}
	}

}
