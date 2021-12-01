package LabFive;

import java.util.List;
import java.util.Collections;

public class DescendSorter {
	
	public static List<String> Sort(List<String> list) {		
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}
}
