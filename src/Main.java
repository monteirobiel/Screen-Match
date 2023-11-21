public class Main {

    public static void main(String[] args) {

        Film film01 = new Film();

        film01.name = "American Sniper";
        film01.releaseYear = 2014;
        film01.durationTime = 180;
        film01.planIncluded = true;

        film01.dataSheet();
        film01.review(8.5);
        film01.review(9);
        film01.review(7.7);
        System.out.println("Sum of Review " + film01.sumReview);
        System.out.println("Total reviews " + film01.totalReviews);
        System.out.println("Reviews average: " + film01.average());
    }
}
