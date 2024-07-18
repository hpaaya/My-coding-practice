package step1.class01;

public class Code05_BSNearRight {

	// 在arr上，找满足<=value的最右位置
	public static int nearestIndex(int[] arr, int value) {
		int L = 0;
		int R = arr.length - 1;
		int index = -1;

		while (L <= R) {
			int mid = (L + R) / 2;
			if (arr[mid] <= value) {
				index = mid;
				L = mid + 1;
			} else {
				R = mid - 1;
			}
		}

		return index;
	}

	public static void main(String[] args) {
	}

}
