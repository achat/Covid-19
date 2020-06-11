import java.util.ArrayList;

public class Doctor extends User {
	private ArrayList<Civilian> patientsList = new ArrayList<>();
	

	public Doctor(String username, String password, String name, ArrayList<Civilian> patientsList) {
		super(username, password, name);
		this.patientsList = patientsList;
	}
	
	public ArrayList<Civilian> viewPatients(){
		return patientsList;
	}
		
	
	public void addPatient(Civilian c){
		patientsList.add(c);
	}

}
