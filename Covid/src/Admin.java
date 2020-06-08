import java.util.ArrayList;

public class Admin extends User {
	private String adminID;
	private ArrayList<Doctor> doctorsList = new ArrayList<>();
	private ArrayList<Civilian> civiliansList = new ArrayList<>();

	
	public Admin(String username, String password, String adminID, ArrayList<Doctor> doctorsList,
			ArrayList<Civilian> civiliansList) {
		super(username, password);
		this.adminID = adminID;
		this.doctorsList = doctorsList;
		this.civiliansList = civiliansList;
	}
	
	public void addDoctor(Doctor d){
		doctorsList.add(d);
	}
	
	public void addCivilian(Civilian c){
		civiliansList.add(c);
	}

	public String getAdminID() {
		return adminID;
	}

	public ArrayList<Doctor> getDoctorsList() {
		return doctorsList;
	}

	public ArrayList<Civilian> getCiviliansList() {
		return civiliansList;
	}

}
