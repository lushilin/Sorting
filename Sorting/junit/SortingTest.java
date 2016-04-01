import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortingTest {

	private Sorting sorting;
	
	@Before
	public void setUp() throws Exception {
		sorting = new Sorting();
	}

	@Test
	public void test() {
		int[] numbers = {3,1,4,2,5};
		assertFalse(sorting.isSorted(numbers));
		sorting.insertionSort(numbers);
		assertTrue(sorting.isSorted(numbers));
		int[] numbers2 = {13,1,2,4,6,5,7,9,10,11,3};
		Sorting.quicksort(numbers2);
		assertTrue(sorting.isSorted(numbers2));
		int[] numbers3 = {3,1,4,2,5};
		Sorting.quicksort(numbers3);
		assertTrue(sorting.isSorted(numbers3));
		int[] numbers4 = {86,74,40,53,65,36,16,38,46,14,27,26};
		Sorting.quicksort(numbers4);
		assertTrue(sorting.isSorted(numbers4));
		int[] numbers5 = {3,1,2,4,6,5,7,9,10,11,13};
		Sorting.quicksort(numbers5);
		assertTrue(sorting.isSorted(numbers5));
	}

}
