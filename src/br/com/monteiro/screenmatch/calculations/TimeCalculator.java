package br.com.monteiro.screenmatch.calculations.Film;
import br.com.monteiro.screenmatch.models.Catalog;
import br.com.monteiro.screenmatch.models.Film;
import br.com.monteiro.screenmatch.models.Series;

public class TimeCalculator {

    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void included (Film f) {
//        this.totalTime += f.getDurationTime();
//    }
//
//    public void included (Series s) {
//        this.totalTime += s.getDurationTime();
//    }

    public void included (Catalog catalog) {
        this.totalTime += catalog.getDurationTime();
        System.out.println("adding duration in minutes of: " + catalog);
    }
}
