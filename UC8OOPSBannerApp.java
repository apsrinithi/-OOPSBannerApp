import java.util.HashMap;

public class UC8OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();
        charMap.put('O', new String[] {
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        });
        charMap.put('P', new String[] {
            "****** ",
            "**  ** ",
            "**  ** ",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        });
        charMap.put('S', new String[] {
            " *****",
            "**    ",
            "**    ",
            " *****",
            "    **",
            "    **",
            " *****"
        });
        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                String[] pattern = charMap.get(message.charAt(i));
                line.append(pattern[row]);
                if (i < message.length() - 1) {
                    line.append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}