package net.Shop.myShopbackend.dao;

import java.util.List;

import net.Shop.myShopbackend.dto.Categorie;

public interface CategoryDAO {

	boolean add(Categorie categorie);

	boolean update(Categorie categorie);

	boolean delete(Categorie categorie);

	List<Categorie> list();

	Categorie get(int id);

}
