
public class BasicCalculator {

	
	public BasicCalculator(){
		
	}
	
		public int addMethod(int x, int y){
			return x+y;
		}
		
		public int subMethod(int x, int y) {
			return x-y;
		}
		
		public int multMethod(int x, int y){
			 return x*y;
		}
		 
		public double divMethod(double x, double y) {
			if (y==0) {
				 System.out.print("You cannot divide by ");
				 return y;
			 } else {
				 return x/y;
			 }
		}
		
	
		
		
	
}
