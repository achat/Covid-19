import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdminCheckGUI extends JFrame {
	private JLabel adminID;
	private JTextField adminIDText;
	private JButton okBtn;
	private Admin admin;
	
	public AdminCheckGUI(Admin admin){
	    this.admin = admin;
		JLabel adminID = new JLabel("Admin ID:");
		JTextField adminIDText = new JTextField();
		JButton okBtn = new JButton("Submit");
		ButtonListener l = new ButtonListener();
		this.add(adminID);
		this.add(adminIDText);
		this.add(okBtn);
		okBtn.addActionListener(l);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(100,100);
		this.setTitle("Admin ID check");
		
	}
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(okBtn)){
				if(adminIDText.getText().equals(admin.getAdminID())){
					AdminGUI aGUI = new AdminGUI(admin);
				}
			}
			
		}
}
