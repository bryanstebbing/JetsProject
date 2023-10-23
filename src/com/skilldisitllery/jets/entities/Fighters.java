package com.skilldisitllery.jets.entities;

public class Fighters extends CreatureTypes {

	public Fighters() {
	}

	public Fighters(String type, int speed, int range, double price) {
		super(type, speed, range, price);
	}

	@Override
	public void fly() {
		System.out.println("Zooooooooom");
		getSpeedInMach();
	}

	public void atDawnLookToTheEast() {
		System.out.println("I am fire.....I am.....Death");
	}

	@Override
	protected void add(CreatureTypes creature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void remove(CreatureTypes creature) {
		// TODO Auto-generated method stub
		
	}
}
