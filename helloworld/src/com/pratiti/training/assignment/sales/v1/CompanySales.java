package com.pratiti.training.assignment.sales.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanySales {
	private Map<Integer , List<Field>>companySales = new HashMap<>();
	
	
	public void addNewMonth(int month) {
		companySales.put(month, new ArrayList<>());
	}
	
	public void addNewField(int month , Field fields) {
		List<Field> list = companySales.get(month);
		list.add(fields);
	}

	public List<Field> getField(Integer month) {
		return companySales.get(month);
	}

}
