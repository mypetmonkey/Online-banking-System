package com.practice;

import org.testng.annotations.Test;

public class RunConfig {
	@Test
	public void runConfig() {
		String url=System.getProperty("url");
		String un=System.getProperty("un");
		String pwd=System.getProperty("pwd");
		String browser=System.getProperty("browser");
		System.out.println(url+" "+un+" "+pwd+" "+browser);
	}

}
