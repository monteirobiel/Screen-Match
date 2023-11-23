package br.com.monteiro.screenmatch.models;

public class Catalog {
    private String name;

    private int releaseYear;
    private int durationTime;
    private boolean planIncluded;

    private double sumReview;

    private int totalReviews;


    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public void setPlanIncluded(boolean b) {
        this.planIncluded = planIncluded;
    }

    public double getSumReview() {
        return sumReview;
    }
    public int getTotalReviews() {
        return totalReviews;
    }


    // Methods

    public void dataSheet () {
        System.out.println("Film / Series name: " + name );
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
