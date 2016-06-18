package JUnitLocked;

import java.util.ArrayList;

public class NullPoint {

	public static ArrayList initializer(int a){
		ArrayList list;
		if ( a == 0){
			list = new ArrayList<>();
		} else {
			list = null;
		}
		return list;
	}
	
}
