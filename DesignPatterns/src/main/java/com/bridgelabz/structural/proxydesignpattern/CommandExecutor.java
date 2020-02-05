package com.bridgelabz.structural.proxydesignpattern;

/*
 * interface provides run command service
 */
public interface CommandExecutor {

	public void runCommand(String cmd) throws Exception;
}
