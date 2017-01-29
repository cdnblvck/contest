package test;

import java.util.ArrayList;
import java.util.List;

import battledevRegionJob.InterfaceRegionJobMarsImpl;

public class Testeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] poteaux ={ 9, 6, 1, 1 };
		InterfaceRegionJobMarsImpl rjm = new InterfaceRegionJobMarsImpl();
		System.out.println(rjm.banderole(poteaux));
	}

}
