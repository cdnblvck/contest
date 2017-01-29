package test;

import battledevRegionJob.RegionJobMarsImpl;

public class Testeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] poteaux ={ 9, 6, 1, 1 };
		RegionJobMarsImpl rjm = new RegionJobMarsImpl();
		System.out.println(rjm.banderole(poteaux));
	}

}
