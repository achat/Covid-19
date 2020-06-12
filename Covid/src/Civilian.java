
public class Civilian extends User {
	private boolean inRisk;
	private Doctor doctor;

	public Civilian(String username, String password, String name, boolean riskStatus, Doctor doctor) {
		super(username, password, name);
		this.inRisk = riskStatus;
		this.doctor = doctor;
	}


	public boolean getRiskStatus() {
		return inRisk;
	}

	public void setRiskStatus(boolean riskStatus) {
		this.inRisk = riskStatus;
	}
	
	public void chooseDoctor(Doctor d){
		this.doctor = d;
	
	}
	
	public Doctor getDoctor(){
		return doctor;
	}

}
