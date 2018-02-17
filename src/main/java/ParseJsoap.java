import HelpersClass.ClassForUniversities;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class ParseJsoap {
    static final String URL = "http://postyplenie.ru/calculator.php?Vuz=all&obzestvoznanie=100" +
            "&russkiy=100&informatika=100&biologiya=100&geografiya=100&ximiya=100&fizika=100" +
            "&literatura=100&history=100&matematika=100&lang=100&Submit.x=0&Submit.y=0";
    public static void Parse() throws IOException {
        Document doc = Jsoup.connect(URL).get();
        Elements strU = doc.getElementsByClass("s").get(0)
                .getElementsByClass("light_gray_blue");

        Elements strC = doc.getElementsByClass("s").get(0)
                .getElementsByClass("light_gray_back gray_border_right");

        Elements strS = doc.getElementsByClass("s").get(0)
                .getElementsByClass("gray_border_right").get(1)
                .getElementsByTag("td");

        Elements strD = doc.getElementsByClass("s").get(0)
                .getElementsByClass("small_text gray_text");

        Elements strB = doc.getElementsByClass("blue_text");
        Elements strY = doc.getElementsByClass("white-space:nowrap;");
        ArrayList<ClassForUniversities> univers = new ArrayList<ClassForUniversities>();
        //for(Element el : strU){
        //    univers.add(new ClassForUniversities())
        //}
        System.out.println(strS.get(0).text());
    }
}