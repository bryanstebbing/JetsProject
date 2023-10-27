package com.skilldisitllery.jets.entities;

public class Fighter extends CreatureType implements CombatReady {

	public Fighter() {
	}

	public Fighter(String type, String creatureClass, int speed, int range, double price) {
		super(type, creatureClass, speed, range, price);
	}

	@Override
	public void fly() {
		System.out.println("\nZooooooooom" + " a " + creatureType + " can fly for " +
				distanceTraveledBeforeEmpty() + " miles before needing to land.\n");
		
	}

	@Override
	public void fight() {
		System.out.println("\nAll " + creatureClass + "s are in combat!!!\n");

	}
}
