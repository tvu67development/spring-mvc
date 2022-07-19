package DiamondShop.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value= {"/", "/trang-chu/"})
	// Model để set và truyền dữ liệu, View dùng để hiển thị dữ liệu
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("user/index");
		// mv.setViewName("user/index");
		return mv;
	}
	
	@RequestMapping(value= {"product"})
	// Model để set và truyền dữ liệu, View dùng để hiển thị dữ liệu
	public ModelAndView product() {
		ModelAndView mv = new ModelAndView("user/product");
		// mv.setViewName("user/index");
		return mv;
	}
}
