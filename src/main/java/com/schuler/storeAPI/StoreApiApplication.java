package com.schuler.storeAPI;

import com.schuler.storeAPI.domain.*;
import com.schuler.storeAPI.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Arrays;

@SpringBootApplication
public class StoreApiApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private BrandRepository brandRepository;
	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private ClientRepository clientRepository;



	public static void main(String[] args) {SpringApplication.run(StoreApiApplication.class, args);}

	@Override
	public void run(String... args) throws Exception{

		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		Category cat3 = new Category(null, "Cama, mesa e banho");
		Category cat4 = new Category(null, "Eletrônicos");
		Category cat5 = new Category(null, "Móveis");

		Brand brd1 = new Brand(null, "Razer");
		Brand brd2 = new Brand(null, "LG");
		Brand brd3 = new Brand(null, "Ortobom");
		Brand brd4 = new Brand(null, "Herman Miler");
		Brand brd5 = new Brand(null, "HyperX");
		Brand brd6 = new Brand(null, "DXRacer");
		Brand brd7 = new Brand(null, "Florense");

		Product prd1 = new Product(null, "Teclado", new BigDecimal("500.00"), brd1);
		Product prd2 = new Product(null, "Mouse", new BigDecimal("100.00"), brd5);
		Product prd3 = new Product(null, "Monitor", new BigDecimal("1125.00"), brd2);
		Product prd4 = new Product(null, "Mesa", new BigDecimal("2060.00"), brd7);
		Product prd5 = new Product(null, "Cadeira", new BigDecimal("200.00"), brd4);
		Product prd6 = new Product(null, "Cadeira Gamer", new BigDecimal("800.00"), brd6);
		Product prd7 = new Product(null, "Cama", new BigDecimal("1000.00"), brd3);


		prd1.getCategories().addAll(Arrays.asList(cat1, cat2, cat4));
		prd2.getCategories().addAll(Arrays.asList(cat1, cat2, cat4));
		prd3.getCategories().addAll(Arrays.asList(cat1, cat2, cat4));
		prd4.getCategories().addAll(Arrays.asList(cat3, cat5));
		prd5.getCategories().addAll(Arrays.asList(cat2, cat4, cat5));
		prd6.getCategories().addAll(Arrays.asList(cat2, cat4, cat5));
		prd7.getCategories().addAll(Arrays.asList(cat3, cat5));

		cat1.getProducts().addAll(Arrays.asList(prd1, prd2, prd3));
		cat2.getProducts().addAll(Arrays.asList(prd1, prd2, prd3, prd5, prd6));
		cat3.getProducts().addAll(Arrays.asList(prd4, prd7));
		cat4.getProducts().addAll(Arrays.asList(prd1, prd2, prd3, prd5, prd6));
		cat5.getProducts().addAll(Arrays.asList(prd4, prd5, prd6, prd7));

		brd1.getProducts().addAll(Arrays.asList(prd1));
		brd2.getProducts().addAll(Arrays.asList(prd3));
		brd3.getProducts().addAll(Arrays.asList(prd7));
		brd4.getProducts().addAll(Arrays.asList(prd5));
		brd5.getProducts().addAll(Arrays.asList(prd2));
		brd6.getProducts().addAll(Arrays.asList(prd6));
		brd7.getProducts().addAll(Arrays.asList(prd4));


		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
		brandRepository.saveAll(Arrays.asList(brd1, brd2, brd3, brd4, brd5, brd6, brd7));
		productRepository.saveAll(Arrays.asList(prd1, prd2, prd3, prd4, prd5, prd6, prd7));

		Country ctry1 = new Country(null, "Brazil");
		Country ctry2 = new Country(null, "United States");

		State st1 = new State(null, "São Paulo", ctry1);
		State st2 = new State(null, "New York", ctry2);

		ctry1.getStates().addAll(Arrays.asList(st1));
		ctry2.getStates().addAll(Arrays.asList(st2));

		City city1 = new City(null, "São Paulo", st1);
		City city2 = new City(null, "New York", st2);

		st1.getCities().addAll(Arrays.asList(city1));
		st2.getCities().addAll(Arrays.asList(city2));

		countryRepository.saveAll(Arrays.asList(ctry1, ctry2));
		stateRepository.saveAll(Arrays.asList(st1, st2));
		cityRepository.saveAll(Arrays.asList(city1, city2));

		Client cl1 = new Client(null, "Maria José da Silva", "maria@email.com", "22222222222");
		Client cl2 = new Client(null, "José Maria da Silva", "jose@email.com", "33333333333");

		cl1.getPhone().addAll(Arrays.asList("88888888"));
		cl2.getPhone().addAll(Arrays.asList("77777777"));


		Address adr1 = new Address(null, "Rua das Flores", "249", "Jardins", "11111111", city1, cl1);
		Address adr2 = new Address(null, "Flowers Street", "942", "Gardens", "99999999", city2, cl1);
		Address adr3 = new Address(null, "Roses Street", "755", "Gardens", "77777777", city2, cl2);


		cl1.getAddresses().addAll(Arrays.asList(adr1, adr2));
		cl2.getAddresses().addAll(Arrays.asList(adr3));


		clientRepository.saveAll(Arrays.asList(cl1, cl2));
		addressRepository.saveAll(Arrays.asList(adr1, adr2, adr3));










	}

}
