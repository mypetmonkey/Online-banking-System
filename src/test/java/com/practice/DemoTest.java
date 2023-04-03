package com.practice;

import org.testng.annotations.Test;

public class DemoTest {
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("----test___01----");
	}
	
	@Test(groups = "smoke")
	public void test2() {
		System.out.println("----test___02");
	}

}
