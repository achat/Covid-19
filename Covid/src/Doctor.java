import java.util.ArrayList;

public class Doctor extends User {
	private String doctorID;
	private String name;
	private ArrayList<Civilian> patientsList = new ArrayList<>();
	

	public Doctor(String username, String password, String doctorID, String name, ArrayList<Civilian> patientsList) {
		super(username, password);
		this.doctorID = doctorID;
		this.name = name;
		this.patientsList = patientsList;
	}
	
	public void viewPatients() {
		for (Civilian patient: patientsList) {
			System.out.println(patient.getName());
		}
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Civilian> getPatientsList() {
		return patientsList;
	}

	public void setPatientsList(ArrayList<Civilian> patientsList) {
		this.patientsList = patientsList;
	}

}
