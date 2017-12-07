package com.craftsvilla.test;

import Sindura_assignments.Demo1;

public class UsingThisSuperKeyword extends Demo1{

	public static int i,j;
	public UsingThisSuperKeyword()
	{
		this(10);
		System.out.println("Current CLASS NO ARGUMENTS CONSTRUCTOR");
	
	}
	public UsingThisSuperKeyword(int i)
	{
		this(i,j);
		
	System.out.println(i+" Current CLASS ONE ARGUMENTS CONSTRUCTOR");
	
	}
	public UsingThisSuperKeyword(int i,int j)
	{
		
		super();
	
		
		System.out.println("Current CLASS TWO ARGUMENTS CONSTRUCTOR"+i+" "+j);	
		
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 new UsingThisSuperKeyword();
		

	}

}

