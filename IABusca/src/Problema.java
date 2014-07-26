import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Problema {
	
	private HashMap<Estado, ArrayList<Estado>> mapa;
	private Estado estadoInicial;
	private Estado estadoFinal;
	
	public Problema() {
		ArrayList<Estado> estados;
		mapa = new HashMap<>();
		
		//Mapeamento
		estados = new ArrayList<>();
		estados.add(Estado.Zerind);
		estados.add(Estado.Timisoara);
		estados.add(Estado.Sibiu);
		Collections.shuffle(estados);
		mapa.put(Estado.Arad, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Arad);
		estados.add(Estado.Lugoj);
		Collections.shuffle(estados);
		mapa.put(Estado.Timisoara, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Arad);
		estados.add(Estado.Oradea);
		Collections.shuffle(estados);
		mapa.put(Estado.Zerind, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Arad);
		estados.add(Estado.Oradea);
		estados.add(Estado.RimnieuVilcea);
		estados.add(Estado.Fagaras);
		Collections.shuffle(estados);
		mapa.put(Estado.Sibiu, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Zerind);
		estados.add(Estado.Sibiu);
		Collections.shuffle(estados);
		mapa.put(Estado.Oradea, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Timisoara);
		estados.add(Estado.Mehadia);
		Collections.shuffle(estados);
		mapa.put(Estado.Lugoj, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Lugoj);
		estados.add(Estado.Dobreta);
		Collections.shuffle(estados);
		mapa.put(Estado.Mehadia, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Mehadia);
		estados.add(Estado.Craiova);
		Collections.shuffle(estados);
		mapa.put(Estado.Dobreta, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Dobreta);
		estados.add(Estado.RimnieuVilcea);
		estados.add(Estado.Pitesti);
		Collections.shuffle(estados);
		mapa.put(Estado.Craiova, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Sibiu);
		estados.add(Estado.Craiova);
		estados.add(Estado.Pitesti);
		Collections.shuffle(estados);
		mapa.put(Estado.RimnieuVilcea, estados);
				
		estados = new ArrayList<>();
		estados.add(Estado.Sibiu);
		estados.add(Estado.Bucareste);
		Collections.shuffle(estados);
		mapa.put(Estado.Fagaras, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.RimnieuVilcea);
		estados.add(Estado.Craiova);
		estados.add(Estado.Bucareste);
		Collections.shuffle(estados);
		mapa.put(Estado.Pitesti, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Fagaras);
		estados.add(Estado.Pitesti);
		estados.add(Estado.Giurgiu);
		estados.add(Estado.Urziceni);
		Collections.shuffle(estados);
		mapa.put(Estado.Bucareste, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Bucareste);
		mapa.put(Estado.Giurgiu, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Bucareste);
		estados.add(Estado.Hirsova);
		estados.add(Estado.Vaslui);
		Collections.shuffle(estados);
		mapa.put(Estado.Urziceni, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Hirsova);
		mapa.put(Estado.Eforie, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Urziceni);
		estados.add(Estado.Eforie);
		Collections.shuffle(estados);
		mapa.put(Estado.Hirsova, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Iasi);
		estados.add(Estado.Urziceni);
		Collections.shuffle(estados);
		mapa.put(Estado.Vaslui, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Neamt);
		estados.add(Estado.Vaslui);
		Collections.shuffle(estados);
		mapa.put(Estado.Iasi, estados);
		
		estados = new ArrayList<>();
		estados.add(Estado.Iasi);
		mapa.put(Estado.Neamt, estados);
	}

	public HashMap<Estado, ArrayList<Estado>> getMapa() {
		return mapa;
	}

	public void setMapa(HashMap<Estado, ArrayList<Estado>> mapa) {
		this.mapa = mapa;
	}

	public Estado getEstadoInicial() {
		return estadoInicial;
	}

	public void setEstadoInicial(Estado estadoInicial) {
		this.estadoInicial = estadoInicial;
	}

	public Estado getEstadoFinal() {
		return estadoFinal;
	}

	public void setEstadoFinal(Estado estadoFinal) {
		this.estadoFinal = estadoFinal;
	}
	

	public boolean isObjetivo(Estado estado){
		return (estado.equals(getEstadoFinal())) ? true : false ; 
	}
	
}
