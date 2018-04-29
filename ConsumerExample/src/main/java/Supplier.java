import java.util.Date;

public class Supplier {

	private Integer id;
	private String name;
	private Date startDate;
	
	

	public Supplier(Integer id, String name, Date startDate) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
	}

	public Integer getID() {
		return id;
	}

	public void setID(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
}
