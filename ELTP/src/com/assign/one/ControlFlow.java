package com.assign.one;

public class ControlFlow {

	public static boolean isLeap(int y)

	{
		if (y % 4 == 0) {
			if (y % 100 == 0) {
				if (y % 400 == 0) {
					return true;
				}

				return false;
			}
			return true;
		}
		return false;
	}

	public static boolean isOdd(int n) {
		if (n % 2 == 0)
			return false;
		else
			return true;
	}

	public static boolean isValid(String date) {
		int[] leap = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] nLeap = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] d = date.split("-");
		int dd = Integer.parseInt(d[0]);
		int mm = Integer.parseInt(d[1]);
		int yy = Integer.parseInt(d[2]);
		if (mm < 1 || mm > 12)
			return false;
		if (d[2].length() != 4)
			return false;

		if (isLeap(yy)) {

			if (dd <= leap[mm - 1] && dd > 0)
				return true;
			else
				return false;
		} else {
			if (dd <= nLeap[mm - 1] && dd > 0)
				return true;
			else
				return false;
		}

	}

	public static double power(int n, int p)

	{
		double x = 1;
		int r = p;
		if (p < 0)
			r *= -1;
		for (int i = 1; i <= r; i++) {
			if (p > 0)
				x *= n;
			else
				x /= n;
		}
		return x;

	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;

		}
		return fact;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		if (n == 1)
			return false;

		return true;
	}

}
