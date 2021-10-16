import java.time.LocalDate;

public class Member {
	private String fName;
	private String lName;
	private String address;
	private int phoneNumer;
	private LocalDate dateJoined;
	private double fee;
	private int id = 1;
	private static int idCounter;

	public Member(String fName, String lName, String address, int phoneNumer, LocalDate dateJoined, double fee) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.phoneNumer = phoneNumer;
		this.dateJoined = dateJoined;
		this.fee = fee;
		this.id = idCounter++;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.lName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(int phoneNumer) {
		this.phoneNumer = phoneNumer;
	}

	public LocalDate getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Member [fName=" + fName + ", lName=" + lName + ", address=" + address + ", phoneNumer=" + phoneNumer
				+ ", dateJoined=" + dateJoined + ", fee=" + fee + ", id=" + id + "]";
	}

}
