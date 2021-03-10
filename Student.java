import javax.swing.*;
import java.awt.*;	

class Student extends JPanel
{
	JButton backB;
	Font font1, font2;
	JButton loginB, registerB;
	JLabel heading;
	Student (ProjectJFrame f)
	{
		setLayout(null);

		font1 = new Font ("Castellar", Font.BOLD, 18);
		font2 = new Font ("Franklin Gothic Heavy", Font.BOLD, 50);

		heading = new JLabel ("WELCOME STUDENT");
		heading.setBounds (175, 50, 700, 50);
		heading.setForeground (Color.BLACK);
		heading.setFont (font2);
		add (heading);
		
		loginB = new JButton ("Login");
		loginB.setBounds (750, 300, 250, 80);
		loginB.setForeground (Color.RED);
		loginB.setBackground (Color.BLACK);
		loginB.setFont (font1);
		add (loginB);
		loginB.addActionListener (f);

		registerB = new JButton ("Register");
		registerB.setBounds (750, 400, 250, 80);
		registerB.setForeground (Color.RED);
		registerB.setBackground (Color.BLACK);
		registerB.setFont (font1);
		add (registerB);
		registerB.addActionListener (f);

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
		g.drawImage (new ImageIcon ("student_icon.png").getImage (), 150, 150, null);
	}
}

class StudentLogin extends JPanel
{
	JButton backB;
	Font font1;
	StudentLogin (ProjectJFrame f)
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


class StudentRegister extends JPanel
{
	JButton backB;
	Font font1;
	StudentRegister (ProjectJFrame f)
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

