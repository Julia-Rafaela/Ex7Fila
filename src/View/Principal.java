package View;


import br.juliarafaela.FilaString.Fila;
import controller.EscalonadorController;
import model.Processo;

public class Principal {
    public static void main(String[] args) {
  
    	Fila f = new Fila();
    	
        f.insert(new Processo("notepad.exe", 14));
        f.insert(new Processo("write.exe", 35));
        f.insert(new Processo("chrome.exe", 27));
        f.insert(new Processo("acrobat.exe", 52));
        f.insert(new Processo("firefox.exe", 18));
        f.insert(new Processo("word.exe", 25));

        EscalonadorController escalonadorController = new EscalonadorController();
        try {
			escalonadorController.escalonador(f, 10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
