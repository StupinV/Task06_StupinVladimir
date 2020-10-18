package Task06_02;

public class MainHomework {
	
	public static void main(String[] args) {

		City city1 = new City("Minsk");
		city1.setRegionCenter(true);
		City city2 = new City("Molodechno");
		City city3 = new City("Borisov");
		
		City city4 = new City("Vitebsk");
		city4.setRegionCenter(true);
		City city5 = new City("Orsha");
		City city6 = new City("Polotsk");
		
		City city7 = new City("Gomel");
		city7.setRegionCenter(true);
		City city8 = new City("Dobrush");
		City city9 = new City("Mozyr");
		
		City city10 = new City("Mogilev");
		city10.setRegionCenter(true);
		City city11 = new City("Bobruisk");
		City city12 = new City("Osipovichi");
		
		City city13 = new City("Brest");
		city13.setRegionCenter(true);
		City city14 = new City("Ivanovo");
		City city15 = new City("Baranovichi");
		
		City city16 = new City("Grodno");
		city16.setRegionCenter(true);
		City city17 = new City("Oshmiany");
		City city18 = new City("Lida");
		
		District district1 = new District("Minsky");
		district1.setCities(new City[] {city1});
		District district2 = new District("Molodechnensky");
		district2.setCities(new City[] {city2});
		District district3 = new District("Borisovsky");
		district3.setCities(new City[] {city3});
		
		District district4 = new District("Vitebsky");
		district4.setCities(new City[] {city4});
		District district5 = new District("Orshansky");
		district5.setCities(new City[] {city5});
		District district6 = new District("Polotsky");
		district6.setCities(new City[] {city6});
		
		District district7 = new District("Gomelsky");
		district7.setCities(new City[] {city7});
		District district8 = new District("Dobrushsky");
		district8.setCities(new City[] {city8});
		District district9 = new District("Mozyrsky");
		district9.setCities(new City[] {city9});
		
		District district10 = new District("Mogilevsky");
		district10.setCities(new City[] {city10});
		District district11 = new District("Bobruisky");
		district11.setCities(new City[] {city11});
		District district12 = new District("Osipovichsky");
		district12.setCities(new City[] {city12});
		
		District district13 = new District("Brestsky");
		district13.setCities(new City[] {city13});
		District district14 = new District("Ivanovsky");
		district14.setCities(new City[] {city14});
		District district15 = new District("Boranovichsky");
		district15.setCities(new City[] {city15});
		
		District district16 = new District("Grodnensky");
		district16.setCities(new City[] {city16});
		District district17 = new District("Oshmiansky");
		district17.setCities(new City[] {city17});
		District district18 = new District("Lidsky");
		district18.setCities(new City[] {city18});
		
		Region region1 = new Region("Minskaya");
		region1.setRegionArea(23);
		District districts1 [] = new District[] {district1, district2, district3};
		region1.setDistricts(districts1);
		
		Region region2 = new Region("Vitebskaya");
		region2.setRegionArea(20);
		District districts2 [] = new District[] {district4, district5, district6};
		region2.setDistricts(districts2);
		
		Region region3 = new Region("Gomelskaya");
		region3.setRegionArea(40);
		District districts3 [] = new District[] {district7, district8, district9};
		region3.setDistricts(districts3);
		
		Region region4 = new Region("Mogilevskaya");
		region4.setRegionArea(50);
		District districts4 [] = new District[] {district10, district11, district12};
		region4.setDistricts(districts4);
		
		Region region5  = new Region("Brestskaya");
		region5.setRegionArea(60);
		District districts5 [] = new District[] {district13, district14, district15};
		region5.setDistricts(districts5);
		
		Region region6 = new Region("Grodnenskaya");
		region6.setRegionArea(45);
		District districts6 [] = new District[] {district16, district17, district18};
		region6.setDistricts(districts6);
		
		Country myCountry = new Country("Belarus", city1);
		
		myCountry.printCapital();
		
		Region regions [] = new Region[] {region1, region2, region3, region4, region5, region6};
		myCountry.setRegions(regions);
		
		System.out.println("Regions count is " +  myCountry.getRegions().length);
		
		System.out.println("Total country area is " + myCountry.countArea());
		
		region1.printCenter();
		region2.printCenter();
		region3.printCenter();
		region4.printCenter();
		region5.printCenter();
		region6.printCenter();
		
	}

}
