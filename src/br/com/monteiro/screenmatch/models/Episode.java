package br.com.monteiro.screenmatch.models;

import br.com.monteiro.screenmatch.calculations.Review;

public class Episode implements Review {
    private int number;
    private String name;
    private Series series;
    private int totalViews;


    // Getters and Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getReview() {
        if (totalViews > 100 ) {
            return 4;
        }else {
            return 2;
        }
    }
}
