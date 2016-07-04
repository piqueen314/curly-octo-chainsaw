package mil.af.swafs; 

import java.util.Map;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HeaderController {
	
	private static final Logger logger = LoggerFactory.getLogger(HeaderController.class);
	
	/**
	 * getAllHeaders maps ALL RequestHeaders into Map allowing us to 
	 * iterate through all elements easily
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAllHeaders(Model model, @RequestHeader Map<String,String> headers ) {
		
		logger.info("Inside getAllHeaders() method...");
		for (String elem: headers.keySet()) {
			logger.info(elem + " : " + headers.get(elem));
			
		}
		// Add entire header Map into model, use JSP to iterate through the collection
		model.addAttribute("headers", headers);
		return "index";
	}

	
}
