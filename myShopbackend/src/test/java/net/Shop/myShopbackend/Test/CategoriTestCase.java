package net.Shop.myShopbackend.Test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.Shop.myShopbackend.dao.CategoryDAO;
import net.Shop.myShopbackend.dto.Categorie;

public class CategoriTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Categorie category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.Shop.myShopbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Test
	public void testAddCategory() {

		category = new Categorie();

		category.setNom_cat("Camions");
		category.setDescription("Tester Nos Camions");
		category.setImageURL("Cam_1.png");

		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));

	}

	//
	// @Test
	// public void testGetCategory() {
	//
	// category = categoryDAO.get(2);
	//
	//
	// assertEquals("Successfully fetched a single category from the
	// table!","Nacelle",category.getNom_cat());
	//
	//
	// }

	// @Test
	// public void testUpdateCategory() {
	//
	// category = categoryDAO.get(2);
	//
	// category.setNom_cat("Grus");
	//
	// assertEquals("Successfully updated a single category in the
	// table!",true,categoryDAO.update(category));
	//
	//
	// }

	// @Test
	// public void testDeleteCategory() {
	//
	// category = categoryDAO.get(2);
	// assertEquals("Successfully deleted a single category in the
	// table!",true,categoryDAO.delete(category));
	//
	//
	// }

	// @Test
	// public void testListCategory() {
	//
	// assertEquals("Successfully fetched the list of categories from the
	// table!",1,categoryDAO.list().size());
	//
	//
	// }

	//
	// @Test
	// public void testCRUDCategory() {
	//
	// // add operation
	// category = new Categorie();
	//
	// category.setNom_cat("Camion");
	// category.setDescription("Grus description!");
	// category.setImageURL("CAT_1.png");
	//
	// assertEquals("Successfully added a category inside the
	// table!",true,categoryDAO.add(category));
	//
	//
	// category = new Categorie();
	//
	// category.setNom_cat("Nacelles");
	// category.setDescription("Nacelles description!");
	// category.setImageURL("CAT_2.png");
	//
	// assertEquals("Successfully added a category inside the
	// table!",true,categoryDAO.add(category));
	//
	//
	// // fetching and updating the category
	// category = categoryDAO.get(1);
	//
	// category.setNom_cat("Grus");
	//
	// assertEquals("Successfully updated a single category in the
	// table!",true,categoryDAO.update(category));
	//
	//
	// // delete the category
	// assertEquals("Successfully deleted a single category in the
	// table!",true,categoryDAO.delete(category));
	//
	//
	// //fetching the list
	// assertEquals("Successfully fetched the list of categories from the
	// table!",1,categoryDAO.list().size());
	//
	//
	// }
	//
	//

}
