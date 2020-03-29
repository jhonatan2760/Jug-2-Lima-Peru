package br.com.jhonatansouza.jug2;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * JUG 2 - LIMA!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        					//crea una conexión con la pagina
			Document doc = Jsoup.connect("https://elcomercio.pe/?ref=ecr")
									//define el navegador utilizado
									.userAgent("Mozilla/Gecko")
									//sigue los redireccionamientos de la página
									.followRedirects(true)
									//haz el metodo get [Http]
									.get();
			

			
			//Ahora trabajamos con el contenido recibido
			List<Noticia> noticias = doc.getElementsByClass("triplet__title-link")
					.stream()
					//hacemos la conversion de todos para noticia
					.map(n -> new Noticia(n.text(), n.attr("href")))
					//imprimimos en lo console
					.peek(System.out::println)
					//convertimos para una lista
					.collect(Collectors.toList());
			
			System.out.println("cuantidad d noticias : "+noticias.size());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
