package io.sasci.bike.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BikeNetwork {
    @JsonIgnore
    private List<String> company;
    private String href;
    private String gbfs_href;
    private String id;
    private BikeLicence license;
    private String source;
    private BikeLocation location;
    private String name;
}
