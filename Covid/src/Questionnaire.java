import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Questionnaire extends JFrame
{

	private Civilian civilian;
	private int nOfSymptoms=0;
	private int q1, q2, q3, q4, q5, q6, q7, q8, q = 0;
	
	
	public Questionnaire(Civilian civilian) {
				
		 this.civilian = civilian;
				
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
			
		
		JCheckBox c7 = new JCheckBox("Fever or chills?");
		getContentPane().add(c7, "12, 2");
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c7.isSelected()) {
					q7 = 1;
				}else{
					q7 = 0;
				}
			}
		}); 
		
		JCheckBox c = new JCheckBox("Cough?");
		getContentPane().add(c, "12, 4");
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.isSelected()) {
					q = 1;
				}else{
					q = 0;
				}
			}
		}); 
		
		JCheckBox c1 = new JCheckBox("Shortness of breath or difficulty breathing?");
		getContentPane().add(c1, "12, 6");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c1.isSelected()) {
					q1 = 1;
				}else {
					q1 = 0;
				}
			}
		}); 
		
		JCheckBox c2 = new JCheckBox("Fatigue?");
		getContentPane().add(c2, "12, 8");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c2.isSelected()) {
					q2 = 1;
				}else {
					q2 = 0;
				}
			}
		}); 
		
		JCheckBox c3 = new JCheckBox("Muscle or body aches?");
		getContentPane().add(c3, "12, 10");
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c3.isSelected()) {
					q3 = 1;
				}else{
					q3 = 0;
				}
			}
		}); 
		
		JCheckBox c4 = new JCheckBox("Headache?");
		getContentPane().add(c4, "12, 12");
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c4.isSelected()) {
					q4 = 1;
				}else{
					q4 = 0;
				}
			}
		}); 
		
		JCheckBox c5 = new JCheckBox("New loss of taste or smell?");
		getContentPane().add(c5, "12, 14");
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c5.isSelected()) {
					q5 = 1;
				}else{
					q5 = 0;
				}
			}
		}); 
		
		JCheckBox c6 = new JCheckBox("Nausea or vomiting?");
		getContentPane().add(c6, "12, 16");
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c6.isSelected()) {
					q6 = 1;
				}else{
					q6 = 0;
				}
			}
		}); 
		
		JCheckBox c8 = new JCheckBox("Soreness?");
		getContentPane().add(c8, "12, 18");
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c8.isSelected()) {
					q8 = 1;
				}else{
					q8 = 0;
				}
			}
		}); 
		nOfSymptoms = q + q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8;
		JButton btn = new JButton("Submit");
		getContentPane().add(btn, "18, 18");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent i) {
				if(i.getSource().equals(btn)){
					if(nOfSymptoms >= 6) {
						civilian.setRiskStatus(true);
					}
				}
				dispose();
					
			}
		});
	}
}
					
