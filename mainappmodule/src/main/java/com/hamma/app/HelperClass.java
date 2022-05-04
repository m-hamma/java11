package com.hamma.app;

public class HelperClass {
	 static class InnerHelper {
	        void print() {
	            doPrint();
	            int b = a;
	        }
	    }

	    static void doPrint() {
	        System.out.println("Printing from HelperClass");
	    }

	    static int a = 1;

}
