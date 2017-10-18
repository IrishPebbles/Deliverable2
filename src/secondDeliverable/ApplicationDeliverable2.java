package secondDeliverable;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ApplicationDeliverable2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		LocalDate startDate = null;
		LocalDate endDate = null;

		/* User needs to input 2 dates so the program can determine the interval between them
		 * Once that data is obtained from the user it is checked to ensure it is a date and
		 * in the desired format. This process is repeated for both dates. */
		System.out.println("Please enter your Start Date in the format YYYY-MM-DD.");

		do {
			try {
				startDate = LocalDate.parse(scnr.nextLine());
			} catch (DateTimeParseException e) {
				System.out.println("Whoops! Please enter a date in the format YYYY-MM-DD");
			}
		} while (startDate == null);

		System.out.println();
		System.out.println("Please enter your End Date in the format YYYY-MM-DD.");

		do {
			try {
				endDate = LocalDate.parse(scnr.nextLine());
			} catch (DateTimeParseException e) {
				System.out.println("Whoops! Please enter a date in the format YYYY-MM-DD");
			}
		} while (endDate == null);
		
		/* Interval is determined here with a basic conversion. The output is formated to 
		 * one that is easily understandable to the user. */
		Period p = Period.between(startDate, endDate);

		System.out.println();
		System.out.println("There are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays()
				+ " days from your start date to your end date.");

		scnr.close();
	}

}
