package com.west.service;

/**
 * Created by zhangminglei on 2017/1/28.
 */
import java.util.List;
import com.west.dao.CountryRepository;
import com.west.entity.Country;
import com.west.entity.User;
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
  public void addCountry(User country) {
    countryRepository.addCountry(country);
  }

  @Transactional
  public void deleteCountry(int id) {
    countryRepository.deleteCountry(id);
  }
}

