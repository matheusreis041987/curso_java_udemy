package curso_programacao;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela1 extends JFrame {

	JButton btok = new JButton("Ok");
	
	public Tela1() {
		super("Minha Primeira Tela");
		setSize(600,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btok.addActionListener(new Tela1Controller());
		JPanel pane = new JPanel();
		pane.add(btok);
		add(pane);
		
		
		
		setVisible(true);
	}
	
	
	
	
}
