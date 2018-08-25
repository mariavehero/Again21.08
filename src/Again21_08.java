public class Again21_08 {
    public static void main (String[] args) {
        float a = 1865f;
        float x = 1f;
        x = (float) (Math.floor(a/24));
        float y;
        y= a%24;

        System.out.println("Было дано 1865 часов. Это равно" +x +" дней и" +y +" часов");

    }
}
