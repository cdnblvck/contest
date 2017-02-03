package sogeContest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author _DELEX
 *
 */
public class PeakHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String heure = "8 16";
		List<String>hours=new ArrayList<>();
		hours.add(heure);
	//System.out.println(peakHours(1, hours));
	}
/*
	public static int peakHours(int n,List<String> h) {
		int count = 0;
		Map<Integer, Integer> peaks = new HashMap<>();
	//	String time[] = h.split(" ");
		int tm=0;
		for (int i = 8; i < 24; i++) {
			if (Integer.parseInt(time[0]) >= i || Integer.parseInt(time[1]) - 1 <= i) {
				count++;
			}
			peaks.put(i, count);
			count = 0;
		}
		for (Map.Entry<Integer, Integer> entry : peaks.entrySet()) {
			int key = entry.getKey();
			int tab = entry.getValue();
			if(count<tab){
				count=tab;
				tm=key;
			}
		}
		return tm;
	}*/

}
