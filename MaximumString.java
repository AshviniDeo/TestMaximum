package bridgeLabz;

public class MaximumString {
	public static String compare(String x,String y ,String z) {
		 String max = null;
		 if(x.length() > y.length()) {
			 if(x.length() > z.length()) {
				 System.out.println(x);
				 max = x;
			 }else {
				 System.out.println(z);
				 max = z;
			 }
		 }else {
			 if(y.length() > z.length()) {
				 System.out.println(y);
				 max = y;
			 }else {
				 System.out.println(z);
				 max = z;
			 }
		 }
		 return max;
		 
	 }
}
