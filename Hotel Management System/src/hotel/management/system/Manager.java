package hotel.management.system;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
public
class Manager extends JFrame
{

private
	JPanel contentPane;

public
	static void main(String[] args)
	{
		new Manager();
	}

public
	Manager()
	{

		setBounds(300, 100, 850, 570);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/Manager1.jpg"));
		Image i3 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i3);
		JLabel l1 = new JLabel(i2);
		l1.setBounds(250, 30, 500, 470);
		add(l1);
		JLabel Manager = new JLabel("MANAGER");
		Manager.setForeground(Color.BLACK);
		Manager.setFont(new Font("Tahoma", Font.PLAIN, 46));
		Manager.setBounds(150, 350, 500, 85);
		l1.add(Manager);
		JButton btnNewRoom = new JButton("Add Room");
		btnNewRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				AddRoom rom = new AddRoom();
				rom.setVisible(true);
                                setVisible(false);
	}
	catch (Exception e1)
	{
		e1.printStackTrace();
	}
}
});
btnNewRoom.setBounds(10, 70, 200, 30);
btnNewRoom.setBackground(Color.BLACK);
btnNewRoom.setForeground(Color.WHITE);
contentPane.add(btnNewRoom);

JButton btnNewEmployee = new JButton("Add Employee");
		btnNewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				AddEmployee employ = new AddEmployee();
				employ.setVisible(true);
                                setVisible(false);
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		}
		});
		btnNewEmployee.setBounds(10, 110, 200, 30);
		btnNewEmployee.setBackground(Color.BLACK);
		btnNewEmployee.setForeground(Color.WHITE);
		contentPane.add(btnNewEmployee);

		JButton btnNewDriver = new JButton("Add Driver");
		btnNewDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				AddDrivers drv = new AddDrivers();
				drv.setVisible(true);
                                setVisible(false);
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		}
		});
		btnNewDriver.setBounds(10, 150, 200, 30);
		btnNewDriver.setBackground(Color.BLACK);
		btnNewDriver.setForeground(Color.WHITE);
		contentPane.add(btnNewDriver);

		JButton btnNewButton = new JButton("All Employee Info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Employee em = new Employee();
					em.setVisible(true);
                                setVisible(false);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
		});
		btnNewButton.setBounds(10, 190, 200, 30);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);

		contentPane.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("Manager Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				

ManagerInfo mana = new ManagerInfo();
				mana.setVisible(true);
					setVisible(false);
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		}
		});
		btnNewButton_2.setBounds(10, 230, 200, 30);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_2);

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
		btnNewButton_3.setBounds(10, 270, 200, 30);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_3);

		JButton btnManagerInfo = new JButton("Rooms info");
		btnManagerInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				
                                                                        Room room = new Room();
				room.setVisible(true);
                                setVisible(false);
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		}
		});
		btnManagerInfo.setBounds(10, 310, 200, 30);
		btnManagerInfo.setBackground(Color.BLACK);
		btnManagerInfo.setForeground(Color.WHITE);

		contentPane.add(btnManagerInfo);

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
		btnNewButton_5.setBounds(10, 350, 200, 30);
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
		btnNewButton_6.setBounds(10, 390, 200, 30);
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_6);

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
		btnNewButton_7.setBounds(10, 430, 200, 30);
		btnNewButton_7.setBackground(Color.BLACK);
		btnNewButton_7.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_7);
		getContentPane().setBackground(Color.WHITE);

		setVisible(true);
		}
		}
