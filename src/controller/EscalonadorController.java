package controller;


import br.juliarafaela.FilaString.Fila;
import model.Processo;

public class EscalonadorController {
	
    public void escalonador(Fila f, int quantum) throws Exception {
    	
        while (!f.isEmpty()) {
        	
            Processo processo = (Processo) f.remove();
            System.out.println("Executando o processo: " + processo.getNome());
            for (int i = 0; i < quantum; i++) {
                processo.decrementaTempoRestante();
                if (!processo.temTempoRestante()) {
                    System.out.println("Processo " + processo.getNome() + " finalizado.");
                    break;
                }
            }
            if (processo.temTempoRestante()) {
                ((Fila) f).insert(processo);
            }
        }
    }
}
