package com.pratiti.training.assignment.sales.v3;

public class Field {
	
	private int faceCream;
	private int faceWash;
	private int toothPaste;
	private int bathingSoap;
	private int shampoo;
	private int moisturizer;
	private int totalUnit;
	private int totalProfit;
	
	public Field(int faceCream, int faceWash, int toothPaste, int bathingSoap, int shampoo, int moisturizer,
			int totalUnit, int totalProfit) {
		super();
		this.faceCream = faceCream;
		this.faceWash = faceWash;
		this.toothPaste = toothPaste;
		this.bathingSoap = bathingSoap;
		this.shampoo = shampoo;
		this.moisturizer = moisturizer;
		this.totalUnit = totalUnit;
		this.totalProfit = totalProfit;
	}
	
	

	public int getFaceCream() {
		return faceCream;
	}

	public void setFaceCream(int faceCream) {
		this.faceCream = faceCream;
	}

	public int getFaceWash() {
		return faceWash;
	}

	public void setFaceWash(int faceWash) {
		this.faceWash = faceWash;
	}

	public int getToothPaste() {
		return toothPaste;
	}

	public void setToothPaste(int toothPaste) {
		this.toothPaste = toothPaste;
	}

	public int getBathingSoap() {
		return bathingSoap;
	}

	public void setBathingSoap(int bathingSoap) {
		this.bathingSoap = bathingSoap;
	}

	public int getShampoo() {
		return shampoo;
	}

	public void setShampoo(int shampoo) {
		this.shampoo = shampoo;
	}

	public int getMoisturizer() {
		return moisturizer;
	}

	public void setMoisturizer(int moisturizer) {
		this.moisturizer = moisturizer;
	}

	public int getTotalUnit() {
		return totalUnit;
	}

	public void setTotalUnit(int totalUnit) {
		this.totalUnit = totalUnit;
	}

	public int getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(int totalProfit) {
		this.totalProfit = totalProfit;
	}
	
	
	
}
