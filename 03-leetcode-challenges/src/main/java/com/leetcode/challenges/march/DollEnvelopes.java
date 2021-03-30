package com.leetcode.challenges.march;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DollEnvelopes {
	public int maxEnvelopes(int[][] envelopes) {
//		l'entrée c'est un matrice de n lignes et 2 colonnes
//		je calcule la surface d'un envelope 
//		je déclare un objet de type enveloppe qui a pour attributs son height et width ainsi son surface
//		j'initialise une liste des objets envelope et je la trie suivant le surface de l'objet
//		je parcours cette liste et je verifie la condition de height et width et j'incrémente un compteur
		if (envelopes == null || envelopes.length == 0) {
			return 0;
		}
		if (envelopes.length == 1) {
			return 1;
		}
		List<Envelope> tmpEnvelopes = new ArrayList<>();
		for (int i = 0; i < envelopes.length; i++) {
			Envelope env = new Envelope();
			int j = 0;
			while (j < 2) {
				if (j == 0) {
					env.width = envelopes[i][j];
				} else if (j == 1) {
					env.height = envelopes[i][j];
				}
				j++;
			}
			env.surface = env.height * env.width;
			tmpEnvelopes.add(env);
		}
		Collections.sort(tmpEnvelopes);
		int count = 1;
		Envelope firstEnv = tmpEnvelopes.get(0);
		for (int i = 1; i < tmpEnvelopes.size(); i++) {
			if (firstEnv.height < tmpEnvelopes.get(i).height && firstEnv.width < tmpEnvelopes.get(i).width) {
				count++;
				firstEnv = tmpEnvelopes.get(i);
			}
		}
		return count;
	}
}

class Envelope implements Comparable<Envelope> {
	int height;
	int width;
	int surface;

	@Override
	public int compareTo(Envelope otherEnv) {
		return Integer.compare(this.surface, otherEnv.surface);
	}
}
