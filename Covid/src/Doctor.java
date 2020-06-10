import java.util.ArrayList;

public class Doctor extends User {
	private String doctorID;
	private ArrayList<Civilian> patientsList = new ArrayList<>();
	

	public Doctor(String username, String password, String doctorID, String name, ArrayList<Civilian> patientsList) {
		super(username, password, name);
		this.doctorID = doctorID;
		this.patientsList = patientsList;
	}
	
	public ArrayList<Civilian> viewPatients(){
		return patientsList;
	}
		
	
	public void addPatient(Civilian c){
		patientsList.add(c);
	}

	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}

	

	public ArrayList<Civilian> getPatientsList() {
		return patientsList;
	}

	public void setPatientsList(ArrayList<Civilian> patientsList) {
		this.patientsList = patientsList;
	}

}
