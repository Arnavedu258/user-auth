
public class Admindetail {
	
	
	private String name;
	private String password;
	private String email;
	private String adminid;
	
	public void Setname(String i) {
		this.name=i;
	}
	public void Setpassword(String j) {
		this.password=j;
	}
	public void Setemail(String k) {
		this.email=k;
	}
	public void SetAdmin(String l) {
		this.adminid=l;
	}
	
	
	public String getname(){
		return this.name;
	}
	public String getpassword(){
		return this.password;
	}
	public String getemail(){
		return this.email;
	}
	public String getadmin(){
		return this.adminid;
	}
	
	
}
