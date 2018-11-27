package gui2.controller;

import gui2.model.Samurai;
import gui2.view.SecondFrame;


public class GUI2Controller
{

		
		private Samurai mySamurai;
		private SecondFrame appFrame;
		
		public GUI2Controller()
		{
			mySamurai = new Samurai();
			appFrame = new SecondFrame(this);
		}
		
		public void start()
		{
			
		}
	}


