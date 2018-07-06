package org.itstep;

public class Function extends Number{

	@Override
	public int sum(int num1, int num2) {
		int res =(num1 + num2)/2;
		return super.sum(num1, num2);
	}

    int x = 10;
	int y = 20;
	
	public int getFunction() {
		
		int sum = minus(x, y);
		
		return sum;
	}
}
