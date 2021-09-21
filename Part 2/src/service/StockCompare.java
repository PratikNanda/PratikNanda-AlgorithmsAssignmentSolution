package service;

public class StockCompare {

	// Calculates the number of Companies whose Stock Rose
	public void stockRose(boolean[] stockCmp, int length) {

		int count = 0;
		for (int i = 0; i < length; i++) {
			if (stockCmp[i] == true) {
				count++;
			}
		}
		System.out.println("Total no of companies whose stock price rose today : " + count);

	}

	// Calculates the number of companies whose stock Declined
	public void stockDecline(boolean[] stockCmp, int length) {

		int count = 0;
		for (int i = 0; i < length; i++) {
			if (stockCmp[i] == false) {
				count++;
			}
		}
		System.out.println("Total no of companies whose stock price declined today : " + count);

	}

}
