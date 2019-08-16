public class TesteData {	
	
	public static void main(String[] args) {
		
		DataAmericana dataAmericana = new DataAmericana();
		DataBrasileira dataBrasileira = new DataBrasileira();
		
		System.out.println("\nData em formato brasileiro: "
		+dataBrasileira.dataPersonalizada());		
		
		System.out.println("\nData em formato americano: "
		+dataAmericana.dataPersonalizada());
	}

}
