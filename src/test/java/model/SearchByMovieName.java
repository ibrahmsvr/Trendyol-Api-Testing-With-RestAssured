package model;

import response.ResponseByMovieName;
import response.SearchByMovieNameDetail;
import service.MovieController;

public class SearchByMovieName {
    static String expectedTitle = "Harry Potter and the Sorcerer's Stone";
    static String imdbId;

    public static String getImdbIdByMovieName(String movieName){
        MovieController movieController = new MovieController();
        ResponseByMovieName response = movieController.searchMovie(movieName);
        for(SearchByMovieNameDetail movieDetail : response.getSearch()){
            if (movieDetail.getTitle().equals(expectedTitle)){
                imdbId = movieDetail.getImdbID();
                break;
            }
        }
        return imdbId;
    }

}
