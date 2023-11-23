import br.com.monteiro.screenmatch.models.Film;
import br.com.monteiro.screenmatch.models.Series;

public class Main {

    public static void main(String[] args) {

        Film film01 = new Film();

        film01.setName("American Sniper");
        film01.setReleaseYear(2014);
        film01.setDurationTime(180);
        film01.setPlanIncluded(true);

        film01.dataSheet();
        film01.review(8.5);
        film01.review(9);
        film01.review(7.7);
        System.out.println("Sum of Review " + film01.getSumReview());
        System.out.println("Total reviews: " + film01.getTotalReviews());
        System.out.println("Reviews average: " + film01.average());

        Series prisonBreak = new Series();

        prisonBreak.setName("Prison Break");
        prisonBreak.setReleaseYear(2005);
        prisonBreak.setPlanIncluded(true);
        prisonBreak.setActivated(true);
        prisonBreak.setSeasons(5);
        prisonBreak.setEpisodePerSeasons(10);
        prisonBreak.setMinsPerEpisodes(50);
        prisonBreak.dataSheet();
        System.out.println("Prison Break duration time: " + prisonBreak.getDurationTime());
    }
}
