
package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmployeeController {

	/**
	 *  If end user enters /show in browser
	 *  then Our App will show Welcome.jsp page
	 */

	@RequestMapping("/all")
	public String showPage() {
		return "Welcome";
	}

}