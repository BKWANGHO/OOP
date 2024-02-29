package serviceImpl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import service.CrawlerService;

import java.io.IOException;
import java.lang.annotation.Documented;

public class CrawlerServiceImpl implements CrawlerService {

    @Override
    public void findNamesFromWeb() throws IOException {
        Document doc = Jsoup.connect("웹데이터를 가져올 주소").get();
    }
}
