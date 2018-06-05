package longestLength;

public class FindLongestLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentense = "day";

		String evenWord = "";

		String[] words = sentense.split(" ");

		for (String word : words) {

			int length = word.length();

			if (length % 2 == 0) {
				if (evenWord.length() <= word.length()) {
					evenWord = word;
				}			
				
			}		

		}

		System.out.println("Print first word:" + evenWord);
	}
}
