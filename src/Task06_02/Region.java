package Task06_02;

public class Region {
	
	private String regionName;
	private District districts [];
	private int regionArea;
	
	//constructor
	public Region(String regionName) {
		this.regionName = regionName;
		//System.out.println("Region: " + regionName);
	}
	
	public void setRegionArea(int regionArea) {
		this.regionArea = regionArea;
	}
	
	public int getRegionArea () {
		return regionArea;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

	public void printCenter() {
		for(int i = 0; i < districts.length; i++) {
			City [] cities = districts[i].getCities();
			for(int j = 0; j < cities.length; j++) {
				City city = cities[j];
				if(city.isRegionCenter()) {
					System.out.println(city.getCityName() + " is a region center!");
				}
			}
		}
	}

}