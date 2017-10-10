/* Application to use random number generation to create sentences
 * 
 *   using 4 arrays named article,noun,verb, preposition to store the given Strings
 *   
 *   Create a sentence in the following order: article,noun,verb,preposition,article,noun
 *   
 *   the application has to generate and display 20 sentences
 *   
 * 
 */

package org.smaniulations;

import java.lang.Math;
import java.lang.Character;


public class RandomSentences {
	public static void main(String[] ar) {
		
        //Initializing String arrays article,noun,verb,prepo
		String[] article = { "the", "a", "one", "some","any" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] prepo = { "to", "from", "over", "under", "on" };
		
		int a_index, n_index, v_index, p_index, j;
		//'s' array is to store the 25 sentences
		String[] s = new String[25];
		
		//generating sentences by taking random positioned values from article,noun,verb,prepo,article and noun
		for (int i = 0; i < 25; i++) {
			s[i] = new String();
			//Math.random() is used to generate random number between 0 to 1
			a_index = (int) (4 * Math.random());
			n_index = (int) (4 * Math.random());
			v_index = (int) (4 * Math.random());
			p_index = (int) (4 * Math.random());

			s[i] = s[i] + article[a_index];
			s[i] = s[i] + " " + noun[n_index];
			s[i] = s[i] + " " + verb[v_index];
			s[i] = s[i] + " " + prepo[p_index];

			a_index = (int) (4 * Math.random());
			n_index = (int) (4 * Math.random());

			s[i] = s[i] + " " + article[a_index];
			s[i] = s[i] + " " + noun[n_index];
		}
		//printing randomly generated 25 sentences
		for (int i = 0; i < 25; i++) {
			System.out.print(Character.toUpperCase(s[i].charAt(0)));
			
			for (j = 1; j < s[i].length(); j++)
				System.out.print(s[i].charAt(j));
			System.out.println(".");
		}
	}
}