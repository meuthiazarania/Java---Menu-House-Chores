package meuthia;

import java.util.Scanner;

public class Meuthia2702345043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kegiatan = 0;
		int menumakan;
		String option, rumah, taman;
		String hasilMenu;
		
		do {
			System.out.print("Apakah Anda memiliki rumah? [Y/N]");
			rumah = sc.nextLine();
		
		if(rumah.equalsIgnoreCase("N")) {
			System.out.println("Terima kasih telah menggunakan program ini.");
			return;
		}
		
		System.out.print("Apakah Anda memiliki taman? [Y/N]");
		taman = sc.nextLine();
		
		if(taman.equalsIgnoreCase("Y")) {
			System.out.println("Pilih kegiatan yang diinginkan: ");
			System.out.println("1. Cooking");
			System.out.println("2. Cleaning");
			System.out.println("3. Gardening");
			
			kegiatan = sc.nextInt(); sc.nextLine();
		} else if(taman.equalsIgnoreCase("N")) {
			System.out.println("Pilih kegiatan yang diinginkan: ");
			System.out.println("1. Cooking");
			System.out.println("2. Cleaning");
			
			kegiatan = sc.nextInt(); sc.nextLine();
		} 
		
//			System.out.println("Pilih menu: ");
//			menu = sc.nextInt(); sc.nextLine();
			switch(kegiatan) {
			case 1:
				System.out.println("Pilih menu masakan: ");
				System.out.println("1. Pasta");
				System.out.println("2. Steak");
				System.out.println("3. Fried Rice");
				menumakan = sc.nextInt(); sc.nextLine();
				switch(menumakan) {
				case 1: 
					System.out.println("Cooking Pasta...");
					break;
				case 2:
					System.out.println("Cooking Steak...");
					break;
				case 3:
					System.out.println("Cooking Fried Rice...");
					break;
				default:
					System.out.println("Invalid!");
				}
				break;
				
			case 2:
				System.out.println("Sedang Membersihkan...");
				System.out.println("======================");
				break;
				
			case 3:
				System.out.println("Sedang Menyiram Tanaman...");
				System.out.println("==========================");
				break;
			default:
				System.out.println("Invalid!");
			}
//			System.out.println("Invalid!");
			System.out.print("Apakah Anda ingin mencoba lagi? [Y/N]");
			hasilMenu = sc.nextLine();
			
		} while(hasilMenu.equalsIgnoreCase("Y"));
		System.out.println("Thank You for using this program.");
	} 
}
