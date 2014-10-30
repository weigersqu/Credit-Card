import java.util.Scanner;
//create another array
// this next array will check the  numbers in the first array
//if the number is not greater then 10 when doubled, then put back in the array
//if the number IS greater then 10 when doubled, strip the last digit, double it, then stick it back into the array

public class CreditCard
	
	{
	static long [] myArray = new long [16];
	public static void main(String[] args)
		{
		Scanner userInput = new Scanner( System.in);
		
		long cardNum;
		System.out.println("Please enter your credit card number");
		cardNum = userInput.nextLong();
		
		for(int i = 0; i < 16; i++)
			{
		long strippedDigit = cardNum % 10;
		myArray [i] = strippedDigit;
		cardNum = cardNum / 10;
			}
		
				
				
		
			

		}

	}


// for loop 1-16
//    {
// if i % 2 = 0
//		newArray [i] = oldArray
// else 
//	  if oldArray -i X 2 < 10 
//			newArray [i] = oldArray X 2
//    else
//          strip the last digit, double it, then stick it back into the array
//    }