import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class AdminGUI extends JFrame {

	private JPanel contentPane;

	public AdminGUI() {
		setTitle("Admin Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 238, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Number of Civilians:");
		
		JLabel lblNewLabel_1 = new JLabel("Number of Doctors:");
		
		JLabel lblNumberOfHighrisk = new JLabel("Number of high-risk civilians:");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNumberOfHighrisk, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addContainerGap(267, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(41)
					.addComponent(lblNewLabel)
					.addGap(50)
					.addComponent(lblNewLabel_1)
					.addGap(48)
					.addComponent(lblNumberOfHighrisk)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
