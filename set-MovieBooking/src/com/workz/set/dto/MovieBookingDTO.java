package com.workz.set.dto;

import lombok.*;


@AllArgsConstructor
@Setter
@Getter
@ToString
public class MovieBookingDTO {

    private int movieId;
    private String movieName;
    private String language;
    private String genre;
    private double rating;
}
