package br.com.monteiro.screenmatch.models;

public class Series extends Title {

    private int seasons;
    private int episodePerSeasons;
    private int minsPerEpisodes;
    private boolean activated;
    private int minsPerSeasons;

    //Construtor
    public Series (String name, int releaseYear) {
        super(name, releaseYear);
    }

    // Getters and Setters
    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public int getEpisodePerSeasons() {
        return episodePerSeasons;
    }

    public void setEpisodePerSeasons(int episode) {
        this.episodePerSeasons = episode;
    }

    public int getMinsPerSeasons() {
        return minsPerSeasons;
    }

    public int getMinsPerEpisodes() {
        return minsPerEpisodes;
    }

    public void setMinsPerEpisodes(int minsPerEpisodes) {
        this.minsPerEpisodes = minsPerEpisodes;
    }

    public void setMinsPerSeasons(int minsPerSeasons) {
        this.minsPerSeasons = minsPerSeasons;
    }

    @Override
    public int getDurationTime() {
        return (seasons * episodePerSeasons * minsPerEpisodes);
    }

    @Override
    public String toString() {
        return "Series " +this.getName() + "(" + this.getReleaseYear() + ")";}
}
