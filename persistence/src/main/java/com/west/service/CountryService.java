package com.west.service;

/**
 * Created by zhangminglei on 2017/1/28.
 */
import java.util.List;
import com.west.dao.CountryRepository;
import com.west.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryService {

  @Autowired
  CountryRepository countryRepository;

  @Transactional
  public List<Country> getAllCountries() {
    return countryRepository.getAllCountries();
  }

  @Transactional
  public Country getCountry(int id) {
    return countryRepository.getCountry(id);
  }

  @Transactional
  public void addCountry(Country country) {
    System.out.println("addCountry invoked");
    countryRepository.addCountry(country);
  }

  @Transactional
  public void deleteCountry(int id) {
    System.out.println("deleteCountry invoked");
    countryRepository.deleteCountry(id);
  }
}

