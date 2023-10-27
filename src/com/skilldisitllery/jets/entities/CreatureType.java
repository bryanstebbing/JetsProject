package com.skilldisitllery.jets.entities;

public abstract class CreatureType {

	protected String creatureType;
	protected String creatureClass;
	private int speed;
	private int range;
	private double price;
	

	public CreatureType() {
	}

	public CreatureType(String creatureType, String creatureClass, int speed, int range, double price) {
		this.creatureType = creatureType;
		this.creatureClass = creatureClass;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getCreatureType() {
		return creatureType;
	}

	public void setCreatureType(String creatureType) {
		this.creatureType = creatureType;
	}

	public String getCreatureClass() {
		return creatureClass;
	}

	public void setCreatureClass(String creatureClass) {
		this.creatureClass = creatureClass;
	}

	public abstract void fly();

	public double distanceTraveledBeforeEmpty() {
		return getRange() / getSpeed();
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Creature Type: " + getCreatureType() +
				"\nCreature Class: " + getCreatureClass() 
				+ "\nSpeed: " + getSpeed() + " MPH" 
				+ "\nRange: " + getRange() + " miles"
				+ "\nPrice: $" + getPrice() + "\n";
	}

}
