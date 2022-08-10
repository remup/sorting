package sorting;

public class Sorting {

	public static void main(String[] args) {
		
		//int arr[] = { 0, 2, 4, 5, 1 };
		int arr[] = { 0, 1, 1, 0, 0 };
		int n = arr.length;
		
		findDoubleSum(arr, n, 3);
		find_all_triplets(arr, n, 3);

		bubbleSort(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.println("bubble " + arr[i]);

		}
	}

	private static void bubbleSort(int[] arr, int n) {
		
		int temp = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	static void findDoubleSum(int arr[], int n, int sum) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				

				if (arr[i] + arr[j] == sum) {
					System.out.println("sum result " + arr[i] + " " + arr[j]);
				}
				
			}
		}
	}

	static void find_all_triplets(int arr[], int n, int sum) {
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == sum) {
						System.out.println("triplesum " + arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
	}

}
