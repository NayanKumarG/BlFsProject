package com.bridgelabz.creationaldesignpattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSingletonRunner {

	public static void main(String[] args) {
		serialize();
		deserialize();
	}

	/*
	 * serializing object into the file
	 */
	private static void serialize() {
		SerializedSingleton obj1 = SerializedSingleton.getInstance();
		System.out.println(obj1.hashCode());
		try
		{
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("/home/user/eclipse-workspace/DesignPatterns/singleton.ser"));
			out.writeObject(obj1);
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Path is not correct");
		}

	}

	/*
	 * deserializing the object from file
	 */
	private static void deserialize() {
		try
		{
			ObjectInput in = new ObjectInputStream(new FileInputStream("/home/user/eclipse-workspace/DesignPatterns/singleton.ser"));
			SerializedSingleton obj2 = (SerializedSingleton) in.readObject();

			in.close();
			System.out.println(obj2.hashCode());
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("taking input is not possible");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}

	}

}
