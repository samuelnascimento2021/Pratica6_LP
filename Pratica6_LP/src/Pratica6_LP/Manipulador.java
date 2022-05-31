package Pratica6_LP;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manipulador {
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();

}
	public static void escritor(String path) throws IOException {
		
		BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
		String titulo, objetivo, endereco, data, status;
		ArrayList<String> info = new ArrayList();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o título: \n");
		titulo = ler.next();
		System.out.print("Insira o objetivo: \n");
		objetivo = ler.next();
		
		ler = new Scanner(System.in);
		
		System.out.print("Insira o endereço: \n");
		endereco = ler.next();
		
		ler = new Scanner(System.in);
		
		System.out.print("Insira a data de início: \n");
		data = ler.next();
						
		System.out.print("Insira o status: \n");
		status = ler.next();
		
		info.add(titulo + "," 
		+ objetivo + "," 
		+ endereco + "," 
		+ data + "," 
		+ status);
				
		escrever.append(info + "\n");
		escrever.close();
		System.out.println("Criado com sucesso");
		
	}
}
