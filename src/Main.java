import br.com.monteiro.screenmatch.calculations.FilterRecommendation;
import br.com.monteiro.screenmatch.models.Episode;
import br.com.monteiro.screenmatch.models.Film;
import br.com.monteiro.screenmatch.calculations.Film.TimeCalculator;
import br.com.monteiro.screenmatch.models.Series;

import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {


        Film film01 = new Film("Sniper Americano", 2014);
        film01.setDurationTime(250);
        film01.setPlanIncluded(true);

        film01.dataSheet();
        film01.review(8.5);
        film01.review(9);
        film01.review(7.7);
        System.out.println("Sum of Review " + film01.getSumReview());
        System.out.println("Total reviews: " + film01.getTotalReviews());
        System.out.println("Reviews average: " + film01.average());


        Series novaSerie1 = new Series("Prison Break", 2005);
        novaSerie1.setPlanIncluded(true);
        novaSerie1.setActivated(true);
        novaSerie1.setSeasons(5);
        novaSerie1.setEpisodePerSeasons(10);
        novaSerie1.setMinsPerEpisodes(50);
        novaSerie1.dataSheet();
        System.out.println("Prison Break duration time: " + novaSerie1.getDurationTime());

        TimeCalculator calculator = new TimeCalculator();
        calculator.included(film01);
        System.out.println(calculator.getTotalTime());

        FilterRecommendation filterRec = new FilterRecommendation();
        filterRec.filter(film01);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(novaSerie1);
        episode.setTotalViews(300);
        filterRec.filter(episode);


        Film novoFilm = new Film("JAVA", 1995);
        novoFilm.review(5);

        ArrayList <Film> filmList = new ArrayList<>();
        filmList.add(novoFilm);
        System.out.println("Tamanho da lista " + filmList.size());
        System.out.println("Primeiro Filme: " + filmList.get(0).getName());
        System.out.println("toString do Filme: " + filmList.get(0).toString());

    }
}
