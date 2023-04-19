package api.lang.wrapper;

import java.util.Arrays;

public class Wrapping {

	public static void main(String[] args) {
		
		int a = 100;
		double b = 2.41;
		char c = 'H';
		boolean d = false;
		
		Integer val1 = a;
		Double val2 = b;
		Character val3 = c;
		Boolean val4 = d;
		Byte val5 = (byte)75;
		
		Object[] arr = {100, 2.41, 'H', false, (byte)75};
		System.out.println(Arrays.toString(arr));
		
		
		
		int i = val1.intValue();
		double j = val2.doubleValue();
		char k = val3.charValue();
		boolean x = val4.booleanValue();
		byte y = val5.byteValue();
		
	}
}
