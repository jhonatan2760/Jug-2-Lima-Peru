package br.com.jhonatansouza.jug2;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class AppCoronaVirus {

	public static void main (String [] args) {
		
		try {
			Document document = Jsoup.connect("https://www.gob.pe/8371")
											.userAgent("Mozilla/gecko").get();
			
			String contenido = document.getElementsByClass("page__content")
						.text();
			
			document.getElementsByTag("img")
						.forEach(imagens -> {
							System.out.println(imagens.attr("src"));
						});
									
			
			System.out.println(contenido);
						
			//System.out.println(document.html());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
