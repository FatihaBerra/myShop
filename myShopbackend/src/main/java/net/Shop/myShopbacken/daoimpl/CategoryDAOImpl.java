package net.Shop.myShopbacken.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.Shop.myShobackend.dao.CategoryDAO;
import net.Shop.myShopbackend.dto.Categorie;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Categorie> categories = new ArrayList<>();

	static {
		Categorie categorie = new Categorie();
		Categorie categorie2 = new Categorie();
		Categorie categorie3 = new Categorie();
		// adding first categorie

		categorie.setId_categorie(1);
		categorie.setNom_cat("Camions");
		categorie.setDescription("Louer un camion chez votre société MonCamion");
		categorie.setImageURL("CatCamion.png");
		categories.add(categorie);

		categorie2.setId_categorie(2);
		categorie2.setNom_cat("Nacelles");
		categorie2.setDescription("Louer une Nacelle chez votre société MonCamion");
		categorie2.setImageURL("CatNacelle.png");
		categories.add(categorie2);

		categorie3.setId_categorie(3);
		categorie3.setNom_cat("Grus");
		categorie3.setDescription("Louer une Grus chez votre société MonCamion");
		categorie3.setImageURL("CatGrus.png");
		categories.add(categorie3);

	}

	@Override
	public List<Categorie> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Categorie get(int id) {

		// enchanced for loop
		for (Categorie categorie : categories) {
			if (categorie.getId_categorie() == id) {
				return categorie;
			}
		}
		return null;
	}

}
