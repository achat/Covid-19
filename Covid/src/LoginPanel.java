import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginPanel extends JFrame {
	private JPanel login;
	private JPanel register;
	private JTextField loginUsername;
	private JTextField loginPassword;
	private JTextField registerUsername;
	private JTextField registerPassword;
	private JTextField registerName;
	private JLabel loginLabel;
	private JLabel registerLabel;
	private JButton loginButton;
	private JButton registerButton;
	private User user;
	private Admin admin;
	
	public LoginPanel(User user, Admin admin){
		this.user = user;
		this.admin = admin;
		
		login = new JPanel();
		register = new JPanel();
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		login.setLayout(new BoxLayout(login, BoxLayout.PAGE_AXIS));
		register.setLayout(new BoxLayout(register, BoxLayout.PAGE_AXIS));
		this.add(login);
		this.add(register);
		
		loginLabel = new JLabel("Login:");
		loginUsername = new JTextField("Username");
		loginPassword = new JTextField("Password");
		loginButton = new JButton("Login");
		login.add(loginLabel);
		login.add(loginUsername);
		login.add(loginPassword);
		login.add(loginButton);
		
		registerLabel = new JLabel("Register:");
		registerName = new JTextField("Name");
		registerUsername = new JTextField("Username");
		registerPassword = new JTextField("Password");
		registerButton = new JButton("Register");
		register.add(registerLabel);
		register.add(registerName);
		register.add(registerUsername);
		register.add(registerPassword);
		register.add(registerButton);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("COVID-19 Main Page");
		this.setSize(600, 600);
		ButtonListener listener = new ButtonListener();
		loginButton.addActionListener(listener);
		registerButton.addActionListener(listener);
		
	}
	
	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(registerButton)){
				for(User u: admin.getCiviliansList()){
					if(u.getUsername() == registerUsername.getText()){
						System.out.println("Username already exists");
					}else{
						user.setUsername(registerUsername.getText());
						user.setPassword(registerPassword.getText());
						user.setName(registerName.getText());
					}
				}
			}
		}
	}
}
