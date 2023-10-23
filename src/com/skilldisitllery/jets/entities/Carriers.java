package com.skilldisitllery.jets.entities;


public class Carriers extends CreatureTypes {

	
	public Carriers() {
	}

	public Carriers(String type, int speed, int range, double price) {
		super(type, speed, range, price);
	}
	@Override
	public void fly() {
		System.out.println("Whooooooosh");
		getSpeedInMach();

	}

	public void saveMeGwaihir() {
		System.out.println("Loading the dwarves on to the Eagles for their grand escape!");
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
