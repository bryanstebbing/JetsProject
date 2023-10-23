package com.skilldisitllery.jets.entities;

public class FellBeasts extends CreatureTypes {

	
	public FellBeasts() {
	}

	public FellBeasts(String type, int speed, int range, double price) {
		super(type, speed, range, price);
	}
	
	@Override
	public void fly() {
		System.out.println("Screeeeeeech");
		getSpeedInMach();

	}

	public void atDawnLookToTheEast() {
		// have all the creatures fight

	}

	public void fight() {
		System.out.println("Do not come between the nazgul and its prey");
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
