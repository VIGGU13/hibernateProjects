package oneToManyUniDirection;

import java.util.List;

import javax.persistence.*;


@Entity
public class Deapartment {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String loc;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employees> emps;
	
	public List<Employees> getEmps() {
		return emps;
	}
	public void setEmps(List<Employees> emps) {
		this.emps = emps;
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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Deapartment [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}
	
}
