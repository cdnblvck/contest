package battledevRegionJob;

import java.util.List;

public interface RegionJobMars2016 {
	public int longMot(int n, List<String> dico);
	public int surveillance(float from_lat, float from_lng, float to_lat, float to_lng,List<Personne> personnes);
	public int banderole(int []poteaux);
}
