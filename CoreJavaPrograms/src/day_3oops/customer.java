package day_3oops;

public class customer {
	private int cid;
	private String canme;
	private String address;
	
	//Getter and Setter
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCanme() {
		return canme;
	}
	public void setCanme(String canme) {
		this.canme = canme;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Tostring method
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", canme=" + canme + ", address=" + address + "]";
	}
	
	
	
	
	

}
