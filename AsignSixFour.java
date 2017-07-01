package Excehandling;

import java.util.Scanner;
//user defined exception created by extending the exception class
class NegativeAgeException extends Exception{
	
	//used to print the obect details 
	public String toString(){
		
		return "NegativeAgeException :please enter a valid age";
	}
}

//class that contain thes main method 
public class AsignSixFour {

	//main method
	public static void main(String[] args) throws NegativeAgeException {
		// TODO Auto-generated method stub
		
		//scanner class object created to take input from the user
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age :");
		
		try{
			int age =sc.nextInt();
			if(age < 0){
				throw new NegativeAgeException();
			}
			else
				System.out.println("You have entered a valid age");   //throws negative value exception
		}
		catch(NegativeAgeException ex){
			System.out.println(ex);
		}
		
	}

}
