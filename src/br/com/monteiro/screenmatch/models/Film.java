package br.com.monteiro.screenmatch.models;

import br.com.monteiro.screenmatch.calculations.Review;

public class Film extends Title implements Review {
    private String director;

    //Construtor
    public Film(String nome, int releaseYear) {
        super(nome, releaseYear);
    }

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

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
