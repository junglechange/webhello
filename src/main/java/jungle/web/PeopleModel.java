package jungle.web;

public class PeopleModel {
	public Integer id;
	private String name;
	
	public PeopleModel(){}
	
	public PeopleModel(Integer thatid,String thatname){
		this.id=thatid;
		this.name=thatname;
	}
	
	public Integer getId(){
		return id;
	}
	public String getName() {
		return name;
	}
}
