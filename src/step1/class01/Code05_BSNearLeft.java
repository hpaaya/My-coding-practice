package step1.class01;

public class Code05_BSNearLeft {

	// 在arr上，找满足>=value的最左位置
	public static int nearestIndex(int[] arr, int value) {
		int L = 0;
		int R = arr.length - 1;
		int index = -1; // 紀錄最左的位置
		while (L <= R) { // 至少一個數
			int mid = (L + R) / 2;
			if (arr[mid] >= value) {
				index = mid;
				R = mid - 1;
			} else {
				L = mid + 1;
			}
		}
		return index;
	}

	public static void main(String[] args) {

	}

}
