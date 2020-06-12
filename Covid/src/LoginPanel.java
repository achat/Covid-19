import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class LoginPanel {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	protected Admin admin;
	protected boolean doctor = true;


	public LoginPanel(Admin admin) {
		this.admin = admin;
		frame = new JFrame();
		frame.setBackground(Color.GRAY);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 423, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblSignInWith = new JLabel("Sign in:");
		lblSignInWith.setForeground(Color.WHITE);
		lblSignInWith.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setForeground(Color.WHITE);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(btnSignIn)){
					if(textField.getText().equals(admin.getUsername())&& passwordField.getPassword().toString().equals(admin.getPassword())){
						AdminCheckGUI aGUI = new AdminCheckGUI(admin);
					}
					for(Civilian aCivilian: admin.getCiviliansList()){
						if(aCivilian.getUsername().equals(textField.getText()) && aCivilian.getPassword().equals(passwordField.getPassword().toString())){
							Civilian_GUI cGUI = new Civilian_GUI(aCivilian, admin);
						}
					}
					for(Doctor aDoctor: admin.getDoctorsList()){
						if(aDoctor.getUsername().equals(textField.getText()) && aDoctor.getPassword().equals(passwordField.getPassword().toString())){
							DoctorGUI dGUI = new DoctorGUI(aDoctor);
						}else{
							JOptionPane.showMessageDialog(null, "Incorrect Username or Password.");
						}
					}
				}
			}
		});
		
		JSeparator separator = new JSeparator();
		
		JLabel lblRegisterAsCivilian = new JLabel("Sign up:");
		lblRegisterAsCivilian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRegisterAsCivilian.setForeground(Color.WHITE);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.WHITE);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(btnSignUp)){
					if(doctor){
						for(Doctor aDoctor: admin.getDoctorsList()){
							if(aDoctor.getUsername().equals(textField_3.getText())||textField_3.equals(admin.getUsername())){
								JOptionPane.showMessageDialog(null, "Username already exists. Try again.");
							}else {
								Doctor d = new Doctor(textField_3.getText(), passwordField.getPassword().toString(), textField_2.getText(), null);
								admin.addDoctor(d);
							}
						}
						
					}else {
						for(Civilian aCivilian: admin.getCiviliansList()){
							if(aCivilian.getUsername().equals(textField_3.getText())||textField_3.equals(admin.getUsername())){
								JOptionPane.showMessageDialog(null, "Username already exists. Try again.");
							}else {
								Civilian c = new Civilian(textField_3.getText(), passwordField.getPassword().toString(), textField_2.getText(), false, null);
								admin.addCivilian(c);
							}
						}
					}
			    }
			}
		});
		
		passwordField = new JPasswordField();
		
		passwordField_1 = new JPasswordField();
		
		JCheckBox chckbxSignUpAs = new JCheckBox("Sign up as Doctor");
		chckbxSignUpAs.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getSource().equals(ItemEvent.SELECTED))
					doctor = true;
			}
		});
		chckbxSignUpAs.setForeground(Color.WHITE);
		chckbxSignUpAs.setBackground(Color.DARK_GRAY);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(135)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPassword)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordField_1))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(178)
							.addComponent(btnSignIn))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(152)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblName)
								.addComponent(lblUsername)
								.addComponent(lblNewLabel_1)
								.addComponent(passwordField)
								.addComponent(textField_3)
								.addComponent(chckbxSignUpAs, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField_2)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(21)
									.addComponent(btnSignUp))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(176)
							.addComponent(lblRegisterAsCivilian))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(182)
							.addComponent(lblSignInWith)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblSignInWith)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSignIn)
					.addGap(13)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRegisterAsCivilian)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblUsername)
					.addGap(4)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxSignUpAs)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSignUp)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	
}
