package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public
class HotelManagementSystem extends JFrame implements ActionListener
{
	HotelManagementSystem()
	{
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(300, 20, 600, 700);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/Cover5.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel NewLabel = new JLabel(i3);
		NewLabel.setBounds(0, 0, 1400, 800);
		add(NewLabel);
		JLabel l2 = new JLabel("Hotel Management System");
		l2.setBounds(350, 40, 1000, 90);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("serif", Font.BOLD, 62));
		NewLabel.add(l2);
		JButton b1 = new JButton("Login");
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setBounds(650, 600, 100, 50);
		b1.addActionListener(this);
		NewLabel.add(b1);
		setLayout(null);
		setVisible(true);
		while (true)
		{
			l2.setVisible(false);
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e)
			{
			}
			l2.setVisible(true);
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e)
			{
			}
		}
	}
public
	void actionPerformed(ActionEvent ae)
	{
		new Login().setVisible(true);
	}
public
	static void main(String[] args)
	{
		new HotelManagementSystem();
	}
}
    