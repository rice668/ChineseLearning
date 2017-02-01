package web.controller;

/**
 * Created by zhangminglei on 2017/1/28.
 */
import java.util.List;

import com.west.entity.Country;
import com.west.entity.User;
import com.west.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CountryController {

  @Autowired
  CountryService countryService;

  @RequestMapping(value = "/getAllCountries", method = RequestMethod.GET)
  public String getCountries(Model model) {
    List<Country> listOfCountries = countryService.getAllCountries();
    model.addAttribute("country", new Country());
    model.addAttribute("listOfCountries", listOfCountries);
    return "countryDetails";
  }

  @RequestMapping(value = "/getCountry/{id}", method = RequestMethod.GET)
  public Country getCountryById(@PathVariable int id) {
    return countryService.getCountry(id);
  }

  @RequestMapping(value = "/addUser", method = RequestMethod.POST)
  public String addCountry(@RequestBody User country) {
    countryService.addCountry(country);
    return "hello";
  }

  @RequestMapping(value = "/updateCountry/{id}", method = RequestMethod.PUT)
  public String updateCountry(@PathVariable("id") int id,Model model) {
    model.addAttribute("country", this.countryService.getCountry(id));
    model.addAttribute("listOfCountries", this.countryService.getAllCountries());
    return "countryDetails";
  }

  @RequestMapping(value = "/deleteCountry/{id}", method = RequestMethod.GET)
  public String deleteCountry(@PathVariable("id") int id) {
    countryService.deleteCountry(id);
    return "redirect:/getAllCountries";

  }
}

