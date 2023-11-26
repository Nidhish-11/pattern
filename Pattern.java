import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Pattern implements MouseMotionListener
{
	JFrame f;
	Pattern()
	{
		f=new JFrame("Pattern");
		f.setSize(400,400);
		f.setLayout(null);
		f.addMouseMotionListener(this);
		f.setVisible(true);
	}
	public void mouseMoved(MouseEvent e)
	{
		Graphics g=f.getGraphics();
		g.setColor(Color.red);
		g.drawLine(0,0,e.getX(),e.getY());
		g.drawLine(400,400,e.getX(),e.getY());
		g.drawLine(0,400,e.getX(),e.getY());
		g.drawLine(400,0,e.getX(),e.getY());
		g.setColor(Color.yellow);
		g.drawLine(50,50,e.getX(),e.getY());
		g.drawLine(350,350,e.getX(),e.getY());
		g.drawLine(50,350,e.getX(),e.getY());
		g.drawLine(350,50,e.getX(),e.getY());
	}
	public void mouseDragged(MouseEvent e)
	{
	}
	public static void main(String z[])
	{
		new Pattern();
	}
}
