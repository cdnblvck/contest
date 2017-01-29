package battledevRegionJob;

import java.util.ArrayList;
import java.util.List;

public class InterfaceRegionJobMarsImpl implements RegionJobMars2016 {
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
	public int banderole(List<Poteau> poteaux) {
		ArrayList<Integer> listes = new ArrayList<>();
		for (int i = 0; i < poteaux.size(); i++) {
			if (!listes.contains(poteaux.get(i))) {
				listes.add(poteaux.get(i).getHauteur());
			} else {
				int pos[] = new int[poteaux.size()];
				pos[i] = poteaux.get(i).getHauteur();
			}
		}

		// TODO Auto-generated method stub
		return 0;
	}

}
