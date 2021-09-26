package bridgeLabz;

public class MaximumFloat {
	public static float compare(float x,float y ,float z) {
		 float max = 0;
		 if(x != 0 && x > y) {
			 if(x > z) {
				 System.out.println(x);
				 max = x;
			 }else {
				 System.out.println(z);
				 max = z;
			 }
		 }else {
			 if(y> z) {
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
