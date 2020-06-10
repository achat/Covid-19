import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginPanel extends JFrame {
	private JPanel login;
	private JPanel civilianRegister;
	private JPanel doctorRegister;
	private JTextField loginUsername;
	private JTextField loginPassword;
	private JTextField civilianRegisterUsername;
	private JTextField civilianRegisterPassword;
	private JTextField civilianRegisterName;
	private JTextField doctorRegisterUsername;
	private JTextField doctorRegisterPassword;
	private JTextField doctorRegisterName;
	private JLabel loginLabel;
	private JLabel civilianRegisterLabel;
	private JLabel doctorRegisterLabel;
	private JButton loginButton;
	private JButton civilianRegisterButton;
	private JButton doctorRegisterButton;
	private User user;
	private Admin admin;
	
	public LoginPanel(User user, Admin admin){
		this.user = user;
		this.admin = admin;
		
		//Main Frame:
		login = new JPanel();
		civilianRegister = new JPanel();
		doctorRegister = new JPanel();
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		login.setLayout(new BoxLayout(login, BoxLayout.Y_AXIS));
		civilianRegister.setLayout(new BoxLayout(civilianRegister, BoxLayout.Y_AXIS));
		doctorRegister.setLayout(new BoxLayout(doctorRegister, BoxLayout.Y_AXIS));
		this.add(login);
		this.add(civilianRegister);
		this.add(doctorRegister);
		
		//Login panel:
		loginLabel = new JLabel("Login:");
		loginUsername = new JTextField("Username");
		loginPassword = new JTextField("Password");
		loginButton = new JButton("Login");
		login.add(loginLabel);
		login.add(loginUsername);
		login.add(Box.createRigidArea(new Dimension(0,30)));
		login.add(loginPassword);
		login.add(loginButton);
		loginButton.setAlignmentX(CENTER_ALIGNMENT);
		login.add(Box.createRigidArea(new Dimension(0,30)));
		
		//Civilian Register panel:
		civilianRegisterLabel = new JLabel("Civilian Register:");
		civilianRegisterName = new JTextField("Name");
		civilianRegisterUsername = new JTextField("Username");
		civilianRegisterPassword = new JTextField("Password");
		civilianRegisterButton = new JButton("Register");
		civilianRegister.add(civilianRegisterLabel);
		civilianRegister.add(civilianRegisterName);
		civilianRegister.add(Box.createRigidArea(new Dimension(0,15)));
		civilianRegister.add(civilianRegisterUsername);
		civilianRegister.add(Box.createRigidArea(new Dimension(0,15)));
		civilianRegister.add(civilianRegisterPassword);
		civilianRegister.add(civilianRegisterButton);
		civilianRegisterButton.setAlignmentX(CENTER_ALIGNMENT);
		
		//Doctor Register panel:
		doctorRegisterLabel = new JLabel("Doctor Register:");
		doctorRegisterName = new JTextField("Name");
		doctorRegisterUsername = new JTextField("Username");
		doctorRegisterPassword = new JTextField("Password");
		doctorRegisterButton = new JButton("Register");
		doctorRegister.add(doctorRegisterLabel);
	    doctorRegister.add(doctorRegisterName);
		doctorRegister.add(doctorRegisterUsername);
		doctorRegister.add(doctorRegisterPassword);
		doctorRegister.add(doctorRegisterButton);
		doctorRegisterButton.setAlignmentX(CENTER_ALIGNMENT);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("COVID-19 Main Page");
		this.setSize(600, 600);
		ButtonListener listener = new ButtonListener();
		loginButton.addActionListener(listener);
		civilianRegisterButton.addActionListener(listener);
		doctorRegisterButton.addActionListener(listener);
		
	}
	
	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(civilianRegisterButton)){
				for(User u: admin.getCiviliansList()){
					if(u.getUsername() == civilianRegisterUsername.getText()){
						System.out.println("Username already exists");
					}else{
						user.setUsername(civilianRegisterUsername.getText());
						user.setPassword(civilianRegisterPassword.getText());
						user.setName(civilianRegisterName.getText());
					}
				}
			}
		}
	}
}
