package com.bridgelabz.structural.proxydesignpattern;

import java.io.IOException;

/*
 * implementation of commandExecutor interface
 */
public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) {
		
		try {
			Runtime.getRuntime().exec(cmd);
			System.out.println(cmd+" command executed");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	

}
