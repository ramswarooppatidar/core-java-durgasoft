package com.innerclasses;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.innerclasses.InnerClasses_part_1.inner;

public class Gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int i =0;
				while(i<10) {
					System.out.println("closing window "+i);
					i++;
				}
				System.exit(0);
			}
		}
		);
		frame.add(new Label("Ican create executable jar file"));
		frame.setSize(500, 500);
		frame.setVisible(true);

	}

}