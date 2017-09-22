package net.Shop.myShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.Shop.myShobackend.dao.CategoryDAO;
import net.Shop.myShopbackend.dto.Categorie;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "Home");

		// passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickHome", true);
		return mv;

	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	/**
	 * Methodes to load all the products and based on categorie
	 */
	@RequestMapping(value = { "/show/all/Vehicules" })
	public ModelAndView showAllVehicules() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "Tous les Vehicules");

		// passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllVehicules", true);
		return mv;

	}

	@RequestMapping(value = { "/show/categorie/{id}/Vehicules" })
	public ModelAndView showCategoryVehicules(@PathVariable("id") int id) {

		// categoryDAO to fetch a single category

		Categorie categorie = null;
		categorie = categoryDAO.get(id);
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", categorie.getNom_cat());

		// passing the list of categories
		mv.addObject("categories", categorie);

		// passing the single category object
		mv.addObject("categorie", categoryDAO.list());

		mv.addObject("userClickCategorieVehicules", true);
		return mv;

	}
}
