package service;

import constant.Constants;
import response.ResponseByImdbId;
import response.ResponseByMovieName;

import static io.restassured.RestAssured.given;

public class MovieController {
    public ResponseByMovieName searchMovie(String movieName) {
        return given()
                .when()
                .get("http://www.omdbapi.com/?apikey=" + Constants.API_KEY + "&s=" + movieName)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .jsonPath()
                .getObject("", ResponseByMovieName.class);
    }

    public ResponseByImdbId searchMovieDetail(String imdbId) {
        return given()
                .when()
                .get("http://www.omdbapi.com/?apikey=" + Constants.API_KEY + "&i=" + imdbId)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .jsonPath()
                .getObject("", ResponseByImdbId.class);
    }
}
