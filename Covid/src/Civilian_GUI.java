import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

public class Civilian_GUI extends JFrame {
	public Civilian_GUI(Civilian civilian) {
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Choose your personal Doctor from the list: ");
		getContentPane().add(lblNewLabel, "14, 2");
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Doctor 1� 1");
		getContentPane().add(chckbxNewCheckBox, "14, 4");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Doctor 2� 2");
		getContentPane().add(chckbxNewCheckBox_1, "14, 6");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Doctor 3� 3");
		getContentPane().add(chckbxNewCheckBox_2, "14, 8");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Doctor 4� 4");
		getContentPane().add(chckbxNewCheckBox_3, "14, 10");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Doctor 5� 5");
		getContentPane().add(chckbxNewCheckBox_4, "14, 12");
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Doctor 6� 6");
		getContentPane().add(chckbxNewCheckBox_5, "14, 14");
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Doctor 7� 7");
		getContentPane().add(chckbxNewCheckBox_6, "14, 16");
		
	}}
		
		
	
			
					 
				 
			 
		 



