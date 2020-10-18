package Task06_02;

public class District {
	
	private String districtName;
	private City cities [];
	
	//constructor
	public District(String districtName) {
		this.districtName = districtName;
		//System.out.println("District: " + districtName);
	}

	public City[] getCities() {
		return cities;
	}

	public void setCities(City cities[]) {
		this.cities = cities;
	}
	
	

}
