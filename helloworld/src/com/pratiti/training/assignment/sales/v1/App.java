package com.pratiti.training.assignment.sales.v1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String splitBy = ",";
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\unmes\\Downloads\\company-sales.csv"));

			CompanySales[] cs = new CompanySales[12];

			// skip the first line in csv
			String line = br.readLine();
			int index = 0;
			if (line != null) {
				while ((line = br.readLine()) != null) {
					String[] data = line.split(",");
					CompanySales csTemp = new CompanySales();
					csTemp.addNewMonth(Integer.parseInt(data[0]));
					// creating and passing the fields value to Field class object
					Field fd = new Field(Integer.parseInt(data[1]), Integer.parseInt(data[2]),
							Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]),
							Integer.parseInt(data[6]), Integer.parseInt(data[7]), Integer.parseInt(data[8]));

					// Adding the Field data
					csTemp.addNewField(Integer.parseInt(data[0]), fd);
					cs[index] = csTemp;
					index++;
				}
			}
			System.out.println(cs[0].getField(1).get(0).getFaceWash());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
