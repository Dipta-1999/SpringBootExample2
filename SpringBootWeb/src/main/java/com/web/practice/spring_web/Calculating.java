package com.web.practice.spring_web;

import java.util.*;
public class Calculating implements Calculate{
	
	int n1, n2, add=0, sub=0, mul=0;
	double n3, n4, dev=0.0;
	
	public void Add(int a, int b) {
		//Scanner sc=new Scanner(System.in);
		System.out.println("Addition");
		System.out.print("n1=");
		n1=a;
		System.out.print("n2=");
		n2=b;
		this.add+=n1+n2;
		System.out.println("\n"+n1+" + "+n2+" = "+add);
	}


	public int Substract(int a, int b) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Substraction");
		//System.out.print("n1=");
		n1=a;
		System.out.print("n2=");
		n2=b;
		this.sub=(n2>n1)?(n2-n1):(n1-n2);
		return sub;
	}


	public int Multiply(int a, int b) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Multiplication");
		//System.out.print("n1=");
		n1=a;
		//System.out.print("n2=");
		n2=b;
		this.mul=n1*n2;
		//System.out.println("\n"+n1+" x "+n1+" = "+mul);
		return mul;
	}

	public Double Devide(double a, double b) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Devision");
		//System.out.print("n1=");
		n3=a;
		//System.out.print("n2=");
		n4=b;
		this.dev=n3/n4;
		//System.out.println("\n"+n3+" / "+n4+" = "+dev);
		return dev;
	}
	
}
