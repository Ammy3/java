package nuc.ss.shopping.entity;

public class Category {
	private int id;
	private String firstLevel;
	private String secondLevel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstLevel() {
		return firstLevel;
	}
	public void setFirstLevel(String firstLevel) {
		this.firstLevel = firstLevel;
	}
	public String getSecondLevel() {
		return secondLevel;
	}
	public void setSecondLevel(String secondLevel) {
		this.secondLevel = secondLevel;
	}
	
	public Category() {
		super();
	}
	public Category(int id, String firstLevel, String secondLevel) {
		super();
		this.id = id;
		this.firstLevel = firstLevel;
		this.secondLevel = secondLevel;
	}
	@Override
	public String toString() {
		return  firstLevel +">"+ secondLevel;
	}
	
	
}
