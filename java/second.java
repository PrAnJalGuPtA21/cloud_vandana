public class second {

    public static void main(String[] args) {
        String roman = "IX";
        System.out.println(roman + " = " + romanToInt(roman));
    }

    public static int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int result = 0;
        int prevValue = getRomanValue(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int currentValue = getRomanValue(s.charAt(i));
            
            if (currentValue > prevValue) {
                result += currentValue - 2 * prevValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }
        
        result += getRomanValue(s.charAt(0));

        return result;
    }

    public static int getRomanValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
