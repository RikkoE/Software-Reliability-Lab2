import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class simpleTest {
	public static void main(String[] args) throws IOException {
		
		sort sortStuff = new sort();
		Random rand = new Random();
		int[] array = new int[10];

		for (int i=0;i<array.length-1;i++) {
			array[i] = rand.nextInt(10);
		}
				
		array = sortStuff.sortArray(array);
		
		System.out.println("Sorted array: " + Arrays.toString(array));

		int randommember = rand.nextInt(10);
		System.out.println("Looking for member: " + randommember);
		
		int memberIndex = sortStuff.membQuery(array, randommember);
		
		if(memberIndex == -1) {
			System.out.println("The member could not be found");
		} else {
			System.out.println("Member is on index: " + memberIndex);
		}

	
	}	
}
