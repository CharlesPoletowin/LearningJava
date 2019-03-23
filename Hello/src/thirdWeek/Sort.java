package thirdWeek;
import java.util.Arrays;
import java.util.*;

public class Sort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);  
        System.out.println("please input the data in a line:");
        String s = sc.nextLine();
        String[] c = s.split("\\s+");
        int size = c.length;  
        int[] b =new int[size];  
        for (int m = 0; m < b.length; m++) {  
            b[m] = Integer.parseInt(c[m]);
        }  
        int temp=0;  
        for (int i = 0; i < b.length; i++) {  
            for (int j = 0; j < b.length-i-1; j++) {  
                if(b[j]>b[j+1]){  
                    temp=b[j];  
                    b[j]=b[j+1];  
                    b[j+1]=temp;  
                }  
            }  
        }  
        System.out.println("After sorted...");
        for(int n = 0; n < b.length ; n++){  
            System.out.print(b[n]+" ");   
        }
        System.out.println(" ");
        System.out.println("Please input the data you want to check:");
        int des=sc.nextInt();
        int low = 0;   
        int high = b.length-1;   
        while(low <= high) {   
            int middle = (low + high)/2;   
            if(des == b[middle]) { 
            	System.out.println(" i=");
            	System.out.printf("%d  ",middle);
                break;   
            }
            else if(des <b[middle]) {   
                high = middle - 1;   
            }
            else {   
                low = middle + 1;   
            }  
        }  
        if (low>high) {
        	System.out.println("Could not find the number!");
        } 
        sc.close();   
    } 
}
