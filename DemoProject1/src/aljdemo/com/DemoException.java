package aljdemo.com;

public class DemoException {

	public static void main(String[] args) {

		try {
			int a = 45;
			int b = 0;
			int c = a / b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Remaining code....");

	}

}
