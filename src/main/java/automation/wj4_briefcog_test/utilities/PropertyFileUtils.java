package automation.wj4_briefcog_test.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class PropertyFileUtils {

	public static FileInputStream fis;
	public static Properties prop;

	public static HashMap<String, String> globalProp = new HashMap<>();
	
	public static ArrayList<String> keyList = new ArrayList<>();
	public static ArrayList<String> valueList = new ArrayList<>();
	
	
	
	
	

	/*
	 * public static void main(String[] args) {
	 * 
	 * try { fis = new FileInputStream(System.getProperty("user.dir") +
	 * "\\GlobalConfig.properties"); prop = new Properties(); prop.load(fis);
	 * 
	 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
	 * e) { e.printStackTrace(); }
	 * 
	 * prop.entrySet(); prop.get("browser"); prop.size();
	 * 
	 * 
	 * 
	 * 
	 * for(Object i :prop.keySet() ) { keyList.add((String) i);
	 * 
	 * }
	 * 
	 * for(Object j :prop.values() ) { valueList.add((String) j);
	 * 
	 * 
	 * }
	 * 
	 * 
	 * for (int i = 0; i < prop.size(); i++) { globalProp.put(keyList.get(i),
	 * valueList.get(i));
	 * 
	 * }
	 * 
	 * System.out.println(globalProp);
	 * 
	 * }
	 */
	
	
	
	
	
	
	

	/*
	 * need to create 2 components if no Key passed return everything in a map KEy
	 * value pairs If key passed the return that specific value
	 */


	public static HashMap<String, String> getAllProperties(String propertyPath) {
		try {

			fis = new FileInputStream(propertyPath);
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for(Object i :prop.keySet() ) {
			keyList.add((String) i);	
			
		}
		
		for(Object j :prop.values() ) {
			valueList.add((String) j);
			
		
		}		

		
		for (int i = 0; i < prop.size(); i++) {
			globalProp.put(keyList.get(i), valueList.get(i));	
			
		}

		return globalProp;

	}

}
