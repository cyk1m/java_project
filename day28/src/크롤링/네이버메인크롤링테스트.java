package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; //tag가 담긴 ArrayList

public class 네이버메인크롤링테스트 {

	public static void main(String[] args) {
		try { //Document: html문서 나타내는 클래스. jsoup으로 import
			Document doc = Jsoup.connect("http://www.naver.com").get();
			System.out.println("1. 사이트 연결 성공.@@@");
			System.out.println("2. 소스 받아오기 성공.@@@");
			//System.out.println(doc); 너무 많아서 막아놓음
			//Element: tag를 나타내는 부품
			//Elements: tags(태그 리스트)를 나타내는 부품
			Elements list = doc.select("a.nav"); //a태그 중 class가 nav인것을 검색
			System.out.println(list.size());
			//System.out.println(list);
			for (Element tag : list) {
				System.out.println(tag.text()); //<a></a>사이의 텍스트만 추출
			}
			Element aTag0 = list.get(0); //a태그
			Elements list2 = aTag0.select("i");
			System.out.println(list2.get(0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
