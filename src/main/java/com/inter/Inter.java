package com.inter;

public class Inter {

	public static void arrayAssec() {
		
		int a[] = {80,12,5,8,30,1,2};
		int tem;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] >a[j]) {
					tem = a[i];
					a[i] = a[j];
					a[j] = tem;
					
				}
			}
		}
for (int j = 0; j < a.length; j++) {
	System.out.println(a[j]);
}
	}
	//Swapping
	public static void swappin() {

		int a =1;
		int b=2;
		a = a-b;
		b = a+b;
		a=b-a;
		System.out.println("A value="+a + " "+"B value="+ b);
	}
	
	//fabnoic
	public static void fanb() {
		int a = 0, b = 1,c;
		for (int i = 0; i < 10; i++) {
			c = a+b;
			System.out.println("Fabnoci:"+ c);
			a=b;
			b=c;
		}
		
	}
	//Reverstring
	public static void reverstring() {
		String s = "welcome";
		String  r =" ";
		for (int i = s.length()-1; i >=0 ; i--) {
			r = r+s.charAt(i);
		}
		System.out.println(r);
		}
	
	public static void repeateWord() {
		String s = "Anbaruvi";
		int le = s.length();
		for (int i = 0; i < le; i++) {
			char c = s.charAt(i);
			if (i==c) {
				
			}
		}
				
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		arrayAssec();
		swappin();
		fanb();
		reverstring();
		
	}
	
	
	
	
	
}
