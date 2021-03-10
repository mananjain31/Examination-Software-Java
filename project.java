import javax.swing.*;	
import java.awt.*;
import java.awt.event.*;

class project
{
	public static void main(String[] args) 
	{
		ProjectJFrame jframe = new ProjectJFrame();
		jframe.setVisible(true);
		// frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jframe.setBounds(-10,-5,1920,835);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}	
}

class ProjectJFrame extends JFrame implements ActionListener
{
	Container cn = getContentPane ();
	CardLayout card;
	Home home;
	Admin admin;
	About about;
	Student student;
	StudentRegister studentRegister;
	StudentLogin studentLogin;
	ProjectJFrame ()
	{
		card = new CardLayout();
		cn.setLayout (card);
		home = new Home(this);
		about = new About(this);
		admin = new Admin(this);
		student = new Student(this);
		studentLogin = new StudentLogin(this);
		studentRegister = new StudentRegister(this);

		cn.add ("home", home);
		cn.add ("about", about);
		cn.add ("admin", admin);
		cn.add ("student", student);
		cn.add ("studentLogin", studentLogin);
		cn.add ("studentRegister", studentRegister);
	}
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource () == home.aboutB) card.show (cn, "about");
		else if (e.getSource () == home.adminLB) card.show (cn, "admin");
		else if (e.getSource () == home.studentLB) card.show (cn, "student");

		else if (e.getSource () == about.backB) card.show (cn, "home");
		else if (e.getSource () == admin.backB) card.show (cn, "home");

		else if (e.getSource () == student.backB) card.show (cn, "home");
		else if (e.getSource () == student.registerB) card.show (cn, "studentRegister");
		else if (e.getSource () == student.loginB) card.show (cn, "studentLogin");

		else if (e.getSource () == studentRegister.backB) card.show (cn, "student");
		
		else if (e.getSource () == studentLogin.backB) card.show (cn, "student");
	}
}