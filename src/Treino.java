public abstract class Treino {
 
    final void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
        finaliza();
    }
 
    abstract void preparoFisico();
    abstract void jogoTreino();
         
    final void treinoTatico() {
        System.out.println("Treino Tatico");
    }
    
    void finaliza() {
    	System.out.println("Finaliza!");
    }
 
}