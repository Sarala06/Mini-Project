package college;

public class Record {

	private String name;
	private int idNumber;
	private String contactNumber;

	public Record() {
	}

	public Record(String name, int idNumber, String contactNumber) {
		this.name = name;
		this.idNumber = idNumber;
		this.contactNumber = contactNumber;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String i) {

		this.contactNumber = i;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Records{" + "name=" + name + ", idNumber=" + idNumber + ", contactNumber=" + contactNumber + '}';
	}
}
