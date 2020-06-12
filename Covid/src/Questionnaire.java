import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JCheckBox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Questionnaire extends JFrame
{

<<<<<<< HEAD
	private Civilian civilian;
	private int nOfSymptoms=0;
	
	
	public Questionnaire(Civilian civilian) {
				
		    this.civilian = civilian;
=======
	
	private int nOfSymptoms=0;
	
	
	public Questionnaire() {
				
		
>>>>>>> f5fd9698dd887eab696622b7963f35d91ae12823
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
					nOfSymptoms++;
				}
			}
		}); 
		
		JCheckBox c = new JCheckBox("Cough?");
		getContentPane().add(c, "12, 4");
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.isSelected()) {
					nOfSymptoms++;
				}
			}
		}); 
		
		JCheckBox c1 = new JCheckBox("Shortness of breath or difficulty breathing?");
		getContentPane().add(c1, "12, 6");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c1.isSelected()) {
					nOfSymptoms++;
				}
			}
		}); 
		
		JCheckBox c2 = new JCheckBox("Fatigue?");
		getContentPane().add(c2, "12, 8");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c2.isSelected()) {
					nOfSymptoms++;
				}
			}
		}); 
		
		JCheckBox c3 = new JCheckBox("Muscle or body aches?");
		getContentPane().add(c3, "12, 10");
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c3.isSelected()) {
					nOfSymptoms++;
				}
			}
		}); 
		
		JCheckBox c4 = new JCheckBox("Headache?");
		getContentPane().add(c4, "12, 12");
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c4.isSelected()) {
					nOfSymptoms++;
				}
			}
		}); 
		
		JCheckBox c5 = new JCheckBox("New loss of taste or smell?");
		getContentPane().add(c5, "12, 14");
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c5.isSelected()) {
					nOfSymptoms++;
				}
			}
		}); 
		
		JCheckBox c6 = new JCheckBox("Nausea or vomiting?");
		getContentPane().add(c6, "12, 16");
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c6.isSelected()) {
					nOfSymptoms++;
				}
			}
		}); 
		
		JCheckBox c8 = new JCheckBox("Soreness?");
		getContentPane().add(c8, "12, 18");
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c8.isSelected()) {
					nOfSymptoms++;
				}
			}
		}); 
		
		JButton btn = new JButton("Submit");
		getContentPane().add(btn, "18, 18");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent i) {
				if(i.getSource().equals(btn)){
					if(nOfSymptoms >= 6) {
<<<<<<< HEAD
						civilian.setRiskStatus(true);
					}
				}
					
			}
		});
	}
}
=======
						Civilian.setRiskStatus(nOfSymptoms);
					}
				}
					
				}
			}
		});
		
		
			
			
			
		}
>>>>>>> f5fd9698dd887eab696622b7963f35d91ae12823
