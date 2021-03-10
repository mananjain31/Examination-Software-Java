import javax.swing.*;
import java.awt.*;	

class Admin extends JPanel
{
	JButton backB;
	Font font1;
	Admin (ProjectJFrame f)
	{
		setLayout(null);

		font1 = new Font ("Castellar", Font.BOLD, 18);
		

		backB = new JButton ("Home");
		backB.setBounds (30, 700, 200, 50);
		backB.setForeground (Color.RED);
		backB.setBackground (Color.BLACK);
		backB.setFont (font1);
		add (backB);
		backB.addActionListener (f);

		
	}
	public void paintComponent (Graphics g)
	{
		g.drawImage (new ImageIcon("bg.png").getImage (), 0, 0, null);
	}
}