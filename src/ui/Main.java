package ui;

import java.util.Scanner;


import model.Championship;

public class Main {
	
	private static Scanner sc;
	private static Championship championship;
	
	public Main() {
		sc= new Scanner(System.in);
	}
	
	public static void main(String[] args) {

	Main ppal= new Main();
	createChampionship();
    }
	
	  private static void createChampionship(){

        int races, year;

        System.out.println("Ingrese la informacion del campeonato");
        System.out.println("Ingrese el anio");
                year = sc.nextInt();

        System.out.println("Ingrese el numero de la carreras en el anio");
                races = sc.nextInt();



       championship = new Championship(year, races);
    }
	
	public static void createPilot(){
		int age, choosen;
		int [] scores=new int[15];
        String name, team;


        System.out.println("Ingrese la informacion del piloto");
        System.out.println("Ingrese el nombre del piloto");
            name = sc.nextLine();

        System.out.println("Ingrese la edad del piloto");
            age = sc.nextInt();

		for(int i=0;i<championship.getRaces();i++){
			System.out.println("Ingrese el puntaje del piloto en la carrera #"+(i+1));
			scores[i]=sc.nextInt();
		}
		System.out.println(
				"*******************TEAM******************** \n"+
				"(1) If the pilot is from SCUDERIA FERRARI"+
				"(2) If the pilot is from MCLAREN F1 TEAM"+
				"(3) If the pilot is from RED BULL RACING"+
				"(4) If the pilot is from MERCEDES AMG"+
				"(5) If the pilot is from RACING POINT"+
				"(6) If the pilot is from ALFA ROMEO"+
				"(7) If the pilot is from RENAULT"+
				"(8) If the pilot is from WILLIAMS");
		choosen=sc.nextInt();
		switch (choosen){
			case 1:
			
			break;
			
			case 2:
			
			break;
			
			case 3:
			
			break;
			
			case 4:
			
			break;
			
			case 5:
			
			break;
			
			case 6:
			
			break;
			
			case 7:
			
			break;
			
			case 8:
			
			break;
			
		}
		
	}
}