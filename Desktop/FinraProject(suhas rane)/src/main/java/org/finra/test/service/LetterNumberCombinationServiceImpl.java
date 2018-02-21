package org.finra.test.service;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class LetterNumberCombinationServiceImpl implements LetterNumberCombinationService {

	@Override
	public List<String> getCombinations(String number) {
		LinkedList<String> ans = new LinkedList<String>();
		String[] mapping = new String[] { "0", "1", "2abc", "3def", "4ghi", "5jkl", "6mno", "7pqrs", "8tuv", "9wxyz" };
		System.out.println("number" + number);
		ans.add("");
		
		for (int i = 0; i < number.length(); i++) {
			int x = Character.getNumericValue(number.charAt(i));
			System.out.println("val"+x);
		while (ans.peek().length() == i) {
				String t = ans.remove();
				for (char s : mapping[x].toCharArray())
					ans.add(t + s);
			}

		}
		return ans;
	}

}
