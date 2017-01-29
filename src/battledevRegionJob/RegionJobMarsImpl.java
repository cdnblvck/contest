package battledevRegionJob;

import java.util.ArrayList;
import java.util.List;

public class RegionJobMarsImpl implements RegionJobMars2016 {
	public int longMot(int n, List<String> dico) {
		int plusLong = Integer.MIN_VALUE;
		String mots = "";
		for (int i = 0; i < n; i++) {
			if (dico.get(i).length() > plusLong) {
				plusLong = dico.get(i).length();
				mots = dico.get(i);
			}
		}
		return mots.length();
	}

	public int surveillance(float from_lat, float from_lng, float to_lat, float to_lng, List<Personne> personnes) {
		for (int i = 0; i < personnes.size(); i++) {
			if ((personnes.get(i).lat < from_lat && personnes.get(i).lng < from_lng)
					&& (personnes.get(i).lat > to_lat && personnes.get(i).lng > to_lng)) {
				personnes.remove(i);
			}
		}
		return personnes.size();
	}

	@Override
	public int banderole(int[] poteaux) {
		List<Integer> idem = new ArrayList<>();
		int dif = 0;
		int retour = 0;
		int p[] = new int[poteaux.length];
		for (int i = 0; i < poteaux.length - 1; i++) {
			if (!idem.contains(poteaux[i])) {
				idem.add(poteaux[i]);
				retour += poteaux[i];
			} else {
				if (idem.size() >= 2) {
					for (int j = 0; j < idem.size(); j++) {
						
					}
				} else {
					p[dif] = i;
				}
			}
		}
		dif = calculDif(p);
		// TODO Auto-generated method stub
		return retour + dif;
	}

	public static int calculDif(int[] t) {
		int dif = 0;
		if (t.length == 0)
			dif = 0;
		else
			for (int i = 1; i < t.length - 1; i++) {
				dif = t[i] - t[i - 1];
			}
		return dif;
	}
}
