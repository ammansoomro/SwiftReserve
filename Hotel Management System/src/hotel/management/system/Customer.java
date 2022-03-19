package hotel.management.system;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
public
class Customer extends JFrame
{

private
	JPanel contentPane;

public
	static void main(String[] args)
	{
		new Customer();
	}

public
	Customer()
	{

		setBounds(300, 100, 850, 570);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/Customer2.jpg"));
		Image i3 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i3);
		JLabel l1 = new JLabel(i2);
		l1.setBounds(250, 30, 500, 470);
		add(l1);
		JLabel Manager = new JLabel("Customer");
		Manager.setForeground(Color.BLACK);
		Manager.setFont(new Font("Tahoma", Font.PLAIN, 46));
		Manager.setBounds(150, 350, 500, 85);
		l1.add(Manager);
		JButton btnNewCustomerForm = new JButton("New Customer Form");
		btnNewCustomerForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				NewCustomer custom = new NewCustomer();
				custom.setVisible(true);
                                setVisible(false);
	}
	catch (Exception e1)
	{
		e1.printStackTrace();
	}
}
});
btnNewCustomerForm.setBounds(10, 80, 200, 50);
btnNewCustomerForm.setBackground(Color.BLACK);
btnNewCustomerForm.setForeground(Color.WHITE);
contentPane.add(btnNewCustomerForm);

JButton btnNewButton = new JButton("Check Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckOut check;
				try {
	check = new CheckOut();
	check.setVisible(true);
	setVisible(false);
				} catch (Exception e1) {
	e1.printStackTrace();
				}
		}
		});
		btnNewButton.setBounds(10, 150, 200, 50);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);

		contentPane.add(btnNewButton);
		JButton btnNewButton_3 = new JButton("Pickup Service");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				PickUp pick = new PickUp();
				pick.setVisible(true);
                                setVisible(false);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
		});
		btnNewButton_3.setBounds(10, 220, 200, 50);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.WHITE);
		contentPane.add(btnNewButton_3);
		JButton btnSearchRoom = new JButton("Search Room");
		btnSearchRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				SearchRoom search = new SearchRoom();
				search.setVisible(true);
                                setVisible(false);
		}
		catch (Exception ss)
		{
			ss.printStackTrace();
		}
		}
		});
		btnSearchRoom.setBounds(10, 290, 200, 50);
		btnSearchRoom.setBackground(Color.BLACK);
		btnSearchRoom.setForeground(Color.WHITE);

		contentPane.add(btnSearchRoom);

		JButton btnNewButton_7 = new JButton("Log Out");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
                                    new Login().setVisible(true);
                                    setVisible(false);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
		});
		btnNewButton_7.setBounds(10, 360, 200, 50);
		btnNewButton_7.setBackground(Color.BLACK);
		btnNewButton_7.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_7);
		getContentPane().setBackground(Color.WHITE);

		setVisible(true);
		}
		}
