package com.linkedlist.gc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author BenjaminMcBrayer
 *
 */
public class FrequencyCount {

	//Big-O: Close to or equal to O(n). 
	public static void countFrequencyElementsArray(int[] a) {
		int[] b = new int[100];
		int j = 0;
		int i;

		for (i = 0; i < a.length; ++i) {
			j = a[i];
			++b[j];
		}

		for (i = 0; i < b.length; ++i) {
			if (b[i] > 0 && b[i] == 1) {
				System.out.printf("%d occurs %d time\n", i, b[i]);
			} else if (b[i] >= 2) {
				System.out.printf("%d occurs %d times\n", i, b[i]);
			}
		}
	}
	
	//Big-O: Closer to O(1). 
	public static void countFrequencyElementsHashMap(HashMap<Integer, Integer> hm) {

		for (int i = 0; i < hm.size(); ++i) {
			int count = Collections.frequency(new ArrayList<Integer>(hm.values()), i);
			if (count > 0 && count == 1) {
				System.out.println("[" + i + "]:" + count);
			} else if (count >= 2) {
				System.out.println(("[" + i + "]:" + count));
			}
		}
	}
}
