import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Civilian_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Civilian civilian;
	private Admin admin;
	private JTextField textField_1;


	public Civilian_GUI(Civilian civilian, Admin admin) {
		setTitle("Status Check");
		this.civilian = civilian;
		this.admin = admin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTypeYourDoctors = new JLabel("Type your Doctor's name:");
		
		textField = new JTextField();
		textField.setColumns(10);
		for(Doctor aDoctor: admin.getDoctorsList()){
			if(aDoctor.getName().equals(textField.getText())){
				civilian.chooseDoctor(aDoctor);
				aDoctor.addPatient(civilian);
				JOptionPane.showMessageDialog(null, "Doctor successfully selected.");
			}else{
				JOptionPane.showMessageDialog(null, "Name not found.");
			}
		}
		
		JButton btnAnswerCovidQuestionnaire = new JButton("Answer COVID_19 Questionnaire");
		btnAnswerCovidQuestionnaire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Questionnaire q = new Questionnaire(civilian);
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		if(civilian.getRiskStatus()){
			textField_1.setText("You are in high risk of being infected with COVID-19. You must communicate with your doctor and take appropiate measures.");
		}else{
			textField_1.setText("You are in low risk of being infected with COVID-19. Keep your healthy habits and stay safe.");
		}
			
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTypeYourDoctors)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAnswerCovidQuestionnaire))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_1)))
					.addContainerGap(4, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTypeYourDoctors)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnAnswerCovidQuestionnaire)
					.addGap(18)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(131, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
