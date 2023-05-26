package genericLibaries;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Properties;

	/*
	 * this lass contains all reusable methods to perform actions on Properties file
	 * @author jsp
	 */

	public class PropertiesUtility {
		private Properties property;
		/*
		 * This method is used to initialize properties file
		 * 
		 * @param Filepath
		 */

		public void propertiesInit(String filePath) {
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(filePath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			 property = new Properties();
			try {
				property.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/*
		 * This method is used to fetch data from properties file
		 * 
		 * @param key
		 * 
		 * @return
		 */
		public String readData(String key) {

			return property.getProperty(key);
		}

		/*
		 * This method is used to Write and save the data to properties File
		 * 
		 * @param key
		 * 
		 * @param key
		 * 
		 * @param key
		 */
		public void writeToproperties(String filepath, Object value, Object key) {
			property.put(key, value);
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(filepath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				property.store(fos, "update");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}


