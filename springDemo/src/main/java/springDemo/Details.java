package springDemo;

public class Details {
	int id;
	String name;
	String jobDescription;
	
	
	public Details() {
	}
	
	public Details(int id, String name, String jobDescription) {
		super();
		this.id = id;
		this.name = name;
		this.jobDescription = jobDescription;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	
}
