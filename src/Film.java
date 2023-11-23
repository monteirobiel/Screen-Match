public class Film {

    String name;
    int releaseYear;
    int durationTime;
    boolean planIncluded;
    double sumReview;
    int totalReviews;


    // Methods

    public void dataSheet () {
        System.out.println("Nome do filme: " + name );
        System.out.println("Year of release: " +releaseYear);
        System.out.println("Film duration: " + durationTime);
        System.out.println("Its included in the plan: " + planIncluded);
    }

    public void review (double grade) {
        sumReview += grade;
        totalReviews++;
    }

    public double average () {
        return sumReview / totalReviews;
    }

}
