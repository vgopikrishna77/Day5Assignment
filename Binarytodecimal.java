package com.DiffStrings;

public class Binarytodecimal {
	
	 public static int cnvrtBin2Dec(String binaryStr) {
	        return Integer.parseInt(binaryStr, 2);
	    }

	    // Converts a decimal number to a binary string
	    public static String cnvrtDec2Bin(int decimal) {
	        return Integer.toBinaryString(decimal);
	    }

	    // Compares two binary strings
	    public static boolean compareBinaryDigits(String str1, String str2) {
	        return str1.equals(str2);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		    // Converts a binary string to a decimal number
		    
		        String binaryInput = "1011"; // Binary for 11

		        // Convert binary to decimal
		        int decimal = cnvrtBin2Dec(binaryInput);

		        // Convert decimal back to binary
		        String binaryOutput = cnvrtDec2Bin(decimal);

		        // Compare the original and converted binary strings
		        boolean comparisonResult = compareBinaryDigits(binaryInput, binaryOutput);

		        // Display the results
		        System.out.println("Original Binary: " + binaryInput);
		        System.out.println("Decimal: " + decimal);
		        System.out.println("Converted Binary: " + binaryOutput);
		        System.out.println("Are they the same? "+comparisonResult);
	}

}
