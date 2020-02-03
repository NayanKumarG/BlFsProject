package com.bridgelabz.creationaldesignpattern.singleton;

/*
 * thread safe using double locking singleton program
 */
public class ThreadSafeDoubleLockingSingleton {
	private static ThreadSafeDoubleLockingSingleton object;


	private ThreadSafeDoubleLockingSingleton()
	{

	}

	/*
	 * method which is thread safe
	 */
	public static synchronized ThreadSafeDoubleLockingSingleton getInstance()
	{
		if(object==null)
		{
			synchronized(ThreadSafeDoubleLockingSingleton.class)
			{
				if(object==null)
				{

					object = new ThreadSafeDoubleLockingSingleton();
				}
			}
		}
		return object;


	}
}
