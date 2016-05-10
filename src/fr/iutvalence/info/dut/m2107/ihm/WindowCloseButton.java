package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

/**
 * @HASSAINE ABDERRAHMANE
 * @version 1.0
 */

@SuppressWarnings("serial")
public class WindowCloseButton extends JButton implements MouseListener {

	private String Name;
	
	
	public WindowCloseButton(String name)
	{
		super(name);
		this.addMouseListener(this);
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		System.exit(0);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
}
