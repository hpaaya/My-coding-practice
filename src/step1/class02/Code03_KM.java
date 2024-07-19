package step1.class02;

public class Code03_KM {

	// 数组中所有的数都出现了M次，只有一种数出现了K次
	// 1 <= K < M，空間複雜度O(1)
	// 返回这种数
	public static int km(int[] arr, int k, int m) {
		int[] help = new int[32];
		for (int num : arr) {
			for (int i = 0; i < 32; i++) {
				help[i] += (num >> i) & 1;
			}
		}

		int ans = 0;
		for (int i = 0; i < 32; i++) {
			help[i] %= m;
			if (help[i] != 0) {
				ans |= 1 << i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

	}

}
