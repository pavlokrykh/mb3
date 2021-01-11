package ua.kpi.comsys.iv7214.moviesapp;

public class Movie {

    String imdbID;
    String Title;
    String Year;
    String Poster;


    public Movie(String imdbID, String title, String year, String poster) {
        this.imdbID = imdbID;
        Title = title;
        Year = year;
        Poster = poster;
    }

    public Movie() {
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }
}
