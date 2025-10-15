class SqueakyClean {
    private final String value;

    public SqueakyClean(String value) { this.value = value; }

    public static SqueakyClean of(String text) { return new SqueakyClean(text == null ? "" : text); }
    
    static String clean(String identifier) {
        return SqueakyClean.of(identifier)
            .spacesToUnderscores()
            .kebabCaseToCamelCase()
            .leetspeakToNormalText()
            .omitThatAreNotLetters()
            .toString();
    }

    public SqueakyClean spacesToUnderscores() { return new SqueakyClean(value.replace(' ', '_')); }

    public SqueakyClean kebabCaseToCamelCase() {
        // Java 9+ -> return new SqueakyClean(value.replaceAll("-(\\w)", s -> s.group(1).toUpperCase()));
        char[] chars = value.toCharArray();
        StringBuilder result = new StringBuilder(chars.length);
        boolean toUpper = false;
        for(char c : chars) {
            if (c == '-') toUpper = true;
            else {
                result.append(toUpper ? Character.toUpperCase(c) : c);
                toUpper = false;
            }
        }
        return new SqueakyClean(result.toString());
    }

    public SqueakyClean leetspeakToNormalText() {
        return new SqueakyClean(value.replace('4', 'a')
                                    .replace('3', 'e')
                                    .replace('0', 'o')
                                    .replace('1', 'l')
                                    .replace('7', 't'));
    }

    public SqueakyClean omitThatAreNotLetters() { return new SqueakyClean(value.replaceAll("[^\\p{L}_]", "")); }

    @Override
    public String toString() { return value; }
}
