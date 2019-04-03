
public class Teste {

	public static void main(String[] args) {
		
		Treino t1 = new TreinoNoInicioDaTemporada();
		t1.treinoDiario();
		
		System.out.println("********************");
		
		Treino t2 = new TreinoNoMeioDaTemporada();
		t2.treinoDiario();
	}

}
