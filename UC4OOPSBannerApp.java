public class UC4OOPSBannerApp {
    public static void main(String[] args) {

        String[] bannerLines = {
            String.join("", " ***  ", " ***  ", "**** ", " *** "),
            String.join("", "*   * ", "*   * ", "*   * ", "*    "),
            String.join("", "*   * ", "*   * ", "*   * ", "*    "),
            String.join("", "*   * ", "*   * ", "**** ", " *** "),
            String.join("", "*   * ", "*   * ", "*    ", "    *"),
            String.join("", "*   * ", "*   * ", "*    ", "    *"),
            String.join("", " ***  ", " ***  ", "*    ", " *** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
