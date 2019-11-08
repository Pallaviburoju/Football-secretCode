package basic;

import java.util.Scanner;

public class SecretCode {
	
public static void main(String args[]){  
		
		String secretCode;
		char jumbled[];
		jumbled = new char[100];
		//taking length of jumbled array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of jumbled character array");
		int jumbledLength = sc.nextInt();
		//checking length is 5 to 9 or not
		if(jumbledLength > 4 && jumbledLength < 10) {
			//taking characters and storing in jumbled array
			System.out.println("Enter "+ jumbledLength+" characters");
			jumbled = sc.next().toCharArray();
			
			//printing jumbled array
				for(int a=0; a < jumbled.length; a++) {
					System.out.println(jumbled[a]);
				}
				//creating new char array of length given by user for storing original msg
				char originalMsg[] = new char[100];	
				
				//taking secret code from user(should contain only numbers)	
				System.out.println("Enter secret code");
				secretCode = sc.next();
			
					for(int j=0; j < secretCode.length();j++) {
						
						//converting char to int
						int num = Character.getNumericValue(secretCode.charAt(j));
						
						int s = secretCode.charAt(j);
						//to check whether secret code has numbers or not by comparing ascii values(for numbers 0 to 9 ascii range is 48 to 57)
						if( s > 47 && s < 58 ) {
							
							//This is also used to convert char to int
							 //int num = Integer.parseInt(String.valueOf(secretCode.charAt(j)));
							
							/*giving index of secret code by incrementing value in for loop and 
							assigning the value at that index to the jumbled char array as index 
							and retrieving value at that index and assigning it to originalMsg char array*/
							originalMsg[j] = jumbled[num];
							
						}
						else {
							System.out.println("Invalid secret code");
							System.exit(0);
						}
					}
					System.out.println(originalMsg);
			
		}
		else {
			System.out.println("Invalid Array size");
			System.exit(0);
		}
	}
}
