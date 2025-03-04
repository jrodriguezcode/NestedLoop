// Thanks to Bro Code and his video
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// nested loops = a loop inside of a loop
		
		Scanner in = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = in.nextInt();
		System.out.println("Enter # of columns: ");
		columns = in.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = in.next();
		
		for(int i = 1; i <= rows; i++) {
			System.out.println();
			for(int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}
		in.close();

	}

}
