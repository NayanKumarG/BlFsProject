package com.bridgelabz.structural.proxydesignpattern;

/*
 * program for client side
 */
public class ProxyPatternTest {

	public static void main(String[] args) {

		CommandExecutor executor = new CommandExecutorProxy("Nayan" , "nayan");
		try
		{
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");
		}catch(Exception e)
		{
			System.out.println("Exception:"+e);	
		}
	}
}
