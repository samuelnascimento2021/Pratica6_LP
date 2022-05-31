package Pratica6_LP;
import java.io.IOException;
import java.util.*;
public class ProgramaPrincipal {

	public static void main(String[] args)throws IOException  {
		Scanner ler = new Scanner(System.in);
		String path="";
				
		int opcao;
				
		do {
			
			System.out.println("1- Definir nome do arquivo\n"
					+ "2- Cadastrar Projeto\n"
					+ "3- Abrir arquivo do projeto\n"
					+ "4- Sair");
			opcao = ler.nextInt();
			
				switch (opcao){
			
			
				case 1:
					System.out.print("Digite o nome do arquivo: \n");
					path = ler.next();
										
					break;
				
				case 2:
					try {
						Manipulador.escritor(path.toString());
					}
					catch(IOException e) {
						System.out.println("Ocorreu um erro, tente novamente!");
					}
					
					break;
				
				case 3:
						try{
							System.out.print("Insira o nome do arquivo a ser lido: \n");
						
							path=ler.next();
						
							Manipulador.leitor(path.toString());
							System.out.println("");
						}
						catch(IOException e){
							System.out.println("Arquivo não existe ou não foi encontrado");
						}
					break;
				
				case 4:
					break;
					
				default:
					System.out.println("Escolha uma opção válida");
					
			}
					
		
		}while(opcao!=4);
		
		
		

	}

}
