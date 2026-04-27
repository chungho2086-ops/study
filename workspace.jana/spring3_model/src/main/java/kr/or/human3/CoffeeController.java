package kr.or.human3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CoffeeController {

    @RequestMapping("/coffee")
    public String coffee() {
        return "Coffee";
    }

    @RequestMapping("/order")
    public String order(
            @RequestParam("type") String type,
            @RequestParam("count") int count,
            Model model) {

        int price = 0;
        String menuName = type;

      
        if(type.contains(":")) {
            String[] arr = type.split(":");

            menuName = arr[0];
            price = Integer.parseInt(arr[1]);
        }

        int total = price * count;

        System.out.println("메뉴명 : " + menuName);
        System.out.println("가격 : " + price);
        System.out.println("수량 : " + count);
        System.out.println("총금액 : " + total);

        model.addAttribute("type", menuName);
        model.addAttribute("count", count);
        model.addAttribute("total", total);

        return "Coffee";
    }

    @ResponseBody
    @RequestMapping("/ajaxOrder")
    public Map<String, Object> ajaxOrder(
            @RequestParam("type") String type,
            @RequestParam("count") int count) {

        int price = 0;
        String menuName = type;

       
        if(type.contains(":")) {
            String[] arr = type.split(":");

            menuName = arr[0];
            price = Integer.parseInt(arr[1]);
        }

        int total = price * count;

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("type", menuName);
        map.put("count", count);
        map.put("total", total);

        return map;
    }
}