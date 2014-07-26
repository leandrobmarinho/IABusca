public enum Estado {
	Arad("Arad"),
	Sibiu("Sibiu"),
	Timisoara("Timisoara"),
	Zerind("Zerind"),
	Lugoj("Lugoj"),
	Oradea("Oradea"),
	Mehadia("Mehadia"),
	Dobreta("Dobreta"),
	Craiova("Craiova"),
	RimnieuVilcea("RimnieuVilcea"),
	Fagaras("Fagaras"),
	Pitesti("Pitesti"),
	Bucareste("Bucareste"),
	Giurgiu("Giurgiu"),
	Urziceni("Urziceni"),
	Eforie("Eforie"),
	Hirsova("Hirsova"),
	Vaslui("Vaslui"),
	Neamt("Neamt"),
	Iasi("Iasi");
	
	private String estado;
	
	Estado(String estado){
		this.estado = estado;
	}
	
	public String toString(){
		return estado;
	}
}
