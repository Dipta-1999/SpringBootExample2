package com.web.practice.spring_web;

public class Calculation {
	
	private int n1;
	private int n2;
	private int n3;
	private int n4;
	private int n5;
	
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	public int getN4() {
		return n4;
	}
	public void setN4(int n4) {
		this.n4 = n4;
	}
	public int getN5() {
		return n5;
	}
	public void setN5(int n5) {
		this.n5 = n5;
	}
	public int getN6() {
		return n6;
	}
	public void setN6(int n6) {
		this.n6 = n6;
	}
	public double getN7() {
		return n7;
	}
	public void setN7(double n7) {
		this.n7 = n7;
	}
	public double getN8() {
		return n8;
	}
	public void setN8(double n8) {
		this.n8 = n8;
	}

	private int n6;
	private double n7;
	private double n8;
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public Calculate addd;
	public Calculate subb;
	public Calculate mull;
	public Calculate devv;
	
	
	public Calculate getAddd() {
		return addd;
	}
	public void setAddd(Calculate addd) {
		this.addd = addd;
	}
	
	
	public Calculate getSubb() {
		return subb;
	}
	public void setSubb(Calculate subb) {
		this.subb = subb;
	}
	
	
	public Calculate getMull() {
		return mull;
	}
	public void setMull(Calculate mull) {
		this.mull = mull;
	}
	
	
	public Calculate getDevv() {
		return devv;
	}
	public void setDevv(Calculate devv) {
		this.devv = devv;
	}
	
	
	
	public void AddNum(int n3, int n4)
	{
		addd.Add(n3,n4);
	}
	public void SubNum(int n3, int n4)
	{
		subb.Substract(n3,n4);
	}
	public void MulNum(int n3, int n4)
	{
		mull.Multiply(n3,n4);
	}
	public void DeviNum(double n7, double n8)
	{
		devv.Devide(n7,n8);
	}
	
}
