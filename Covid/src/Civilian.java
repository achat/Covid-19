
public class Civilian extends User {
	private int riskStatus;
	private Doctor doctor;

	public Civilian(String username, String password, String name, int riskStatus, Doctor doctor) {
		super(username, password, name);
		this.riskStatus = riskStatus;
		this.doctor = doctor;
	}


	public int getRiskStatus() {
		return riskStatus;
	}

	public void setRiskStatus(int riskStatus) {
		this.riskStatus = riskStatus;
	}
	
	public void chooseDoctor(Doctor d){
		this.doctor = d;
	
	}
	
	public Doctor getDoctor(){
		return doctor;
	}

}
