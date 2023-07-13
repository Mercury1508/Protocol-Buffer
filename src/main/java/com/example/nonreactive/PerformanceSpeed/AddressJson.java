package com.example.nonreactive.PerformanceSpeed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressJson {
    private int house_number;
    private String apartment;
    private int sector ;
    private String landmark;
    private String city;
    private String state;
    private String pincode;
    private String country;
    private String continent;
    private String planet;

}
