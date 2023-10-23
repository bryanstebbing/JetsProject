package com.skilldisitllery.jets.entities;

public abstract class CreatureTypes {

	private String creatureType;
	private int speed;
	private int range;
	private double price;

	public CreatureTypes() {
	}

	public CreatureTypes(String creatureType, int speed, int range, double price) {
		this.creatureType = creatureType;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public abstract void fly();

	public String getCreatureTypes() {
		return creatureType;
	}

	public void setCreatureTypes() {
		this.creatureType = creatureType;
	}

	public double getSpeedInMach() {
		return speed / 670;
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
		return "Type of Creature " + creatureType + "\n The speed with which they fly " + speed + "\n The distance they can travel " + range + "\n  The cost to bring one home today "
				+ price + "";
	}

	protected void add(CreatureTypes creature) {
		// TODO Auto-generated method stub
		
	}

	protected void remove(CreatureTypes creature) {
		// TODO Auto-generated method stub
		
	}

}
