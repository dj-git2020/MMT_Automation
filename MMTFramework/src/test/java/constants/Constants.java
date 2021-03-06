package constants;

import java.io.File;

public class Constants {
	
	public static final int    GLOBAL_SYNCHRONISATION_TIMEOUT = 60;// global synchronisation timeout which is used in the Synchronise methods 
	public static final String GLOBAL_RESOURCES_FOLDER=File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator;//src//test//resources//
	public static final String GLOBAL_DRIVERS_FOLDER=File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"drivers"+File.separator;//src//test//resources//drivers//
	public static final String GLOBAL_DATA_FOLDER=File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"data"+File.separator;//src//test//resources//data//
	public static final String GLOBAL_MSG_INJ_INPUT_FOLDER=File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"message-injector"+File.separator+"input"+File.separator;//src//test//resources//message-injector//input//
	public static final String GLOBAL_SCREENSHOTS_FLODER=File.separator+"screenshots"+File.separator;
	public static final String GLOBAL_PROPERTIES_FILE = GLOBAL_DATA_FOLDER + "Config.properties";
	public static final String CHROME_DRIVER = "webdriver.chrome.driver";
	public static final String FIREFOX_DRIVER="webdriver.gecko.driver";
	public static final String EDGE_DRIVER="webdriver.edge.driver";
	public static final String IE_DRIVER = "webdriver.ie.driver";
	
	
	//******************HomePage Validation Constants*********************
	public static final String FEATURED_COURSES = "FEATURED COURSE";

}
