package java_20190613;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Xrp {
	public static void main(String[] args) {
		String url = "https://coinmarketcap.com/currencies/ripple/historical-data/?start=20180613&end=20190613";
		
		//전체 html문서를 관리하기 위한 객체
		Document doc = null;
		
		try {
			//url 주소에 get 방식으로 접근
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		Elements elements = doc.select(".col-xs-12.tab-content");
		
		String title = elements.select("h1").text();
		System.out.println(title);
		
		Elements liEle = elements.select("tr");
		for(int i=0;i<liEle.size();i++){
			Element temp = liEle.get(i);
			System.out.println(temp.text());
		}
		
		
	}

}
