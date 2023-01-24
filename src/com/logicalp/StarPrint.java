package com.logicalp;

public class StarPrint {
	int i, j, k;

	public void test() {

		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public void type() {
		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] a) {
		StarPrint t = new StarPrint();
		t.test();
		t.type();

	}
}
