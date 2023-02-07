package day5;

import java.util.HashMap;

public class CitiesSearch {
	HashMap<String, String> city;
//	inner class
	public class CityNotFoundException extends Exception{
		
		public CityNotFoundException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public CityNotFoundException(String message, Throwable cause, boolean enableSuppression,
				boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
			// TODO Auto-generated constructor stub
		}

		public CityNotFoundException(String message, Throwable cause) {
			super(message, cause);
			// TODO Auto-generated constructor stub
		}

		public CityNotFoundException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

		public CityNotFoundException(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		}

		/**
		 * 
		 */
//		private static final long serialVersionUID = 1L;
		
	}

	public String getCity(String key) throws CityNotFoundException {
		String val = city.get(key);
		if (val == null)
			throw new CityNotFoundException("City Not Found");
		return val;
	}

	public void setCity(String key, String value) {
		city.put(key, value);
	}

	public CitiesSearch() {
		// TODO Auto-generated constructor stub
		city = new HashMap<String, String>();
	}

	public static void main(String[] args) {
		CitiesSearch c = new CitiesSearch();
		c.setCity("700032", "Kol");
		c.setCity("100000", "Del");
		try {
			System.out.println(c.getCity("700032"));
			System.out.println(c.getCity("100000"));
			System.out.println(c.getCity("700035"));
//			Throwable -> Exception -> CityNotFoundException
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
