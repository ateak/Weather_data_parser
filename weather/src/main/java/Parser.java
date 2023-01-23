import org.jsoup.Jsoup;
import java.net.URL;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class Parser {
    private static Document getPage() throws IOException {
        String url = "https://www.gismeteo.ru/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getPage());
    }

}
