import javax.swing.*;
class project
{
	public static void main(String[] args) 
	{
		ProjectJFrame frame = new ProjectJFrame();
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	}	
}

class ProjectJFrame extends JFrame
{
	ProjectJFrame()
	{

	}
}