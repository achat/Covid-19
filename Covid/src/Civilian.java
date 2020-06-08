
public class Civilian extends User {
	private String name;
	private int riskStatus;

	public Civilian(String username, String password, String name, int riskStatus) {
		super(username, password);
		this.name = name;
		this.riskStatus = riskStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRiskStatus() {
		return riskStatus;
	}

	public void setRiskStatus(int riskStatus) {
		this.riskStatus = riskStatus;
	}

}
