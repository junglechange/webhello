package jungle.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("peopledao")
public class PeopleDao {
	public int num;

	public PeopleDao(){

	};
	
	public PeopleDao(@Qualifier("testBean") TestBean testBean){
		System.out.println(testBean.a);
	}
	
	public List<PeopleModel> getAllPeoples(){
		List<PeopleModel> peopleModels=new ArrayList<PeopleModel>();
		peopleModels.add(new PeopleModel(1, "jun"));
		peopleModels.add(new PeopleModel(2,"wsf"));
		
		return peopleModels;
	}
	
	public void setNum(int num){
		this.num=num;
	}

}
