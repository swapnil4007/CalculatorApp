package com.msedcl.main;

import com.msedcl.main.util.CalculatorUtil;

public class CalculatorMain {
	
	public static void main(String[] args) {
		CalculatorUtil calculatorUtil = new CalculatorUtil();
		System.out.println("Addition ="+ calculatorUtil.addition(5, 7));
	}

}
