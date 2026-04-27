package kr.or.human3;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class calorieController {
	// SSR
	@RequestMapping("/calorie")
	public String calorie(
	        @RequestParam(required=false) String type,
	        @RequestParam(required=false) Integer value,
	        HttpSession session,
	        Model model) {

	    Integer cal = (Integer) session.getAttribute("calorie");

	    if (cal == null) {
	        cal = 0;
	    }

	    if (type != null && value != null) {

	        if (type.equals("eat")) {
	            cal += (int)(value * 0.1);
	        } else if (type.equals("work")) {
	            cal -= value;
	        }
	    }

	    if (cal < 0) cal = 0;

	    session.setAttribute("calorie", cal);
	    model.addAttribute("calorie", cal);

	    return "calorie";
	}
	
	// CSR(ajax)
	@RequestMapping("/calorieAjax")
	@ResponseBody
	public Map<String, Integer> calorieAjax(
			@RequestParam String type,
			@RequestParam int value,
			@RequestParam int nowCal) {
		
		int cal = nowCal;
		
		if(type.equals("eat")) {
			cal += (int)(value * 0.1);
		} else if(type.equals("work")) {
			cal -= value;
		}
		
		if(cal < 0) cal = 0;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("calorie", cal);
		
		return map;
	}
}
