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

		Period p = Period.between(startDate, endDate);

		System.out.println();
		System.out.println("There are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays()
				+ " days from your start date to your end date.");

		scnr.close();
	}

}
