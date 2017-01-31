package com.west.dao;

/**
 * Created by zhangminglei on 2017/1/28.
 */
import java.util.List;
import com.west.entity.Country;
import com.west.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CountryRepository {

  @Autowired
  private SessionFactory sessionFactory;

  public List<Country> getAllCountries() {
    Session session = this.sessionFactory.getCurrentSession();
    List<Country> countryList = session.createQuery("from Country").list();
    return countryList;
  }

  public Country getCountry(int id) {
    Session session = this.sessionFactory.getCurrentSession();
    Country country = (Country) session.load(Country.class, new Integer(id));
    return country;
  }

  public Country addCountry(Country country) {
    Session session = this.sessionFactory.getCurrentSession();
    session.persist(country);
    return country;
  }

  public void deleteCountry(int id) {
    Session session = this.sessionFactory.getCurrentSession();
    Country p = (Country) session.load(Country.class, new Integer(id));
    if (null != p) {
      session.delete(p);
    }
  }
}

