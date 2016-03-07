package org.fool.test;

public class BinarySearch {

	public static int binarySearch(int[] nums, int num) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (num > nums[mid]) {
				low = mid + 1;
			} else if (num < nums[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] nums = { 12, 23, 34, 45, 56, 67, 77, 89, 90 };

		System.out.println(binarySearch(nums, 12));
		System.out.println(binarySearch(nums, 45));
		System.out.println(binarySearch(nums, 67));
		System.out.println(binarySearch(nums, 89));
		System.out.println(binarySearch(nums, 99));
	}
}
