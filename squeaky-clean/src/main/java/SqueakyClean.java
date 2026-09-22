class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        boolean isAfterDash = false;

        for (char ch : identifier.toCharArray()) {
            if (ch == '4') ch = 'a';
            else if (ch == '3') ch = 'e';
            else if (ch == '1') ch = 'l';
            else if (ch == '0') ch = 'o';
            else if (ch == '7') ch = 't';

            if (ch == '-') {
                isAfterDash = true;
            } else if (Character.isWhitespace(ch)) {
                builder.append('_');
                isAfterDash = false;
            } else if (Character.isLetter(ch)) {
                if (isAfterDash) {
                    builder.append(Character.toUpperCase(ch));
                    isAfterDash = false;
                } else {
                    builder.append(ch);
                }
            } else {
                isAfterDash = false;
            }
        }

        String result = builder.toString();
        System.out.println("clean: " + identifier + " -> " + result);
        return result;
    }
}