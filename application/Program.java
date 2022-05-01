package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		Student[] vect = new Student[10];
		
		System.out.println("Quantos estudantes vão alugar os quartos?");
		int quantidade = sc.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do aluno: ");
			String name = sc.nextLine();
			System.out.println("Digite o email do aluno: ");
			String email = sc.nextLine();
			System.out.println("Qual quarto deseja ficar? ");
			int room = sc.nextInt();
			vect[room] = new Student(name, email);
			
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + "" + vect[i]); 
			}
		}
		
		
		sc.close();
	}

}
