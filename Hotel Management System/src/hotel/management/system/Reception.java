package hotel.management.system;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
public
class Reception extends JFrame
{

private
	JPanel contentPane;

public
	static void main(String[] args)
	{
		new Reception();
	}

public
	Reception()
	{

		setBounds(300, 100, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/reception1.jpg"));
		Image i3 = i1.getImage().getScaledInstance(600, 420, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i3);
		JLabel l1 = new JLabel(i2);
		l1.setBounds(250, 30, 500, 480);
		add(l1);

		JButton btnNewButton = new JButton("Rooms Info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				Room room = new Room();
				room.setVisible(true);
                                setVisible(false);
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
});
btnNewButton.setBounds(10, 100, 200, 50);
btnNewButton.setBackground(Color.BLACK);
btnNewButton.setForeground(Color.WHITE);

contentPane.add(btnNewButton);
JButton btnNewButton_3 = new JButton("Customer Info");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					CustomerInfo customer = new CustomerInfo();
					customer.setVisible(true);				
					setVisible(false);
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		}
		});
		btnNewButton_3.setBounds(10, 170, 200, 50);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_3);
		JButton btnNewButton_5 = new JButton("Update Check Status");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				UpdateCheck update = new UpdateCheck();
				update.setVisible(true);
                                setVisible(false);
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		}
		});
		btnNewButton_5.setBounds(10, 240, 200, 50);
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Update Room Status");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					UpdateRoom room = new UpdateRoom();
					room.setVisible(true);
                                        setVisible(false);
		}
		catch (Exception s)
		{
			s.printStackTrace();
		}
		}
		});
		btnNewButton_6.setBounds(10, 310, 200, 50);
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_6);
		JButton btnNewButton_7 = new JButton("Log Out");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
                                    new Login().setVisible(true);
                                    new Dashboard().setVisible(false);
                                    setVisible(false);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
		});
		btnNewButton_7.setBounds(10, 380, 200, 50);
		btnNewButton_7.setBackground(Color.BLACK);
		btnNewButton_7.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_7);
		getContentPane().setBackground(Color.WHITE);

		setVisible(true);
		}
		}
