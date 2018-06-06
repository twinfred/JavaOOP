package com.timwinfred.calculator;

public class Calculator implements CalcOperations {
	private double operandOne;
	private String operation;
	private double operandTwo;
	private double answer = 0.00;
	
	// Constructor
	public Calculator() {
	}
	
	// Getters & Setters
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	@Override
	public void performOperation() {
		if(operation == "+") {
			answer = operandOne + operandTwo;
		}else if(operation == "-") {
			answer = operandOne - operandTwo;
		}
	}
	
	@Override
	public double getResults() {
		return answer;
	}
}
