package main;

import surse.*;
import interfaces.*;
import exceptions.*;

/**
 * Created by Ioan
 * 
 * This the main class of the project.
 */

public class Main {
	/**
	 * The entry point to the project
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		IConsumes BMW = new Car_luxury("Registered E92");
		IConsumes Oldsmobile = new Car_oldies("Unregistered Alero");
		Car Lastun = new Car_oldies("Unregistered Dacia");
		Car Ferrari = new Car_luxury("Registered 599 GTO");
		Car_luxury Mercedes = new Car_luxury("Registered Mercedes G63AMG");
		
		
		try {
            BMW.consumes();
            BMW.pollutes();
        } catch (IssuesException e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
		try {
			Oldsmobile.consumes();
			Oldsmobile.pollutes();
        } catch (IssuesException e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
		
		try {
			Mercedes.pollutes();
			Mercedes.consumes();
			System.out.println("^^ fooarte putin, doar 20l/100km");
		}catch (IssuesException e){
			System.out.println("Exception thrown: " + e.getMessage());
		}
		
		try {
			((Car_oldies) Lastun).pollutes();
		}catch (IssuesException e){
			System.out.println("Exception thrown: " + e.getMessage());
		}
		
		Lastun.setName("Dacia 500");
		System.out.println("Numele nou este: " + Lastun.getName());
		
		try {
			System.out.println("Numele vechi: " + Ferrari.getName());
			 Ferrari.setName("Registered 458 Italia");
			 System.out.println("Numele nou: " + Ferrari.getName());
		}catch(Exception e){
			e.printStackTrace();			
		}
		
		
	}
}
