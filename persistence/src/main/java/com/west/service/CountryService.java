package com.west.service;

/**
 * Created by zhangminglei on 2017/1/28.
 */
import java.util.List;
import com.west.dao.CountryDAO;
import com.west.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("countryService")
public class CountryService {

  @Autowired
  CountryDAO countryDao;

  @Transactional
  public List<Country> getAllCountries() {
    return countryDao.getAllCountries();
  }

  @Transactional
  public Country getCountry(int id) {
    return countryDao.getCountry(id);
  }

  @Transactional
  public void addCountry(Country country) {
    System.out.println("addCountry invoked");
    countryDao.addCountry(country);
  }

  @Transactional
  public void deleteCountry(int id) {
    System.out.println("deleteCountry invoked");
    countryDao.deleteCountry(id);
  }
}

