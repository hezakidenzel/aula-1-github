package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Enter departament name");
		String departmentName = ler.next();
		
		System.out.print("Enter Worker data");
		System.out.println("Name :");
		String workerName = ler.nextLine();
		
		 
		
		
		
		ler.close();
	}

}
