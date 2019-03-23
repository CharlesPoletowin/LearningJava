package onehundred;

public class Second {
	public static void main(String[] args ){
		int count=0;
		for(int i=3;i<100 & count<5;i=i+3){
			System.out.println(i);
			count++;
			if(count==5) {
				break;
			}
		}
	}
}
