package duplicateElementsArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsArray {
	
	public static void main(String[] args) {
		int arr[] = {5,6,11,8,3,2,1,6,2,3,6,9};
		Map<Integer,Integer> hash = new HashMap<>();
		for(int num:arr) {
			Integer count = hash.get(num);
			if(count == null) {
				hash.put(num, 1);
			}
			else {
				count = count+1;
				hash.put(num, count);
			}
		}
		System.out.print("duplicate elements are \n");
		Set<Map.Entry<Integer,Integer>> es=hash.entrySet();
		for(Map.Entry<Integer,Integer>me:es) {
			if(me.getValue()>1) {
				System.out.print(me.getKey() + " ");
			}
		}
	}
}
