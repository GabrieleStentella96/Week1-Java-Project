package com.epicode.backend.week1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String title;
		int vol;
		int light;
		int type;
		int dur;

		System.out.println("LETTORE MULTIMEDIALE");
		
		Scanner print = new Scanner(System.in);
		Media[] med = new Media[5];
		for (int i = 0; i < 5; i++) {
			
			boolean trueFalse = true;
			while (trueFalse) {
				System.out.println("(1 Picture 2 Audio 3 Video)");
				System.out.println("You have put" + i + " file");
				type = print.nextInt();
				print.nextLine();
				switch (type) {

				case 1:
					System.out.println("Insert imagine title.");
					title = print.nextLine();
					med[i] = new Immagini(title, light);
					trueFalse = false;
					break;
				case 2:
					System.out.println("Insert audio title. ");
					title = print.nextLine();
					System.out.println("Insert audio duration " + title);
					dur = print.nextInt();
					print.nextLine();
					med[i] = new Audio(title, dur, vol);
					trueFalse = false;
					break;
				case 3:
					System.out.println("Insert video title. ");
					title = print.nextLine();
					System.out.println("Insert video title. " + title);
					dur = print.nextInt();
					print.nextLine();
					med[i] = new Video(title, dur, vol, light);
					trueFalse = false;
					break;
					default:
					System.out.println("Uncorrect action! ");
					break;
				}
			}
		}

		int decision = 0;
		while (true) {

			System.out.println("Chooce a multimedial object from 1 to 5. Selcet number 0 to quit.");
			System.out.println("=============");
			System.out.println("    MENU   ");
			for (int i = 0; i < 5; i++) {

				System.out.println((i + 1) + ")" + med[i].getTitle());
			}

			System.out.println("=============");

			decision = print.nextInt();
			print.nextLine(); 
			if (decision == 0)
				System.exit(0);
			System.out.println("exit");

			med[decision - 1].start();
			System.out.println("Do you want to modify the current file? [Yes/No]");
			String choice = print.nextLine();
			if (choice.equals("Yes"))
				med[decision - 1].modifySetMedia(print);
		}
	}

}