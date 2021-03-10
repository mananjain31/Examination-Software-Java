import javax.swing.*;
import java.awt.*;	

class Home extends JPanel
{
	JButton aboutB, adminLB, studentLB;
	JLabel heading;
	Font font1, font2;
	Home (ProjectJFrame f)
	{
		setLayout (null);

		font1 = new Font ("Castellar", Font.BOLD, 18);
		font2 = new Font ("Franklin Gothic Heavy", Font.BOLD, 50);

		heading = new JLabel ("EXAMINATION SOFTWARE");
		heading.setBounds (150, 70, 700, 50);
		heading.setForeground (Color.BLACK);
		heading.setFont (font2);
		add (heading);

		aboutB = new JButton ("About");
		aboutB.setBounds (30, 700, 200, 50);
		aboutB.setForeground (Color.RED);
		aboutB.setBackground (Color.BLACK);
		aboutB.setFont (font1);
		add (aboutB);
		aboutB.addActionListener (f);

		adminLB = new JButton ("Admin");
		adminLB.setBounds (750, 300, 250, 80);
		adminLB.setForeground (Color.RED);
		adminLB.setBackground (Color.BLACK);
		adminLB.setFont (font1);
		add (adminLB);
		adminLB.addActionListener (f);

		studentLB = new JButton ("Student");
		studentLB.setBounds (750, 400, 250, 80);
		studentLB.setForeground (Color.RED);
		studentLB.setBackground (Color.BLACK);
		studentLB.setFont (font1);
		add (studentLB);
		studentLB.addActionListener (f);
	}
	public void paintComponent (Graphics g)
	{
		g.drawImage (new ImageIcon ("bg.png").getImage (), 0, 0, null);
		g.drawImage (new ImageIcon ("home_icon.png").getImage (), 150, 150, null);
	}
}