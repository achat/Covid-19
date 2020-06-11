import java.awt.EventQueue;
import java.util.ArrayList;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		ArrayList<Doctor> doctorsList = new ArrayList<>();
		ArrayList<Civilian> civiliansList = new ArrayList<>();
		Admin admin = new Admin("admin", "admin", "admin", "2345", doctorsList, civiliansList);
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					LoginPanel window = new LoginPanel(admin);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
