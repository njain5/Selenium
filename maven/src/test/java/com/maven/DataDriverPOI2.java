package com.maven;

import java.io.IOException;
import java.util.ArrayList;

public class DataDriverPOI2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDriverPOI ddp = new DataDriverPOI();
		ArrayList<String> data = ddp.getData("testdata", "TestCases", "Add Profile");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

	}

}
