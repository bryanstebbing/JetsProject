package com.skilldisitllery.jets.entities;


public class Carrier extends CreatureType {

	
	public Carrier() {
	}

	public Carrier(String type, String creatureClass, int speed, int range, double price) {
		super(type, creatureClass, speed, range, price);
	}
	@Override
	public void fly() {
		System.out.println("\nWhooooosh" + " a " + creatureType + " can fly for " +
				distanceTraveledBeforeEmpty() + " miles before needing to land.\n");
		

	}

	public void loadTheCarriers() {
		System.out.println("\nLoading the " + creatureType +  " for their grand adventure!\n");
	}


}
