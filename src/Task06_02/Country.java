package Task06_02;

public class Country {
	
	private String countryName;
	private Region regions [];
	private City capital;
	
	//constructor
	public Country(String countryName, City capital) {
		this.countryName = countryName;
		this.capital = capital;
		//System.out.println("Country: " + countryName);
	}
	
	public void printCapital(){
		System.out.println(capital.getCityName() + " is the capital of " + countryName);
	}
	
	public void setRegions (Region regions []) {
		this.regions = regions;
	}
	
	public Region [] getRegions () {
		return regions;
	}
	
	public int countArea() {
		int totalArea = 0;
		for(int i = 0; i < regions.length; i++) {
			totalArea += regions[i].getRegionArea();
		}
		return totalArea;
	}
	
}
