import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class AdminGUI extends JFrame {

	private JPanel contentPane;
	private Admin admin;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public AdminGUI(Admin admin) {
		this.admin = admin;
		String civiliansNumber = String.valueOf(admin.getCiviliansList().size());
		String doctorsNumber = String.valueOf(admin.getDoctorsList().size());
		String highRiskCivilians;
		int n_highRiskCivilians = 0;
		for(Civilian aCivilian: admin.getCiviliansList()){
			if(aCivilian.getRiskStatus()){
				n_highRiskCivilians++;
			}
		}
		highRiskCivilians = String.valueOf(n_highRiskCivilians);
		
		setTitle("Admin Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 199, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Number of Civilians:");
		
		JLabel lblNewLabel_1 = new JLabel("Number of Doctors:");
		
		JLabel lblNumberOfHighrisk = new JLabel("High-risk civilians:");
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setText(civiliansNumber);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setText(doctorsNumber);
		
		JLabel lblNewLabel_2 = new JLabel("General Stats:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setText(highRiskCivilians);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField_1, 0, 0, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
						.addComponent(lblNewLabel_2)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNumberOfHighrisk)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_2)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textField, 0, 0, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_1, 0, 0, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textField_2, 0, 0, Short.MAX_VALUE)
						.addComponent(lblNumberOfHighrisk, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(114, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

