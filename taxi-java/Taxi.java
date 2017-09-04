public class Taxi {

	public double maxDis(int maxX, int maxY, int taxiDis) {
		double max = -1;
		for(int i = 0; i <= 1_000_000; i++) {
			int j = taxiDis - i;
			if(i >= 0 && j >= 0 && i <= maxX && j <= maxY) 
				max = Math.max(max, Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2)));
		}
		return max;
	}

}
