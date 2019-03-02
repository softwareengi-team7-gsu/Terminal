import java.util.ArrayList;

// Defining Crew
class CrewInformation {
	private String pilot;
	private String coPilot;
	private String pictureID;
	private int idNumber;
	private String eyeColor;
	private double height;
	CrewInformation() {
		
	}
	public CrewInformation(String pilot, String coPilot, String pictureID,
			int idNumber, String eyeColor, double height) {
		super();
		this.pilot = pilot;
		this.coPilot = coPilot;
		this.pictureID = pictureID;
		this.idNumber = idNumber;
		this.eyeColor = eyeColor;
		this.height = height;
	}
	public String getPilot() {
		return pilot;
	}
	public void setPilot(String pilot) {
		this.pilot = pilot;
	}
	public String getCoPilot() {
		return coPilot;
	}
	public void setCoPilot(String coPilot) {
		this.coPilot = coPilot;
	}
	public String getPictureID() {
		return pictureID;
	}
	public void setPictureID(String pictureID) {
		this.pictureID = pictureID;
	}
	public int getIDNumber() {
		return idNumber;
	}
	public void setIDNumber(int newID) {
		this.idNumber = newID;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eColor) {
		this.eyeColor = eColor;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
}	

// Defining data inside crew list
class CrewList {
	// This is the whole database of the crew list
	ArrayList<CrewInformation> CrewList = new ArrayList<CrewInformation> ();
	// Create a new crew
	public void createNewCrew(String nPilot, String nCoPilot, String nPicID,
			int nIDNum, String nEyeColor, double nHeight) {
		CrewInformation newCrew = new CrewInformation(nPilot, nCoPilot, nPicID, nIDNum, nEyeColor, nHeight);
		CrewList.add(newCrew);
	}
}
public class Crew {
	public static void main(String args[]) {
		CrewList list1 = new CrewList();
		
		list1.createNewCrew("ZhiyiDong", "ZhiyiDong", "picID", 123, "BLK", 1.76);

	}
}
