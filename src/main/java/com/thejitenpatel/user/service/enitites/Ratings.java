package com.thejitenpatel.user.service.enitites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ratings {
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String remarks;
    private String feedback;
}
