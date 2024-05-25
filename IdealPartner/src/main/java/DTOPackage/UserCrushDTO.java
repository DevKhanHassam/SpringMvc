package DTOPackage;

public class UserCrushDTO {

	private String yourName;
	private String crushName;
	public String getYourName() {
		return yourName;
	}
	public void setYourName(String yourName) {
		this.yourName = yourName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "UserCrushDTO [yourName=" + yourName + ", crushName=" + crushName + "]";
	}
	
	
	
	
	
}
