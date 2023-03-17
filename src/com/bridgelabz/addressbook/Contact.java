package com.bridgelabz.addressbook;

public class Contact {
	 private String FirstName;
     private String LastName;
	 private String Address;
	 private String City;
     private String State;
	 private long ZipCode;
	 private long MobileNo;
	 
	 public Contact(String FirstName, String LastName, String Address, String City, String State, long ZipCode,
				long MobileNo) {
		    super();
		    this.FirstName = FirstName;
			this.LastName = LastName;
			this.Address = Address;
			this.City = City;
			this.State = State;
			this.ZipCode = ZipCode;
			this.MobileNo = MobileNo;
	 }

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public long getZipCode() {
		return ZipCode;
	}

	public void setZipCode(long zipCode) {
		ZipCode = zipCode;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Contact [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City=" + City
				+ ", State=" + State + ", ZipCode=" + ZipCode + ", MobileNo=" + MobileNo + "]";
	}
	
	
	
		 
}
