package step1.class02;

public class Code01_Swap {
	// 不用額外變量交換兩個數，XOR

	public static void swap(int[] arr, int i, int j) {
		// arr[0] = arr[0] ^ arr[0];
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}

	public static void main(String[] args) {
		int a = 16;
		int b = 603;
		System.out.println(a);
		System.out.println(b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println(a);
		System.out.println(b);

		int[] arr = { 3, 1, 100 };
		int i = 0;
		int j = 0;

		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];

		System.out.println(arr[i] + " , " + arr[j]);
		System.out.println(arr[0]);
		System.out.println(arr[2]);

		swap(arr, 0, 0);

		System.out.println(arr[0]);
		System.out.println(arr[2]);
	}

}
