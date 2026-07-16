package com.workz.set.Runner;

import com.workz.set.dto.MovieBookingDTO;

import java.util.HashSet;
import java.util.Set;

public class MovieBookingRunner {
    public static void main(String[] args) {
        Set<MovieBookingDTO>movieBookings=new HashSet<>();
        movieBookings.add(new MovieBookingDTO(101, "KGF Chapter 2", "Kannada", "Action", 9.4));
        movieBookings.add(new MovieBookingDTO(102, "Kantara", "Kannada", "Adventure", 9.3));
        movieBookings.add(new MovieBookingDTO(103, "RRR", "Telugu", "Action", 9.0));
        movieBookings.add(new MovieBookingDTO(104, "Pushpa", "Telugu", "Action", 8.8));
        movieBookings.add(new MovieBookingDTO(105, "Leo", "Tamil", "Action", 8.7));
        movieBookings.add(new MovieBookingDTO(106, "Vikram", "Tamil", "Thriller", 9.1));
        movieBookings.add(new MovieBookingDTO(107, "Drishyam 2", "Malayalam", "Crime", 9.2));
        movieBookings.add(new MovieBookingDTO(108, "777 Charlie", "Kannada", "Drama", 9.1));
        movieBookings.add(new MovieBookingDTO(109, "Jawan", "Hindi", "Action", 8.9));
        movieBookings.add(new MovieBookingDTO(110, "Dangal", "Hindi", "Sports", 9.5));

for(MovieBookingDTO movieBookingDTO:movieBookings){
    System.out.println(movieBookingDTO);
}
    }
}
