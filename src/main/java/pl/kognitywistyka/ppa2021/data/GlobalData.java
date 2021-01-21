package pl.kognitywistyka.ppa2021.data;

import java.util.HashMap;
import java.util.Map;

public class GlobalData {
	
	protected Map<String, CountryData> dataByCountry;
	
	public GlobalData() {
		this.dataByCountry = new HashMap<>();
	}
	
	public void setDataByCountry(String country, CountryData value) {
		dataByCountry.put(country, value);
	}
	
	public CountryData getDataByCountry(String country) {
		return dataByCountry.get(country);
	}

}
