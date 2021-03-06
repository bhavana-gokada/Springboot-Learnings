package springDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {
		
		
		@Autowired
		private ManipulateDetails manipulate;
		
		@RequestMapping("/Details")
		public List<Details> getDetails() {
			return manipulate.getAllDetails();
		}
		@RequestMapping("/Details/{id}")
		public Details getDetails(@PathVariable("id") int id) {
		return manipulate.getDetails(id);
		}
		
}
