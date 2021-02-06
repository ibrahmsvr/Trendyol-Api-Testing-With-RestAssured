package test;

import model.SearchByMovieName;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import response.ResponseByImdbId;
import service.MovieController;

public class TestMethod {
    MovieController movieController = new MovieController();
    String expectedTitle = "Harry Potter and the Sorcerer's Stone";
    String expectedYear = "2001";
    String expectedReleased = "16 Nov 2001";
    String movieName = "Harry Potter";


    @Test
    public void checkMovieProperties(){
        String imdbId = SearchByMovieName.getImdbIdByMovieName(movieName);
        ResponseByImdbId responseByImdbId = movieController.searchMovieDetail(imdbId);
        assertEquals(responseByImdbId.getTitle(), expectedTitle);
        assertEquals(responseByImdbId.getYear(), expectedYear);
        assertEquals(responseByImdbId.getReleased(), expectedReleased);
    }
}
