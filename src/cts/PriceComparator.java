package cts.vrs;

import java.util.Comparator;

public class PriceComparator implements Comparator<Vehicle>{
	
	
	@Override
	public int compare(Vehicle v1, Vehicle v2) {
		return Double.compare(v1.getRentalPrice(), v2.getRentalPrice());
	}

}
