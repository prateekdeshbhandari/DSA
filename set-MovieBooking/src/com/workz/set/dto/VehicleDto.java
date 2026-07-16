package com.workz.set.dto;

import lombok.*;

import java.util.Objects;

@Data
@AllArgsConstructor
@Setter
@Getter
@ToString
public class VehicleDto {
   private String vehicleName;

    @Override
    public int hashCode() {
        return Objects.hash(vehicleName);
    }
}
