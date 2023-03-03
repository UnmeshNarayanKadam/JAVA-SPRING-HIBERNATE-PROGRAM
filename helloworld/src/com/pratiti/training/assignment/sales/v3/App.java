package com.pratiti.training.assignment.sales.v3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String splitBy=",";
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\unmes\\Downloads\\company-sales.csv"));
			
			CompanySales[] cs = new CompanySales[12];
			
			//skip the first line in csv
			
			String line = br.readLine(); 
			String[] fieldsName = line.split(",");
			int index=0;
			
            if (line != null) {
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    CompanySales csTemp = new CompanySales();
                    
                    Field fd = new Field(Integer.parseInt(data[1]) , Integer.parseInt(data[2]) , 
                    		Integer.parseInt(data[3]) , Integer.parseInt(data[4]) , Integer.parseInt(data[5]) , 
                    		Integer.parseInt(data[6]) , Integer.parseInt(data[7]) , Integer.parseInt(data[8]));
                   
                    List<Field>ls = new ArrayList<>();
                    ls.add(fd);
                    csTemp.setField(ls);
                    cs[index]=csTemp;
                    index++;
                }
            }
            
//reading the data
//            for(int i=0;i<12;i++) {
//            	List<Field>ls2 = new ArrayList<>();
//                ls2 = cs[i].getField();
//                System.out.print(ls2.get(0).getFaceCream()+"  "+ls2.get(0).getFaceWash()+"  "+ls2.get(0).getToothPaste()
//                		+"  "+ls2.get(0).getBathingSoap() +"  "+ls2.get(0).getShampoo() +"  "+ls2.get(0).getMoisturizer() 
//                		+"  "+ls2.get(0).getTotalUnit()+"  "+ls2.get(0).getTotalProfit());
//                System.out.println();
//            }
       
//Finding total profit
            int totalProfitOfCurrentYear = 0;
            for(int i=0;i<12;i++) {
            	totalProfitOfCurrentYear+=cs[i].getField().get(0).getTotalProfit();
            }
            System.out.println("Total profit of current year is : "+totalProfitOfCurrentYear);
            
//Finding Month having lowest profit
            int monthHavingLowestProfit =0 , min = cs[0].getField().get(0).getTotalProfit();
            for(int i=0;i<12;i++) {
            	if(cs[i].getField().get(0).getTotalProfit() <= min) {
            		min = cs[i].getField().get(0).getTotalProfit();
            		monthHavingLowestProfit = i+1;
            	}
            }
            System.out.println("Month having lowest profit is : "+ monthHavingLowestProfit);
            
//Finding most bought product in given month
            System.out.println("Enter the month to find the most bought product : ");
            Scanner sc = new Scanner(System.in);
            int inputMonth = sc.nextInt();
            List<Integer>ls = new ArrayList<>();
            ls.add(cs[inputMonth-1].getField().get(0).getFaceCream());
            ls.add(cs[inputMonth-1].getField().get(0).getFaceWash());
            ls.add(cs[inputMonth-1].getField().get(0).getToothPaste());
            ls.add(cs[inputMonth-1].getField().get(0).getBathingSoap());
            ls.add(cs[inputMonth-1].getField().get(0).getShampoo());
            ls.add(cs[inputMonth-1].getField().get(0).getMoisturizer());
            int max=0,productIndex=0;
            for(int i=0;i<ls.size();i++) {
            	if(ls.get(i)>max) {
            		max = ls.get(i);
            		productIndex = i+1;
            	}
            }
            System.out.println("Most bought product in given month is : "+ fieldsName[productIndex]);
            
//Find the number of units bought for given product
            System.out.println("Enter the product name : ");
            String productName = sc.next();
            int totalProductSold=0;
            if(productName.equalsIgnoreCase("facecream")) {
            	for(int i=0;i<12;i++) {
            		totalProductSold+=cs[i].getField().get(0).getFaceCream();
                }
            	System.out.println("Numbers of units are : "+totalProductSold);
            }
            else if(productName.equalsIgnoreCase("facewash")) {
            	for(int i=0;i<12;i++) {
            		totalProductSold+=cs[i].getField().get(0).getFaceWash();
                }
            	System.out.println("Numbers of units are : "+totalProductSold);
            }
            else if(productName.equalsIgnoreCase("Toothpaste")) {
            	for(int i=0;i<12;i++) {
            		totalProductSold+=cs[i].getField().get(0).getToothPaste();
                }
            	System.out.println("Numbers of units are : "+totalProductSold);
            }
            else if(productName.equalsIgnoreCase("bathingsoap")) {
            	for(int i=0;i<12;i++) {
            		totalProductSold+=cs[i].getField().get(0).getBathingSoap();
                }
            	System.out.println("Numbers of units are : "+totalProductSold);
            }
            else if(productName.equalsIgnoreCase("shampoo")) {
            	for(int i=0;i<12;i++) {
            		totalProductSold+=cs[i].getField().get(0).getShampoo();
                }
            	System.out.println("Numbers of units are : "+totalProductSold);
            }
            else {
            	for(int i=0;i<12;i++) {
            		totalProductSold+=cs[i].getField().get(0).getMoisturizer();
                }
            	System.out.println("Numbers of units are : "+totalProductSold);
            }
            
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
