public class UC7OOPSBannerApp {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[] {
                "  ***  ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                "  ***  "
            }),
            new CharacterPatternMap('P', new String[] {
                "****** ",
                "**  ** ",
                "**  ** ",
                "****** ",
                "**     ",
                "**     ",
                "**     "
            }),
            new CharacterPatternMap('S', new String[] {
                " *****",
                "**    ",
                "**    ",
                " *****",
                "    **",
                "    **",
                " *****"
            })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        String[][] patterns = new String[message.length()][];
        for (int i = 0; i < message.length(); i++) {
            patterns[i] = getCharacterPattern(message.charAt(i), charMaps);
        }
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < patterns.length; i++) {
                line.append(patterns[i][row]);
                if (i < patterns.length - 1) {
                    line.append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}