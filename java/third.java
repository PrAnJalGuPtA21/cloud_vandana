public class third {

    public static void main(String[] args) {
        String test = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(test) ? "It is a pangram" : "It is not a pangram");
    }

    public static boolean isPangram(String input) {
        if (input == null || input.length() < 26) {
            return false;
        }

        
        boolean[] alphabetMarker = new boolean[26];
        int alphabetCount = 0;

        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!alphabetMarker[index]) {
                    alphabetMarker[index] = true;
                    alphabetCount++;
                }
            }

            if (alphabetCount == 26) {
                return true;
            }
        }

        return alphabetCount == 26;
    }
}
