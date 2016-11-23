
public class Room {
	
	private int roomNum;
	private String status;
	private int patients;
	
	public Room(int roomNum, String status) {
		this.roomNum = roomNum;
		this.status = status;
		patients = 0;
	}
	
	public Room(int roomNum, String status, int patients) {
		this.roomNum = roomNum;
		this.status = status;
		this.patients = patients;
	}
	
	public int getRoomNum() {
		return roomNum;
	}
	
	public String getStatus() {
		return status;
	}
	
	public int getPatients() {
		return patients;
	}
	
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setPatients(int patients) {
		this.patients = patients;
	}
	
	public String toString() {
		return "<html>Room " + roomNum + "<br />" + status + "</html>";
	}
}
