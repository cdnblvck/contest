package sogeContest;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author _DELEX
 *
 */
public class CashUsage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] billets = {500, 100, 50, 20, 10, 5};
		int amount = 15750;
		System.out.println(cashUsage(amount, billets));
	}
/**
 * Ne prends pas en compte les billets qui 
 * @param amount le solde du client 
 * @param billets la liste des coupures de billets sans le nombres de billets exacte dans le distributeur 
 * sinon used HashMap<CoupureBillet,NombreDispo> que des int et soustraire NombreDispo-=t/solde; if NombreDispo<=0 remove CoupureBillet
 * @return
 *
 */
	public static String cashUsage(int amount, int[] billets) {
		Map<Integer, Integer> bill = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
	//	int b=0;
		int i = 0;
		while (amount > 0) {
			int t = amount / billets[i];
			//System.out.println(i+"********"+amount+ " \nnombre de billet de "+billets[i]+" est "+t);
			if(t>0){
				bill.put(t, billets[i]);
				amount -= t * billets[i];	
			}
			//System.out.println(amount+" restant");
			i++;
		}
		//NavigableMap nmap= ((TreeMap<Integer, Integer>) bill).descendingMap();
		for (Map.Entry<Integer, Integer> e : bill.entrySet()) {
			int key = e.getKey();
			int value = e.getValue();
			sb.append(key).append("-").append(value).append("\t");
			//b+=key*value;
		}
		//sb.append(b);
		return sb.toString();
	}
}
