package thirdWeek;

public class PrimeNumber {
	public static void main(String args[]) {
		for(int i=101;i<200;i=i+2) {
			boolean f=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					f=false;
					break;
				}
			}
			System.out.print(" "+i+" ");
		}
	}
}
