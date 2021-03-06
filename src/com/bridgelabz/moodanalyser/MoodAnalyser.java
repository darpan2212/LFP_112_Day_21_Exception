package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	public String analyseMood(String msg) {
		try {
			if (msg.toLowerCase().contains("sad") || msg
					.toLowerCase().contains("exhausted")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (Exception e) {
			System.out.println("Invalid msg");
			System.out.println(e);
			return "Invalid input";
		}
	}

	public void expression(int a, int b) {

		int add = 0, sub = 0, div = 0, mul = 0;

		/*
		 * try { try {
		 * 
		 * } catch (Exception e) { // TODO: handle exception } } catch
		 * (ArithmeticException e) { try {
		 * 
		 * } catch (Exception e2) { // TODO: handle exception } } catch
		 * (NullPointerException e) { // TODO: handle exception }
		 */

		try {
			add = a + b;
			sub = a - b;
			div = a / b;
			mul = a * b;

		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Addition result : " + add);
			System.out.println(
					"Sibstraction result : " + sub);
			System.out.println("Division result : " + div);
			System.out.println(
					"Multiplication result : " + mul);
		}
	}

}