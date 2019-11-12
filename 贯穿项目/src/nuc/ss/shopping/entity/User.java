package nuc.ss.shopping.entity;

public class User implements Cloneable{
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", sex=" + sex + ", city=" + city + "]";
	}

	private String id;
	private String name=null;
	private String password=null;
	private byte sex;
	private String city;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte getSex() {
		return sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User() {
		super();
	}

	public User(String id, String name, String password, byte sex, String city) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.city = city;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
