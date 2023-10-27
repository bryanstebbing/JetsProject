package com.skilldisitllery.jets.entities;

public class FellBeast extends CreatureType {

	
	public FellBeast() {
	}

	public FellBeast(String type, String creatureClass, int speed, int range, double price) {
		super(type, creatureClass, speed, range, price);
	}
	
	@Override
	public void fly() {
		System.out.println("\nScreeeeeeech" + " a " + creatureType + " can fly for " +
				distanceTraveledBeforeEmpty() + " miles before needing to land.\n");
		

	}

	public void fight() {
		System.out.println("Do not come between the nazgul and its prey");
	}

}
