import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Busca {

	private Problema problema;
	private HashSet<Estado> visitados;

	public Busca(Problema problema) {
		this.problema = problema;
	}

	public Stack<No> emLargura() {
		this.visitados = new HashSet<>();
		Queue<No> fila = new LinkedList<No>();

		No no = new No();
		no.setEstado(problema.getEstadoInicial());
		fila.add(no);

		while (!fila.isEmpty()) {

			no = fila.poll();

			if (problema.isObjetivo(no.getEstado())) {
				return solucao(no);
			}

			fila.addAll(expandir(no));
		}

		return null;
	}

	public Stack<No> emProfundidade() {
		this.visitados = new HashSet<>();
		Stack<No> pilha = new Stack<>();

		No no = new No();
		no.setEstado(problema.getEstadoInicial());
		pilha.push(no);

		while (!pilha.isEmpty()) {

			no = pilha.pop();

			if (problema.isObjetivo(no.getEstado())) {
				return solucao(no);
			}

			pilha.addAll(expandir(no));
		}

		return null;
	}

	private Stack<No> solucao(No no) {
		Stack<No> caminho = new Stack<>();
		caminho.add(no);

		No pai = no.getPai();
		while (pai != null) {
			caminho.push(pai);
			pai = pai.getPai();
		}

		return caminho;
	}

	private List<No> expandir(No no) {
		List<No> sucessores = new ArrayList<>();

		imprimirArvore(no);
		//if (!this.visitados.contains(no.getEstado())) {			

			this.visitados.add(no.getEstado());

			for (Estado sucessor : problema.getMapa().get(no.getEstado())) {

				if (!this.visitados.contains(sucessor)) {
					No novo = new No();
					novo.setEstado(sucessor);
					novo.setPai(no);
					novo.setProfundidade((no.getProfundidade() + 1));
					sucessores.add(novo);
				}
			}
		//}
		Collections.shuffle(sucessores);
		return sucessores;
	}

	private void imprimirArvore(No no) {
		String str = "";
		for (int i = 0; i < no.getProfundidade(); i++) {
			str += "\t";
		}
		System.out.println(str + "<<" + no + ">>");
	}

}
