package com.gla.StreamAPI.proble;

import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String toString() {
        return name + " Rating:" + rating + " Year:" + year;
    }
}

public class TrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("MovieA", 4.5, 2023),
                new Movie("MovieB", 4.8, 2024),
                new Movie("MovieC", 4.2, 2022),
                new Movie("MovieD", 4.9, 2024),
                new Movie("MovieE", 4.1, 2021),
                new Movie("MovieF", 4.7, 2023)
        );

        movies.stream()
                .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                        .thenComparingInt(m -> m.year).reversed())
                .limit(5)
                .forEach(System.out::println);
    }
}
