package com.bridgelabz.structural.proxydesignpattern;

/*
 * program to access by the user only
 */
public class CommandExecutorProxy implements CommandExecutor{
	private boolean isAdmin;
	private CommandExecutor executor;

	/*
	 * checking the user detail
	 */
	public CommandExecutorProxy(String user , String pwd)
	{
		if("Nayan".equals(user) && "nayan123".equals(pwd))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}
	/*
	 * overriding the runCommand method
	 */
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin)
		{
			executor.runCommand(cmd);
			
		}
		else
		{
			if(cmd.trim().startsWith("rm"))
			{
				throw new Exception("rm command is not allowed for non-admin users.");
			}
			else
				executor.runCommand(cmd);
		}

	}


}
