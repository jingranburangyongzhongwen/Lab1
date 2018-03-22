package trangle;

public class testTrangle {
	public String trangle(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return "not a trangle";
		} else {
			int max = a;
			int min = b + c;
			if (b > max) {
				max = b;
				min = a + c;
			}
			if (c > max) {
				max = c;
				min = a + b;
			}
			if (min <= max) {// 最小两边之和不大于第三边
				return "not a trangle";
			}
			if (a == b || b == c || a == c) {
				if (a == b && b == c) {
					return "equilateral";
				} else {
					return "isosceles";
				}
			} else {
				return "scalene";
			}
		}
	}
}
