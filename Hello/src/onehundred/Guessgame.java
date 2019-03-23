package onehundred;
import java.util.*;  


public class Guessgame {
	public static void main(String[] args) {   
	     int num1=0,num2=0;  
	     Scanner input=new Scanner(System.in); 
	     while (true)  
	     {  
	        int computer= (int) (Math.random()*3); 	           
	        System.out.print("scissor (0), rock (1), paper (2):");  
	        int user=input.nextInt();   
	        if (user> 2 || user < 0) {
	        	System.out.println("Your input is invalid!");
	        	continue;
	        }
	        	 
	        System.out.print("The Computer is ");  
	        switch(computer)                         
	        {  
	        case 0:  
	             System.out.print("scissor. ");break;  
	        case 1:  
	             System.out.print("rock.");break;  
	        case 2:  
	             System.out.print("paper.");break;
	        }  
	        switch(user)  
	        {  
	        case 0:  
	             System.out.print(" You are scissor.");break;  
	        case 1:  
	             System.out.print(" You are rock. ");break;  
	        case 2:  
	             System.out.print(" You are paper. ");break;
	        }    
	        if (computer == user)  
	        	System.out.println("too. It is a draw");  
	        else if (user== ++ computer ||(computer == 2 && user ==0))
	        {  
	        	System.out.println("You won");  
	        	num2++;  
	        }  
	        else  
	        {  
	        	System.out.println("computer won");  
	        	num1++;  
	        }  
	        if ((num1>=2)||(num2>=2))//anyone who win twice first will win the game 
	        {  
	             break;
	        }  
	    }
	     input.close();
	     System.out.println("Game over");
	     System.out.println((num1>num2)?"computer win":"you win");
	    }
}
