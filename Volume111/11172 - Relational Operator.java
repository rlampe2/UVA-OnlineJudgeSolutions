import java.util.Scanner;

/**
 * This class is a solution to
 * ASM Problem 11172 - Relational Operator
 *
 * 10/22/2019
 *
 * @author rjlam
 *
 */


class Main {

	 public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 int numTests = scan.nextInt();

		 //Burn the endline character
		 scan.nextLine();


		 //actually process the input
		 for(int i = 0; i < numTests; i++) {
			 //Read in our two numbers
			 long a = scan.nextLong();
			 long b = scan.nextLong();
			 //burn the rest!
			 scan.nextLine();
			 char c = '_';

			 if(a < b) {
				 c = '<';
			 }else if(a > b){
				 c = '>';
			 }else {
				 c = '=';
			 }

			 //Print it:
			 System.out.printf("%c\n", c);
		 }

		 scan.close();


	}

}
