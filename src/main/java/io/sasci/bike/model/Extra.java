package io.sasci.bike.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Extra {
    private BikeStatus status;
    private List<Integer> bike_uids;
    private int number;
    private int uid;
    private int slots;
}
