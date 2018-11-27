package gui2.view;

import javax.swing.JFrame;
import gui2.controller.GUI2Controller;
import gui2.view.SecondPanel;


public class SecondFrame extends JFrame
{
	private GUI2Controller appController;
	private SecondPanel appPanel;

	public SecondFrame(GUI2Controller appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new SecondPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("My GUI");
		this.setResizable(true);
		this.setVisible(true);
	}
	
}
