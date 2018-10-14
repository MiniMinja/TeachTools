import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Mindow extends JPanel{
	private JFrame frame;
	
	public Mindow(int frameWidth, int frameHeight) {
		Dimension d = new Dimension(frameWidth, frameHeight);
		super.setMinimumSize(d);
		super.setPreferredSize(d);
		super.setMaximumSize(d);
		
		frame = new JFrame();
		frame.setMinimumSize(d);
		frame.setPreferredSize(d);
		frame.setMaximumSize(d);
		
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void tick() {
		
	}
	
	public void render() {
		this.repaint();
	}
	public void paint(Graphics g) {
		Toolkit.getDefaultToolkit().sync();
		super.paint(g);
		//Handler.test_render(g);
		
		Handler.spritesheet.render(g);
	}
}
