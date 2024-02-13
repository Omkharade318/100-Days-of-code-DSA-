
public class Solution {

    //Approach 1: By sorting X-start in ascending order
	public int findMinArrowShots(int[][] points) { 

		int count = 1;

		Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

		int xEnd = points[0][1];

		for (int[] point : points) {

			if (point[0] <= xEnd) {
				xEnd = Math.min(xEnd, point[1]);
			} else {
				xEnd = point[1];
				count++;
			}

		}

		return count;

	}

    //Approach 2: By sorting X-end in descending order
	public int findMinArrowShots1(int[][] points) {

		int count = 1;

		Arrays.sort(points, (a, b) -> Integer.compare(b[1], a[1]));

		int xStart = points[0][0];

		for (int[] point : points) {

			if (point[1] < xStart) {
				xStart = point[0];
				count++;
			} else {
				xStart = Math.max(xStart, point[0]);
			}

		}
		return count;

	}

	public static void main(String[] args) {
		int[][] points1 = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
		int[][] points2 = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
		int[][] points3 = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
		int[][] points4 = { { -2147483646, -2147483645 }, { 2147483646, 2147483647 } };
		int[][] points5 = { { 3, 9 }, { 7, 12 }, { 3, 8 }, { 6, 8 }, { 9, 10 }, { 2, 9 }, { 0, 9 }, { 3, 9 }, { 0, 6 }, { 2, 8 } };
		
		Solution solution = new Solution();

		System.out.println(solution.findMinArrowShots(points1)); //2
		System.out.println(solution.findMinArrowShots(points2)); //4
		System.out.println(solution.findMinArrowShots(points3)); //2
		System.out.println(solution.findMinArrowShots(points4)); //2
		System.out.println(solution.findMinArrowShots(points5)); //2

	}

}
