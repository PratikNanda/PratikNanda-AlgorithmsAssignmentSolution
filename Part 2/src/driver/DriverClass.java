package driver;

import service.*;
import java.util.Scanner;

public class DriverClass { // Main driver class
	public static void main(String[] args) {

		// creating classes for Services
		Sorting sort = new Sorting();
		StockCompare compare = new StockCompare();
		Searching search = new Searching();
		Scanner scanner = new Scanner(System.in);

		// taking the input for no of companies
		System.out.println("Enter the number of companies");
		int NoOfCompanies = scanner.nextInt();

		// declaring required arrays
		double stock[] = new double[NoOfCompanies];
		boolean stockCmp[] = new boolean[NoOfCompanies];

		// taking inputs for the required arrays
		for (int i = 0; i < NoOfCompanies; i++) {
			System.out.println("Enter current stock price of the company " + (i + 1));
			stock[i] = scanner.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday? ");
			stockCmp[i] = scanner.nextBoolean();
		}

		int choice; // declaring the choice

		do { // do while loop is used to display the services and perform

			System.out.println("\nEnter the operation that you want to perform\n"
					+ "1. Display the companies stock prices in ascending order\n"

					+ "2. Display the companies stock prices in descending order\n"
					+ "3. Display the total no of companies for which stock prices rose today\n"

					+ "4. Display the total no of companies for which stock prices declined today\n"
					+ "5. Search a specific stock price\n" + "6. press 0 or 6 to exit\n");

			System.out.println();
			choice = scanner.nextInt();
			switch (choice) {
			case 0: // Exit
				choice = 0;
				break;
			case 1: // Ascending
				sort.mergeSortAscending(stock, 0, stock.length - 1);
				System.out.println("Stock prices in ascending order are :");
				for (double x : stock) {
					System.out.print(x + " ");
				}
				System.out.println();
				break;
			case 2: // Descending
				sort.mergeSortDescending(stock, 0, stock.length - 1);
				System.out.println("Stock prices in descending order are :");
				for (double x : stock) {
					System.out.print(x + " ");
				}
				System.out.println();
				break;
			case 3: // Stock Rose today
				compare.stockRose(stockCmp, NoOfCompanies);
				break;
			case 4: // Stock Declined today
				compare.stockDecline(stockCmp, NoOfCompanies);
				break;
			case 5: // Searching the Stock
				System.out.println("enter the key: ");
				double key = scanner.nextDouble();
				int position = search.searchStock(stock, NoOfCompanies, key);
				if (position == -1) {
					System.out.println("Stock of value " + key + " is not present");
				} else {
					System.out.println("Stock of value " + key + " is present");
				}
				break;
			case 6:
				choice = 0;
				break;
			default:
				System.out.println("Please enter the number from given options");

			}
		} while (choice != 0);
		System.out.println("Exited Successfully!!!");

		scanner.close();

	}
}