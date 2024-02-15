package authentication;

import java.util.Scanner;

public class Authentication {

	public static void main(String[] args) {
		
				 	String user, pass;
			        Scanner s = new Scanner(System.in); 
			        System.out.println("Enter user:");
			         user = s.nextLine();
			        System.out .println("enter pass:");
			        pass=s.nextLine();
			 
			        if(user.equals("user") && pass.equals("user"))
			        {
			            System.out.println("Authentication sucessfully "); 
			        }
			        else
			        {
			        	System.out.println("authentation failed");
			        }
			}

		


	}

