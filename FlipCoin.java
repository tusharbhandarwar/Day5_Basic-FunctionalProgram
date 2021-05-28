package com.bridgelabz;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int Head = 0, Tail = 0;

		for (int i = 0; i < n; i++) {
			double random = Math.floor(Math.random() * 10) % 2;

			if (random < 0.5) {
				Head++;
				System.out.println("head:" + Head);
			} else {
				Tail++;
				System.out.println("tail:" + Tail);
			}
		}
		int percenthead = (Head + 100) / 10;
		int percenttail = (Tail + 100) / 10;
		System.out.println("Percentages of Head:" + Head);
		System.out.println("Percentages of Tail:" + Tail);

	}

}
