package br.com.monteiro.screenmatch.main;

import br.com.monteiro.screenmatch.models.Film;
import br.com.monteiro.screenmatch.models.Series;
import br.com.monteiro.screenmatch.models.Title;

import java.util.*;

public class MainComListas {
    public static void main(String[] args) {
        Film film01 = new Film("Sniper Americano", 2014);
        film01.review(5);
        Film novoFilm = new Film("JAVA", 1995);
        novoFilm.review(10);
        Series prisonbreak = new Series("Prison Break", 2005);

        ArrayList<Title> filmList = new ArrayList<>();
        filmList.add(film01);
        filmList.add(novoFilm);
        filmList.add(prisonbreak);
        for (Title item: filmList) {
            System.out.println(item.getName());
            if (item instanceof Film film && film.getReview() > 2){
                System.out.println("Review: " + film.getReview());
            }
        }

        List<String> buscaPorArtistas = new LinkedList<>();
        buscaPorArtistas.add("Adam");
        buscaPorArtistas.add("Cris");
        buscaPorArtistas.add("Bred");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Depois da ordenacao " + buscaPorArtistas);

        System.out.println(filmList);
        System.out.println("Lista de filmes ordenadas ");
        filmList.sort(Comparator.comparing(Title::getName));
        System.out.println(filmList);

        filmList.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Ordenando por ano " + filmList);
    }
}
