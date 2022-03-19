package hotel.management.system;

import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

public
class Dashboard extends JFrame
{
private
	JPanel contentPane;
public
	static void main(String[] args)
	{
		new Dashboard().setVisible(true);
	}

public
	Dashboard()
	{
		super("HOTEL MANAGEMENT SYSTEM");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(0, 0, 850, 570);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setForeground(Color.CYAN);
		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel NewLabel = new JLabel(i3);
		NewLabel.setBounds(0, 0, 1400, 800);
		add(NewLabel);

		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/AdminLogo.png"));
		Image i22 = i11.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i33 = new ImageIcon(i22);
		JLabel NewLabel1 = new JLabel(i33);
		NewLabel1.setBounds(0, 0, 1400, 1050);
		NewLabel.add(NewLabel1);

		ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/manager.png"));
		Image i222 = i111.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i333 = new ImageIcon(i222);
		JLabel NewLabel2 = new JLabel(i333);
		NewLabel2.setBounds(0, 0, 600, 1050);
		NewLabel.add(NewLabel2);

		ImageIcon i1111 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/CustomerLogo1.png"));
		Image i2222 = i1111.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3333 = new ImageIcon(i2222);
		JLabel NewLabel3 = new JLabel(i3333);
		NewLabel3.setBounds(0, 0, 2200, 1050);
		NewLabel.add(NewLabel3);

		JLabel HotelManagementSystem = new JLabel("WELCOME TO CASA DE' VILLA");
		HotelManagementSystem.setForeground(Color.WHITE);
		HotelManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
		HotelManagementSystem.setBounds(400, 350, 1000, 85);
		NewLabel.add(HotelManagementSystem);

		JButton Manager = new JButton("Manager");
		Manager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				Manager manager = new Manager();
				manager.setVisible(true);
	}
	catch (Exception e1)
	{
		e1.printStackTrace();
	}
}
});
Manager.setBounds(200, 630, 200, 30);
Manager.setBackground(Color.WHITE);
Manager.setForeground(Color.BLACK);
contentPane.add(Manager);

JButton Receptionist = new JButton("Receptionist");
		Receptionist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				Reception recep = new Reception();
				recep.setVisible(true);
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		}
		});
		Receptionist.setBounds(600, 630, 200, 30);
		Receptionist.setBackground(Color.WHITE);
		Receptionist.setForeground(Color.BLACK);
		contentPane.add(Receptionist);

		JButton cust = new JButton("Customer");
				cust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				Customer custom = new Customer();
				custom.setVisible(true);
				}
				catch (Exception e1)
				{
					e1.printStackTrace();
				}
				}
				});
				cust.setBounds(1000, 630, 200, 30);
				cust.setBackground(Color.WHITE);
				cust.setForeground(Color.BLACK);
				contentPane.add(cust);

				setSize(1400, 720);
				setVisible(true);
				getContentPane().setBackground(Color.WHITE);
				}
				}
