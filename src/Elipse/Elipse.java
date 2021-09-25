package Elipse;

public class Elipse {
	
	int a, b;
	double pi;
	
	public Elipse(int a, int b, double pi) {
		
		this.a = a;
		this.b = b;
		this.pi = pi;
	}

	public double getAreaElipse() {
		
		double ae = (pi * a * b) / 4;
		return ae;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

}
