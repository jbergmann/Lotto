package at.juergenbergmann.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<Integer> gezogen = new HashSet<>();
		HashSet<Integer> gezogen = new HashSet<>();
		List<Integer> gezogenSorted;
		Random rnd = new Random();
		Boolean nochNichtGezogen;
		
		for(Integer i=0; i<12; i++) {
			for(Integer j=0; j<6; j++) {
				nochNichtGezogen = gezogen.add(rnd.nextInt(45) + 1);
				while(!nochNichtGezogen) {
					nochNichtGezogen = gezogen.add(rnd.nextInt(45) + 1);
				}
			}
			
			gezogenSorted = new ArrayList<>(gezogen);
			Collections.sort(gezogenSorted);
			
			for(Integer zahl : gezogenSorted) {
				System.out.print(zahl + " ");
			}
			System.out.println();
			gezogen.clear();
		}
	}

}
