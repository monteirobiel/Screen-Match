package br.com.monteiro.screenmatch.calculations;

public class FilterRecommendation {

    public void filter (Review review) {
        if (review.getReview() >= 4 ) {
            System.out.println("One of the most watched right now ");
        }else if (review.getReview() >= 2){
            System.out.println("Good review at the moment ");
        }else {
            System.out.println("Watch later ");
        }
    }
}
