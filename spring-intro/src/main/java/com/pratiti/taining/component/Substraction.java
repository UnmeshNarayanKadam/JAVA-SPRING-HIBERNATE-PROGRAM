package com.pratiti.taining.component;

import org.springframework.stereotype.Component;

@Component("sub")
public class Substraction {
	public int sub(int x,int y) {
		return x-y;
	}
}
