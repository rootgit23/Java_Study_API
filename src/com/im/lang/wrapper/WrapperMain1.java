package com.im.lang.wrapper;

import com.im.lang.wrapper.ex1.WrapperEx1;
import com.im.lang.wrapper.ex1.WrapperEx2;

public class WrapperMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(Integer.BYTES);
	    System.out.println(Integer.MAX_VALUE);
	    System.out.println(Integer.MIN_VALUE);
	    System.out.println(Integer.SIZE);
	    
	    String num="10";
	    
	    Integer integer = new Integer(num);
	    int n = integer.intValue();
	    
	    n = 50;
	    integer = new Integer(n);
	    
	    integer = n; //auto-boxing
	    n = integer; //auto-unboxing
	    
	    long l = 10L;
	    Long ll = l;
	    
	    integer = (int)l;
	    
	    //String num1 = "ten";
	    String num2 = "3.12";
	    String num3 = "60";
	    
	    //int n1 = Integer.parseInt(num1);
	    double n2 = Double.parseDouble(num2);
	    long n3 = Long.parseLong(num3);
	  //  System.out.println(n1);
	    System.out.println(n2);
	    System.out.println(n3);
	    
	    System.out.println(n+2);
	    WrapperEx1 ex1 = new WrapperEx1();
	   // ex1.Ex1();
		WrapperEx2 ex2 = new WrapperEx2();
		ex2.juminCheck();

	}

}
