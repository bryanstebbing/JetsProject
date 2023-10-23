package com.skilldisitllery.jets.entities;

import java.util.ArrayList;
import java.util.List;

public class Airfield {

	private List<CreatureTypes> creature = new ArrayList<>();
	public List<CreatureTypes> getCreatures(){
		return creature;
	}
	
	public void addCreature(CreatureTypes creature) {
		this.creature.add(creature);
	}
	
	public void removeCreature(CreatureTypes creature) {
		this.creature.remove(creature);
	}
	
	public void flyYouFools() {
		for (CreatureTypes c : creature) {
			c.fly();
		}
	}

}