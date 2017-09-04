import java.util.ArrayList;

public class Dating {

	public String dates(String circle, int k) {
		StringBuilder sb = new StringBuilder(circle);
		ArrayList<String> collect = new ArrayList<>();
		StringBuilder marker = new StringBuilder(circle);
		marker.setCharAt((k - 1) % sb.length(), '*');
		while(sb.length() > 0) {
//			System.out.println("s " + sb);
//			System.out.println("m " + marker);
			int pos = marker.indexOf("*");
			marker.setCharAt(marker.indexOf("*"), '-');
			int toRem = -1;
			int ch = 1024;
			for(int i = 0; i < sb.length(); i++)
				if(i != pos && (Character.isUpperCase(sb.charAt(pos)) ^ Character.isUpperCase(sb.charAt(i))) 
								&& sb.charAt(i) < ch) {
					ch = sb.charAt(i);
					toRem = i;
				}
			
			if(toRem < 0)
				break;
			else {
				collect.add((char)sb.charAt(pos) + "" + (char)sb.charAt(toRem));
//				System.out.println("ans " + collect);
				int move = k;
				int ptr = pos;
				while(sb.length() > 2) {
					if(!(ptr == pos || ptr == toRem))
						move--;
					if(move == 0) break;
					ptr = (ptr + 1) % sb.length();
//					System.out.println("here");
				}
//				System.out.println("next pos " + pos);
				marker.setCharAt(ptr, '*');
				sb.deleteCharAt(Math.max(pos, toRem));
				sb.deleteCharAt(Math.min(pos, toRem));
				marker.deleteCharAt(Math.max(pos, toRem));
				marker.deleteCharAt(Math.min(pos, toRem));
				
			}
			
		}
		return String.join(" ", collect);
	}

}
