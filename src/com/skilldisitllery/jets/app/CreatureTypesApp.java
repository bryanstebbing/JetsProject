package com.skilldisitllery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldisitllery.jets.entities.Airfield;
import com.skilldisitllery.jets.entities.Carriers;
import com.skilldisitllery.jets.entities.CreatureTypes;
import com.skilldisitllery.jets.entities.FellBeasts;
import com.skilldisitllery.jets.entities.Fighters;

public class CreatureTypesApp {

	public Airfield pelennorFields;
	private List<CreatureTypes> creature;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CreatureTypesApp app = new CreatureTypesApp();
		app.run();
	}

	public CreatureTypesApp() {
		pelennorFields = new Airfield();
		creature = new ArrayList<>();
	}

	public void run() {
		displayMenu();
		theFellowship();
	}

	public void displayMenu() {
		System.out.print("Please Select one of the following: \n" + "\t1. List All Flying Creatures!! \n"
				+ "\t2. Release All The Creatures!! \n" + "\t3. Find The Fastest Creature!! \n"
				+ "\t4. Which Creature Can Fly The Farthest? \n" + "\t5. Load The Carrier Creatures!! \n"
				+ "\t6. Fight To The Doom!! \n" + "\t7. Create A Creature!! \n" + "\t8. Destroy A Creature!! \n"
				+ "\t9. YOU SHALL NOT CHOOSE ANY MORE!!");

		int instrcutorsChoice;

		do {
			instrcutorsChoice = sc.nextInt();
			switch (instrcutorsChoice) {
			case 1:
				CreatureTypesApp call1 = new CreatureTypesApp();
				call1.theFellowship();
				break;
			case 2:
				CreatureTypesApp call2 = new CreatureTypesApp();
				call2.flyYouFools();
				break;
			case 3:
				CreatureTypesApp call3 = new CreatureTypesApp();
				call3.showUsTheMeaningOfHaste();
				break;
			case 4:
				CreatureTypesApp call4 = new CreatureTypesApp();
				call4.shouldHaveFlownTheEaglesToMountDoom();
				break;
			case 5:
				CreatureTypesApp call5 = new CreatureTypesApp();
				call5.saveMeGwaihir();
				break;
			case 6:
				CreatureTypesApp call6 = new CreatureTypesApp();
				call6.atDawnLookToTheEast();
				break;
			case 7:
				CreatureTypesApp call7 = new CreatureTypesApp();
				call7.butAllOfThemWereBetrayed();
				break;
			case 8:
				CreatureTypesApp call8 = new CreatureTypesApp();
				call8.goBackToTheAbyss();
				break;
			case 9:
				System.out.println("Thanks for visitng Middle Earth! Have a nice day!");
				sc.close();
				System.exit(0);
			default:
				System.out.println("One does not simply choose incorrectly.");
			}
		} while (instrcutorsChoice != 9);

//		runApplication(pelennorFields);
	}

	private void runApplication(Airfield pelennorFields) {
	}

	// display all the creatures and their stats.
	public void theFellowship() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("creatures.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] values = line.split(", ");
				String type = values[0];
				int speed = Integer.parseInt(values[1]);
				int range = Integer.parseInt(values[2]);
				double price = Double.parseDouble(values[3]);

				CreatureTypes newCreature = new Fighters(type, speed, range, price);
				creature.add(newCreature);
				CreatureTypes newCreature2 = new Carriers(type, speed, range, price);
				creature.add(newCreature2);
				CreatureTypes newCreature3 = new FellBeasts(type, speed, range, price);
				creature.add(newCreature3);
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		for (CreatureTypes c : creature) {
			pelennorFields.addCreature(c);
		}
		System.out.println(creature);
	}

	// call the airfield method of flying all creatures
	public void flyYouFools() {

		if (creature.isEmpty()) {
			System.out.println("There are no creatures in the fields!");
		} else {

			for (CreatureTypes c : creature) {
		        System.out.println("Creature Type: " + c.getCreatureTypes());
	            System.out.println("Speed: " + c.getSpeed() + " MPH");
	            System.out.println("Range: " + c.getRange() + " miles");
	            System.out.println("Price: $" + c.getPrice());
	            System.out.println();
				c.fly();
			}
		}
	}

	// display the fastest creatures speed and stats
	public void showUsTheMeaningOfHaste() {
		if (creature.isEmpty()) {
			System.out.println("There are no creatures in the fields!");
		}

		CreatureTypes theFastestCreature = creature.get(0);

		for (CreatureTypes c : creature) {
			if (c != null && c.getSpeed() > theFastestCreature.getSpeed()) {
				theFastestCreature = c;
			}
		}
	}

	// display the farthest distance any of the creature can fly
	public void shouldHaveFlownTheEaglesToMountDoom() {
		if (creature.isEmpty()) {
			System.out.println("There are no creatures in the fields!");
		}

		CreatureTypes longestFlyingCreature = creature.get(0);

		for (CreatureTypes c : creature) {
			if (c != null && c.getRange() > longestFlyingCreature.getSpeed()) {
				longestFlyingCreature = c;
			}
		}

	}

	// load the dwarfs onto the eagles
	public void saveMeGwaihir() {
		Carriers carriers = new Carriers();
		carriers.saveMeGwaihir();
	}

	// have all the creatures fight
	public void atDawnLookToTheEast() {
		Fighters fighters = new Fighters();
		fighters.atDawnLookToTheEast();
	}

	// create a creature
	public void butAllOfThemWereBetrayed() {
		for (int i = 0; i < creature.size(); i++)

			System.out.println("Please tell us what Type of Creature you want to create.");
		String type = sc.nextLine();

		System.out.println("Please tell us how fast this creature moves in MPH.");
		int speed = sc.nextInt();

		System.out.println("How far can this creature fly?\n");
		int range = sc.nextInt();

		System.out.println("How much would it cost to purchase such a creature?\n");
		double price = sc.nextDouble();

		sc.nextLine();

//			CreatureTypes wingedBeast = new CreatureTypes(type, speed, range, price);
//			creature[i] = wingedBeast;

	}

	// destroy a creature on the airfield
	public void goBackToTheAbyss() {
		System.out.println("Many that live deserve death. And some that die deserve life. Can you give it to them?");
		pelennorFields.removeCreature("Removing " + creature);
	}

}
