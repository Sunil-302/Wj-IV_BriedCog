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

	static FileInputStream fis;
	static Properties prop;	

	public static HashMap<String, String> globalProp = new HashMap<>();

	/*
	 * need to create 2 components if no Key passed return everything in a map KEy
	 * value pairs If key passed the return that specific value
	 */

	static HashMap<String, String> getAllProperties(String propertyPath) {
		try {

			fis = new FileInputStream(propertyPath);
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Object key : prop.keySet()) {
			globalProp.put((String) key, prop.getProperty((String) key));

		}

		return globalProp;

	}
	
	
}
