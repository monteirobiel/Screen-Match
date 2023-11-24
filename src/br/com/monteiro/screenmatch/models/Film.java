package br.com.monteiro.screenmatch.models;

import br.com.monteiro.screenmatch.calculations.Review;

public class Film extends Catalog implements Review {
    private String director;

    // Getter and Setter
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getReview() {
        return (int) average() / 2 ;
    }
}
