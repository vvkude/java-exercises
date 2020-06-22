package edu.vvkude.exercises;
// Practicing converting between decimal, octal, hex, binary and bitwise shifting


public class NumberClasses {

	public static void main(String[] args) {
		int baseDecimal = 267;
		int octVal = 04_13;
		int hexVal = 0x10_B;
		int binVal = 0b1_0000_1011;
		long binaryVal = 0b10001011L;
		System.out.println("base decimal: " + baseDecimal);
		System.out.println("base octal: " + octVal);
		System.out.println("base hex: " +hexVal);
		System.out.println("base binary: " +binVal);
		System.out.println("base long binary: " +binaryVal);
		System.out.println("decimal + octal is:");
		System.out.println(baseDecimal + octVal);
		System.out.println("haxadecimal + binary is:");
		System.out.println(hexVal + binVal);
		
		long var1 = 0_100_267_760;
		long var2 = 0x4_13;
		long var3 = 0b10;
		long var4 = 0b1_0000_10_11;
		long var5 = 0xa10_A;
		long var6 = 0x1_0000_10;
		long var7 = 100__12_12;
		long [] numberClassArray = {var1, var2, var3, var4, var5, var6, var7};
		for (long e: numberClassArray) {
			System.out.println(e);
		}
		
		char c1 = 122; //This is a gross way to assign a a lower-case z to the variable c1
		char c2 = '\u0122'; //This is a number in base 16
		char c3 = (char)-122; //Java doesn't allocate space to store the sign of an integer
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3); //c3's output will look strange
	}
}
	