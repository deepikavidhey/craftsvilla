package com.craftsvilla.test;


//import org.testng.Assert;
import org.testng.Reporter;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;


public class CartC extends BaseTest
{
	
	@Test
	public void testCart() 
	{
		Reporter.log("driver--"+driver,true);
		log.info("Hi");
		//Assert.fail();
		
		/*
		CartPage cp=new CartPage(driver);
		//cp.mousehoveNclick();
		
		cp.clicking();
		*/
		
	}
}