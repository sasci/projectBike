package io.sasci.bike.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BikeStatus {
    private int code;
    private String message;
    private boolean online;
}
