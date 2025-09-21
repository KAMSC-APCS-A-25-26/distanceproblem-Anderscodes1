import java.util.Scanner;

public class DistanceMultiple {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// obtain number of runs
		System.out.print("How many times would you like to run the program?  ");
		int numRuns = sc.nextInt();
		System.out.println();
		
		for (int j=0; j<numRuns; j++)
		{
			// exclude parentheses, commas, etc...
			sc.useDelimiter("[(),\\s]+");
			
			// input coordinates
			System.out.print("Enter two coordinates (ex. (2, 4)):  ");
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			// find broken down values of distance formula
			int x = x2 - x1;
			int SquaredX = x * x;
			int y = y2 - y1;
			int SquaredY = y * y;
			
			// compute distance and output
			double Distance = Math.sqrt(SquaredX + SquaredY);
			System.out.println();
			System.out.println("The distance between the two points is " + Distance);
			System.out.println();
			System.out.println();
			
		}
	}
    }
}
