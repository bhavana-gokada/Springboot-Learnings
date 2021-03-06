package springDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class ManipulateDetails {
	
	List<Details> details=Arrays.asList(new Details(501,"Raj","Assistant System Engineer"),
			new Details(511,"Sai","Operational Manager"),
			new Details(521,"Rohan","Hiring Manager"));
	
	public List<Details> getAllDetails(){
		return details;
	}
	
	public Details getDetails(int id) {
		return details.stream().filter(t ->(t.getId()==(id))).collect(Collectors.toList()).get(0);
	}
}
