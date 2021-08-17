package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; //tag가 담긴 ArrayList

public class W3schools크롤링테스트2 {

	public static void main(String[] args) {
		try { //Document: html문서 나타내는 클래스. jsoup으로 import
			Document doc = Jsoup.connect("https://www.w3schools.com/tags/default.asp").get();
			System.out.println("1. 사이트 연결 성공.@@@");
			System.out.println("2. 소스 받아오기 성공.@@@");
			//System.out.println(doc); 너무 많아서 막아놓음
			//Element: tag를 나타내는 부품
			//Elements: tags(태그 리스트)를 나타내는 부품
			Elements list = doc.select("a.w3-bar-item");
			System.out.println(list.size());
			//System.out.println(list);
			for (Element tag : list) {
				System.out.println(tag.text()); //<a></a>사이의 텍스트만 추출
			}
			for (int i = 8; i < 18; i++) {
				System.out.println(list.get(i).text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
