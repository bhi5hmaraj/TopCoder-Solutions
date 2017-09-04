import java.util.Arrays;

public class JumpyNum {
	
	static final int MAX_DIGIT = 12;
	static int digits[];
	static int memo[][][][];
	static int countJumpy(int idx , int last , int prefix , int started) {
		// System.out.println("idx " + idx + " last " + last + " pref " + prefix + " started " + started + " s " + str);
		if(idx == digits.length) {
			return 1;
		}
		else if(memo[idx][last][prefix][started] != -1)
			return memo[idx][last][prefix][started];
		else {
			int ways = 0;
			for(int d = 0; d < 10; d++) {
				if(started == 1 && prefix == 1 && Math.abs(d - last) >= 2 && d <= digits[idx]) {
					ways += countJumpy(idx + 1, d, d < digits[idx] ? 0 : 1, started);
				}
				else if(started == 1 && prefix == 0 && Math.abs(d - last) >= 2) {
					ways += countJumpy(idx + 1, d, prefix, started);
				}
				else if(started == 0 && prefix == 1 && d <= digits[idx]) {
					ways += countJumpy(idx + 1, d, d < digits[idx] ? 0 : 1, d > 0 ? 1 : 0);
				}
				else if(started == 0 && prefix == 0){
					ways += countJumpy(idx + 1, d, 0, d > 0 ? 1 : 0);
				}
			}
			return memo[idx][last][prefix][started] = ways;
		}
	}
	
	static int countJumpy(int N) {
		digits = String.valueOf(N).chars().map(Character::getNumericValue).toArray();
		memo = new int[MAX_DIGIT][10][2][2];
		for(int a[][][] : memo)
			for(int b[][] : a)
				for(int c[] : b)
					Arrays.fill(c, -1);
		return countJumpy(0, 0, 1, 0);
	}
	
	public int howMany(int low, int high) {
		return countJumpy(high) - countJumpy(low - 1);
	}

}
