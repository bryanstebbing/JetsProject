package com.skilldisitllery.jets.app;

import java.util.Scanner;

import com.skilldisitllery.jets.entities.Airfield;

public class CreatureTypesApp {
	public Airfield pelennorFields;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CreatureTypesApp app = new CreatureTypesApp();
		app.run();
	}

	public CreatureTypesApp() {
		pelennorFields = new Airfield();
	}

	public void run() {
		displayMenu();
	}

	public void displayMenu() {

		int instructorsChoice;

		do {
			System.out.print("Please Select one of the following: \n" + "\t1. List All Flying Creatures!! \n"
					+ "\t2. Release All The Creatures!! \n" + "\t3. Find The Fastest Creature!! \n"
					+ "\t4. Which Creature Can Fly The Farthest? \n" + "\t5. Load The Carrier Creatures!! \n"
					+ "\t6. Fight To The Doom!! \n" + "\t7. Create A Creature!! \n" + "\t8. Destroy A Creature!! \n"
					+ "\t9. YOU SHALL NOT CHOOSE ANY MORE!!");
			instructorsChoice = sc.nextInt();
			sc.nextLine();
			switch (instructorsChoice) {
			case 1:
				pelennorFields.listCreatures();
				break;
			case 2:
				pelennorFields.flyAllTheCreatures();
				break;
			case 3:
				pelennorFields.showTheFastestCreature();
				break;
			case 4:
				pelennorFields.farthestFlyingCreature();
				break;
			case 5:
				pelennorFields.loadTheCarriers();
				break;
			case 6:
				pelennorFields.allCreaturesFight();
				break;
			case 7:
				pelennorFields.createACreature(sc);
				break;
			case 8:
				pelennorFields.removeCreature(sc);
				break;
			case 9:
				System.out.println("Thanks for coming to Middle Earth! Have a nice day!");
				sc.close();
				System.exit(0);
			default:
				System.out.println("One does not simply choose incorrectly.");
			}
		} while (instructorsChoice != 9);
	}

}
