package onehundred;
import java.util.*;

public class Onehundred {
	public static void main(String[] args) {
		int i=0,number=0;
		Scanner ie=new Scanner(System.in);
		while(i<=2) {
			try {
				number=ie.nextInt();
				if(number>0&&number<100) {
					i++;
					System.out.print("Successful input;counts ");
					System.out.printf("%d", i);
					System.out.println(" ");
				}
				else{
					System.out.println("the number you input is too big or too small!");
				}
			}
			catch(InputMismatchException inputMismatchException){
				System.out.println("your input is not digit!");
				ie.nextLine();
			}	
		}
		ie.close();
	}
}
