package curso_programacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela1Controller implements ActionListener {

	Pessoa pessoa = new Pessoa("Matheus Reis");
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
			if (command.equals("Ok")) {
				System.out.println("ok is working");
				Tela2 t2 = new Tela2(pessoa.getNome());
			}
	}

}
