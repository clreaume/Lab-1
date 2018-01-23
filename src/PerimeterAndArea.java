import java.util.Scanner;

public class PerimeterAndArea {

	public static void main(String[] args) {
		String ask;
		do {

			System.out.print("Hi. Which unit of measurement will we be using today? ");
			Scanner input = new Scanner(System.in); 
			String unit = input.nextLine(); 

			System.out.printf("Enter the classroom's length, width and height in %s, each separated by a space: ", unit);
			String measurements = input.nextLine();

			String[] arrayOfMeasurements = measurements.split(" "); // splits string input into list of strings

			// System.out.println(listOfMeasurements); can't print out an array?
			
			//Enhanced for loop to print out items in array
			// for(String i:arrayOfMeasurements) {
			// System.out.println(i);
			// }

			String lengthStr = arrayOfMeasurements[0];
			// System.out.println(lengthStr);
			double length = Double.parseDouble(lengthStr);

			String widthStr = arrayOfMeasurements[1];
			// System.out.println(widthStr);
			double width = Double.parseDouble(widthStr);

			String heightStr = arrayOfMeasurements[2];
			double height = Double.parseDouble(heightStr);

			double area = length * width;
			System.out.printf("Area is %f %s", area, unit);
			System.out.println();

			double perimeter = 2 * length + 2 * width;
			System.out.printf("Perimeter is %f %s", perimeter, unit);
			System.out.println();

			double volume = length * width * height;
			System.out.printf("Volume is %f %s", volume, unit);
			System.out.println();

			System.out.print("Would you like to measure another room? Enter Y or N: ");
			ask = input.next(); // .nextLine() doesn't work

		}

		while (ask.equals("Y"));

	}

}
