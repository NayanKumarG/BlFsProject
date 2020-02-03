package com.bridgelabz.creationaldesignpattern.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		EagerInitializedSingleton obj1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton obj2 = EagerInitializedSingleton.getInstance();
		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                
            	/*
            	 * Below code will destroy the singleton pattern
            	 */
                constructor.setAccessible(true);
                obj1 = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
	}


