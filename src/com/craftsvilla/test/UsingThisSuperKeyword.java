package com.craftsvilla.test;

import Sindura_assignments.Demo1;

public class UsingThisSuperKeyword extends Demo1{

	public static int i,j;
	public UsingThisSuperKeyword()
	{
		this(i);
		System.out.println("Current CLASS NO ARGUMENTS CONSTRUCTOR");
	
	}
	public UsingThisSuperKeyword(int i)
	{
		this(20,20);
	System.out.println("Current CLASS ONE ARGUMENTS CONSTRUCTOR");
	
	}
	public UsingThisSuperKeyword(int i,int j)
	{
		
		super();
		this.i=i;
		this.j=j;
		
		System.out.println("Current CLASS TWO ARGUMENTS CONSTRUCTOR"+i+" "+j);
	
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 new UsingThisSuperKeyword();
		

	}

}
