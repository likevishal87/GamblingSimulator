package com;

public class UC2Gambling {

	static int AMOUNT = 100;
	static int BET = 1;
	static int WON = 1;
	static int LOST = 0;

	public static void main(String[] args) {
		System.out.println("Welcom to the GamblerSimulator");

		int play = (int) Math.floor(Math.random() * 10) % 2;
		System.out.println("Gamblers play:" + play);

		int cashInHand = AMOUNT;
		switch (play) {
		case 1:
			cashInHand = cashInHand + BET;
			System.out.println("Total current cash gambler has " + cashInHand);
			System.out.println("Player won the first play");
			break;
		case 2:
			cashInHand = cashInHand - BET;
			System.out.println("Total current cash gambler has " + cashInHand);
			System.out.println("Player lost the first play");
			break;
		default:
			System.out.println("default");
		}

	}
}
