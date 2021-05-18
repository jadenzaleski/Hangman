package com.icloud.jadenzaleski;

public class Main {

	public static Stats s = new Stats();
	public static GameFrame frame = new GameFrame();
	
	public static void main(String[] args) {
		frame.start();
		System.out.println(frame.getBounds());
	}

}
