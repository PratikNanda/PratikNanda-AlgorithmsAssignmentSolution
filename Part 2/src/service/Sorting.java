package service;

public class Sorting {

	// Sorting in Ascending
	public void mergeSortAscending(double array[], int f, int l) {
		// f = first; l = last;
		if (f < l) {

			int mid = (f + l) / 2;
			mergeSortAscending(array, f, mid);
			mergeSortAscending(array, mid + 1, l);
			mergeAscending(array, f, mid, l);
		}
	}

	private static void mergeAscending(double[] array, int f, int mid, int l) {
		int n1 = mid - f + 1;
		int n2 = l - mid;
		double L[] = new double[n1]; // left Array
		double R[] = new double[n2]; // Right Array

		for (int i = 0; i < n1; i++) {
			L[i] = array[f + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = array[mid + 1 + i];
		}

		int i = 0, j = 0, k = f;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}

	}

	// Sorting in Descending
	public void mergeSortDescending(double array[], int f, int l) {
		// f = first; l = last;
		if (f < l) {

			int mid = (f + l) / 2;
			mergeSortDescending(array, f, mid);
			mergeSortDescending(array, mid + 1, l);
			mergeDescending(array, f, mid, l);

		}
	}

	private static void mergeDescending(double[] array, int f, int mid, int l) {
		int n1 = mid - f + 1;
		int n2 = l - mid;
		double L[] = new double[n1]; // left Array
		double R[] = new double[n2]; // Right Array

		for (int i = 0; i < n1; i++) {
			L[i] = array[f + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = array[mid + 1 + i];
		}

		int i = 0, j = 0, k = f;

		while (i < n1 && j < n2) {
			if (L[i] >= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}

	}

}
