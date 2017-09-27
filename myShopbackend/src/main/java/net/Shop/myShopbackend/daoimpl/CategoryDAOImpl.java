package net.Shop.myShopbackend.daoimpl;

import net.Shop.myShopbackend.dao.CategoryDAO;
import net.Shop.myShopbackend.dto.Categorie;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import net.Shop.myShopbackend.dao.*;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Categorie> list() {

		String selectActiveCategory = "FROM Categorie WHERE active = :active";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);

		query.setParameter("active", true);

		return query.getResultList();
	}

	/*
	 * Getting single category based on id
	 */
	@Override
	public Categorie get(int id) {

		return sessionFactory.getCurrentSession().get(Categorie.class, Integer.valueOf(id));

	}

	@Override

	public boolean add(Categorie categorie) {

		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().persist(categorie);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean update(Categorie categorie) {
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(categorie);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Categorie categorie) {

		categorie.setActive(false);

		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(categorie);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

}
