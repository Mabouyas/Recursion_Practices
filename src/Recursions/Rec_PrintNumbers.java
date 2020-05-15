package Recursions;
/*
Print numbers from num to 1
 */
public class Rec_PrintNumbers {
	public static void main(String[] args) {
		// 1 . Print numbers
		printNumbers(8);
		
		// 2 . cat eyes;
		System.out.println("Cat Eyes: " + catEyes(3));
	
		
	}
	
	
	public static void printNumbers(int num) {
		if (num == 0)
			return;
		else
			System.out.println(num);
		printNumbers(num - 1);
		
	}
	
	public static int catEyes(int cats) {
		if (cats == 0)
			return 0;
		else
			return 2 + catEyes(cats-1);
	}
}
