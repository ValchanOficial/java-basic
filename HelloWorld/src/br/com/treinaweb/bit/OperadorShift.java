package br.com.treinaweb.bit;

public class OperadorShift {

	public static void main(String[] args) {
	int a = 2;
	System.out.println(Integer.toBinaryString(a)); //10
	//rotacionado em 1
	int b = a >> 1;
	System.out.println(Integer.toBinaryString(b)); //1
	int c = a << 1;
	System.out.println(Integer.toBinaryString(c)); //100
	
	System.out.println("a = "+a); //2
	System.out.println("b = "+b); //1
	System.out.println("c = "+c); //4
	}
}