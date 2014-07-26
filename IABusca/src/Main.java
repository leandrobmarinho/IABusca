import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Problema problema = new Problema();
		problema.setEstadoInicial(Estado.Dobreta);
		problema.setEstadoFinal(Estado.Iasi);

		Busca busca = new Busca(problema);
		
		System.out.println(" === Busca em Largura === ");
		imprimeCaminho(busca.emLargura());
		
		System.out.println("\n === Busca em Profundidade === ");
		imprimeCaminho(busca.emProfundidade());
		
	}
	
	public static void imprimeCaminho(Stack<No> caminho){
		if (caminho == null ){
			System.out.println("Caminho não encontrado");
			return ;
		}
		
		No no;
		do{
			no = caminho.pop();
			System.out.println(no);	
		}while(!caminho.isEmpty());		
	}
}
