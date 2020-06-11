
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JList;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

public class Questionnaire extends JFrame {
	public Questionnaire() {
		
		JPanel panel = new JPanel();
		String title = "Questionnaire";
		Border border = BorderFactory.createTitledBorder(title);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
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
		
		JCheckBox c = new JCheckBox("Εχεις έρθει σε επαφή με επιβεββαιωμένο κρούσμα;");
		panel.add(c, "12, 2");
		
		JCheckBox c1 = new JCheckBox("Έχεις πυρετό;");
		panel.add(c1, "12, 4");
		
		JCheckBox c2 = new JCheckBox("Έχεις βήχα;");
		panel.add(c2, "12, 6");
		
		JCheckBox c3 = new JCheckBox("Έχεις παρουσιάσει συμπτώματα ανοσμίας;");
		panel.add(c3, "12, 8");
		
		JCheckBox c4 = new JCheckBox("Έχεις απώλεια γεύσης;");
		panel.add(c4, "12, 10");
		
		JCheckBox c5 = new JCheckBox("Έχεις ταξιδέψει στο εξωτερικό πρόσφατα;");
		panel.add(c5, "12, 12");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Έχεις δυσκολία στην αναπνοή;");
		panel.add(chckbxNewCheckBox, "12, 14");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Έχεις μυαλγίες;");
		panel.add(chckbxNewCheckBox_1, "12, 16");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Έχεις συμπτώματα καταβολής;");
		panel.add(chckbxNewCheckBox_2, "12, 18");
		
		
		
	}

}
