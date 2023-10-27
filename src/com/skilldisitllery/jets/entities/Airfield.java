package com.skilldisitllery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airfield {

	private List<CreatureType> creatureList = new ArrayList<>();

	public List<CreatureType> getCreatures() {
		return getCreatureList();
	}

	public void addCreature(CreatureType creature) {
		this.getCreatureList().add(creature);
	}

	public void removeCreature(CreatureType creature) {
		this.getCreatureList().remove(creature);
	}

	public Airfield() {
		populateCreatures();
	}

	public void populateCreatures() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("creatures.txt"))) {
			String line;
			CreatureType readInCreature = null;
			while ((line = bufIn.readLine()) != null) {
				String[] values = line.split(", ");
				String type = values[0];
				String creatureClass = values[1];
				int speed = Integer.parseInt(values[2]);
				int range = Integer.parseInt(values[3]);
				double price = Double.parseDouble(values[4]);

				if (creatureClass.equalsIgnoreCase("Carrier")) {
					readInCreature = new Carrier(type, creatureClass, speed, range, price);
				}

				else if (creatureClass.equalsIgnoreCase("Fighter")) {
					readInCreature = new Fighter(type, creatureClass, speed, range, price);
				}

				else if (creatureClass.equalsIgnoreCase("Fellbeast")) {
					readInCreature = new FellBeast(type, creatureClass, speed, range, price);
				}
				getCreatureList().add(readInCreature);

			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	// call the airfield method of flying all creatures
	public void flyAllTheCreatures() {
		if (getCreatureList().isEmpty()) {
			System.out.println("There are no creatures in the fields!");
		} else {
			for (CreatureType creature : getCreatureList()) {
				creature.fly();
			}
		}
	}

	public void listCreatures() {
		if (getCreatureList().isEmpty()) {
			System.out.println("There are no creatures in the fields!");
		} else {
			for (CreatureType c : getCreatureList()) {
				System.out.println(c);

			}
		}
	}

	public void showTheFastestCreature() {
		if (getCreatureList().isEmpty()) {
			System.out.println("There are no creatures in the fields!");
		}

		CreatureType theFastestCreature = getCreatureList().get(0);

		for (CreatureType c : getCreatureList()) {
			if (c != null && c.getSpeed() > theFastestCreature.getSpeed()) {
				theFastestCreature = c;
			}
		}
		System.out.println(theFastestCreature);
	}

	public void farthestFlyingCreature() {
		if (getCreatureList().isEmpty()) {
			System.out.println("There are no creatures in the fields!");
		}

		CreatureType longestFlyingCreature = getCreatureList().get(0);

		for (CreatureType c : getCreatureList()) {
			if (c != null && c.getRange() > longestFlyingCreature.getRange()) {
				longestFlyingCreature = c;
			}
		}
		System.out.println(longestFlyingCreature);

	}

	public void loadTheCarriers() {
		for (CreatureType creatureType : creatureList) {
			if (creatureType instanceof Carrier) {
				((Carrier) creatureType).loadTheCarriers();
			}
		}
	}

	public void allCreaturesFight() {
		for (CreatureType creatureType : creatureList) {
			if (creatureType instanceof Fighter) {
				((Fighter) creatureType).fight();
			}
		}
	}

//	 create a creature
	public void createACreature(Scanner sc) {

		CreatureType usersCreature = null;

		System.out.println("Please choose\n1) Fighter\n2) Carrier\n3) FellBeast.\n");
		String userChoice = sc.nextLine();

		System.out.println("Please tell us what Type of Creature you want to create.\n");
		String type = sc.nextLine();

		System.out.println("Please tell us how fast this creature moves in MPH.\n");
		int speed = sc.nextInt();

		System.out.println("How far can this creature fly?\n");
		int range = sc.nextInt();

		System.out.println("How much would it cost to purchase such a creature?\n");
		double price = sc.nextDouble();

		sc.nextLine();

		if (userChoice.equalsIgnoreCase("2")) {
			usersCreature = new Carrier(type, "Carrier", speed, range, price);
		}

		else if (userChoice.equalsIgnoreCase("1")) {
			usersCreature = new Fighter(type, "Fighter", speed, range, price);
		}

		else if (userChoice.equalsIgnoreCase("3")) {
			usersCreature = new FellBeast(type, "FellBeast", speed, range, price);
		}
		getCreatureList().add(usersCreature);

	}

	public void removeCreature(Scanner sc) {
		System.out.println("Please tell us what Creature you want to remove.");
		String type = sc.nextLine();
		boolean creatureRemoved = false;

		// Iterate through the creatureList to find and remove the creature with a
		// matching type
		for (CreatureType creature : getCreatureList()) {
			if (creature.getCreatureType().equalsIgnoreCase(type)) {
				getCreatureList().remove(creature);
				creatureRemoved = true;
				break; // Exit the loop once a creature is removed
			}
		}

		if (creatureRemoved) {
			System.out.println("Creature removed successfully.");
		} else {
			System.out.println("Creature not found in Pelennor Fields.");
		}
	}

	public List<CreatureType> getCreatureList() {
		return creatureList;
	}

	public void setCreatureList(List<CreatureType> creatureList) {
		this.creatureList = creatureList;
	}

}