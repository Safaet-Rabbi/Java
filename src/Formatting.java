import java.text.NumberFormat;
public class Formatting {
    public static void main(String[] args) {
        String result = NumberFormat.getPercentInstance().format(0.5);
        System.out.println(result);

    }
}
