package pratica_6_a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ManipuladorArquivo {
	
	
	Scanner ler = new Scanner(System.in);
	
			
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
		
		ArrayList<String> texto = new ArrayList<String>();
		
		BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
		
		String titulo, objetivo, endereco, datadeinicio, status;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("titulo: ");
		System.out.println("objetivo: ");
		System.out.println("endereço: ");
		System.out.println("datadeinicio: ");
		System.out.println("status: ");
		titulo=in.next();
		objetivo=in.next();
		endereco=in.next();
		datadeinicio=in.next();
		status=in.next();
	
		texto.add(titulo);
		texto.add(objetivo);
		texto.add(endereco);
		texto.add(status);
		texto.add(datadeinicio);
	
		escrever.append(texto + "\n");
	
		escrever.close();
		System.out.println("Criado com sucesso");
		
	}
}
