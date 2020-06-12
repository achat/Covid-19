import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class Civilian_GUI extends JFrame {
	private Civilian civilian;
	public Civilian_GUI(Civilian civilian) {
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
		
		JLabel lblNewLabel = new JLabel("Ξ”ΞΉΞ¬Ξ»ΞµΞΎΞµ Ο„ΞΏΞ½ Ο€Ο�ΞΏΟƒΟ‰Ο€ΞΉΞΊΟ� ΟƒΞΏΟ… Ξ³ΞΉΞ±Ο„Ο�Ο�:");
		getContentPane().add(lblNewLabel, "14, 2");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Ξ“ΞΉΞ±Ο„Ο�Ο�Ο‚ 1");
		getContentPane().add(chckbxNewCheckBox, "14, 4");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Ξ“ΞΉΞ±Ο„Ο�Ο�Ο‚ 2");
		getContentPane().add(chckbxNewCheckBox_1, "14, 6");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Ξ“ΞΉΞ±Ο„Ο�Ο�Ο‚ 3");
		getContentPane().add(chckbxNewCheckBox_2, "14, 8");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Ξ“ΞΉΞ±Ο„Ο�Ο�Ο‚ 4");
		getContentPane().add(chckbxNewCheckBox_3, "14, 10");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Ξ“ΞΉΞ±Ο„Ο�Ο�Ο‚ 5");
		getContentPane().add(chckbxNewCheckBox_4, "14, 12");
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Ξ“ΞΉΞ±Ο„Ο�Ο�Ο‚ 6");
		getContentPane().add(chckbxNewCheckBox_5, "14, 14");
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Ξ“ΞΉΞ±Ο„Ο�Ο�Ο‚ 7");
		getContentPane().add(chckbxNewCheckBox_6, "14, 16");
	}

}
