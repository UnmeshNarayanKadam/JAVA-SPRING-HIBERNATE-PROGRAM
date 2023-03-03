package com.pratiti.training.assignment.sales.v2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pratiti.training.pariksha.Option;

public class App {

	public static void main(String[] args) {
		String splitBy=",";
		
		try {
			CompanySales[] cs = new CompanySales[11];
			int index=0;
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\unmes\\Downloads\\company-sales.csv"));
			//skip the first line in csv
			String line = br.readLine(); 
            if (line != null) {
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    //adding month as key
                    cs[index].setMonth(Integer.parseInt(data[0]));
                    //creating and passing the fields value to Field class object
                    List<Field> fd = new ArrayList<>();
                    fd.add(new Field(Integer.parseInt(data[1]) , Integer.parseInt(data[2]) , 
                    		Integer.parseInt(data[3]) , Integer.parseInt(data[4]) , Integer.parseInt(data[5]) , 
                    		Integer.parseInt(data[6]) , Integer.parseInt(data[7]) , Integer.parseInt(data[8])));
                    //Adding the Field data
                    cs[index].setFields(fd);
                    index++;
                }
                for(int i=0;i<index;i++) {
                	System.out.println(cs[i].getMonth());
                	List<Field>temp = new ArrayList<>();
                	temp = cs[i].getFields();
                	System.out.println(temp);
                }
            }
            
            
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
