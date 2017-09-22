package net.Shop.myShobackend.dao;

import java.util.List;

import net.Shop.myShopbackend.dto.Categorie;

public interface CategoryDAO {
	
	List<Categorie> list();
	
	Categorie get(int id);

}
