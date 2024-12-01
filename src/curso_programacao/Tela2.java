package curso_programacao;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela2 extends JFrame {
	
	JButton btok = new JButton("Ok");

	public Tela2(String pessoa) {
		super("Minha segunda Tela");
		setSize(300,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btok.addActionListener(new Tela1Controller());
		JPanel pane = new JPanel();
		pane.add(btok);
		add(pane);
		
		
		
		setVisible(true);
		
		
		
	}
	
}
