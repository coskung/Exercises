package src;

import org.junit.Assert;
import org.junit.Test;

public class RemoveRecurringCharactersTest {

	@Test
	public void testRemoveOccurences() {
		String result=RemoveRecurringCharacters.removeOccurences("ankara test deneme", 3);
		String expected = "nkr tst dnm";
		Assert.assertEquals(result, expected);
		
		result=RemoveRecurringCharacters.removeOccurences("ankara test deneme", 5);
		expected = "ankara test deneme";
		Assert.assertEquals(result, expected);
		
		result=RemoveRecurringCharacters.removeOccurences("", 5);
		expected = "";
		Assert.assertEquals(result, expected);
		
		result=RemoveRecurringCharacters.removeOccurences("ankara test deneme", 1);
		expected = "  ";
		Assert.assertEquals(result, expected);
	}

}
