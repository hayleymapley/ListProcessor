import java.util.ArrayList;

public class Words {

	public ArrayList<Double> mapTwice(ArrayList<Double> input) {
		ArrayList<Double> mapTwice = new ArrayList<Double>();
		//submitted
		/*for (int i=0; i<input.size(); i++) {
			double value = input.get(i);
			value = value*2;
			mapTwice.add(value);
		}*/
		for (double j : input) {
			mapTwice.add(j*2);
		}
		return mapTwice;
	}

	public ArrayList<String> mapToUpper(ArrayList<String> input) {
		ArrayList<String> mapToUpper = new ArrayList<String>();
		for (int i=0; i<input.size(); i++) {
			String value = input.get(i);
			value = value.toUpperCase();
			mapToUpper.add(value);
		}
		return mapToUpper;
	}

	public boolean isPalindrome(String word) {
		ArrayList<String> letters = new ArrayList<String>();
		for (int i=0; i<word.length(); i++) {
			String lettersEntry = word.substring(i, i+1);
			letters.add(lettersEntry);
		}
		int start = 0;
		int end = letters.size() - 1;
		while (start < end) {
			if (!letters.get(start).equals(letters.get(end))) {
				return false;
			}
			start++;
			end--;
		}
		return true;		
	}

	public ArrayList<String> filterStarts(ArrayList<String> input, String prefix) {
		ArrayList<String> filterStarts = new ArrayList<String>();
		for (int i=0; i<input.size(); i++) {
			String check = input.get(i);
			if (check.startsWith(prefix)) {
				filterStarts.add(check);
			}	
		}
		return filterStarts;
	}

	public double foldSum(ArrayList<Double> input) {
		double total = 0;
		for (int i=0; i<input.size(); i++) {
			double num = input.get(i);
			total = total + num;
		}
		return total;
	}

	public boolean isOrderedAscending(ArrayList<Double> input) {
		for (int i=0; i<input.size()-1; i++) {
			if (input.get(i) > input.get(i+1)) {
				return false;
			}
		}
		return true;
	}

	public ArrayList<String> matchingWords(
			ArrayList<String> input1,
			ArrayList<String> input2) {
		ArrayList<String> matchingWords = new ArrayList<String>();
		for (int i =0; i<input1.size(); i++) {
			String word1 = input1.get(i);
			for (int j=0; j<input2.size(); j++) {
				String word2 = input2.get(j);
				if (word1.equals(word2) && i==j) {
					matchingWords.add(word1);
				}
			}
		}
		return matchingWords;
	}

	public ArrayList<String> intersection(
			ArrayList<String> input1,
			ArrayList<String> input2) {
		ArrayList<String> intersection = new ArrayList<String>();
		for (int i=0; i<input1.size(); i++) {
			String check1 = input1.get(i);
			for (int j=0; j<input2.size(); j++) {
				String check2 = input2.get(j);
				if (check1.equals(check2)) {
					intersection.add(check1);
				}
			}
		}
		return intersection;
	}

	public ArrayList<String> noDuplicates(
			ArrayList<String> input) {
		ArrayList<String> noDuplicates = new ArrayList<String>();
		for (int k=0; k<input.size(); k++) {
			String in = input.get(k);
			noDuplicates.add(in);
		}

		for (int i=0; i<noDuplicates.size(); i++) {
			String value = noDuplicates.get(i);
			for (int j=i+1; j<noDuplicates.size(); j++) {
				String value2 = noDuplicates.get(j); 
				if (value.equals(value2)) {
					noDuplicates.remove(j);
				}
			}
		}
		return noDuplicates;
	}

	public ArrayList<String> difference(
			ArrayList<String> input1,
			ArrayList<String> input2) {
		ArrayList<String> difference = new ArrayList<String>();		
		for (int i=0; i<input1.size(); i++) {
			String entry = input1.get(i);
			difference.add(entry);
		}

		for (int j=0; j<difference.size(); j++) {
			String check1 = difference.get(j);
			for (int k=0; k<difference.size(); k++) {
				String check2 = input2.get(k);
				if (check1.equals(check2)) {
					difference.remove(check1);
				}
			}
		}
		return difference;
	}

	public ArrayList<String> symmetricDifference(
			ArrayList<String> input1,
			ArrayList<String> input2) {

		ArrayList<String> symmetricDifference = new ArrayList<String>();

		for (int i=0; i<input1.size(); i++) {
			String value1 = input1.get(i);
			if (!input2.contains(value1)) {
				symmetricDifference.add(value1);
			}
		}
		for (int j=0; j<input2.size(); j++) {
			String value2 = input2.get(j);
			if (!input1.contains(value2)) {
				symmetricDifference.add(value2);
			}
		}
		return symmetricDifference;
	}

	public void reverse(ArrayList<String> input) {
		for (int i=0; i<input.size()/2; i++) {
			input.set(i, input.set(input.size()-i-1, input.get(i)));
		}
	}

	public void shuffle(ArrayList<Double> input) {		
		
		for (int i=0; i<input.size(); i++) {
			int first = (int) (Math.random() * input.size());
			int second = i + (int) (Math.random() * (input.size()-i));
			double temp = input.get(first);
			input.set(first, input.get(second));
			input.set(second, temp);
		}
	}

	public static void main(String[] args) {
		new UserInterface();
	}
}
