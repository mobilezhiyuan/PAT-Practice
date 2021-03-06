﻿import java.util.Scanner;

public class Main {
	private static Scanner in;
	private int num;
	private String unit = "";
	private String decade = "";
	private String hundred = "";
	
	public Main(int num) {
		this.num = num;
	}
	
	public void getNewFormat() {
		int a = num % 10;
		int b = num / 10;
		
		if(a != 0) {
			for(int i = 1; i <= a; i++) {
				unit += i;
			}
		}
		if(b != 0) {
			a = b % 10;
			if(a != 0) {
				for(int j = 0; j < a; j++) {
					decade += "S";
				}
			}
			b /= 10;
			if(b != 0) {
				for(int k = 0; k < b; k++) {
					hundred += "B";
				}
			}
		}
	}
	
	public void output() {
		System.out.println(hundred+decade+unit);
	}
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		Main changeFormat = new Main(in.nextInt());
		changeFormat.getNewFormat();
		changeFormat.output();
	}
}