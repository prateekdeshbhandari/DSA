package com.workz.set.Runner;

import com.workz.set.dto.VehicleDto;

import java.util.HashSet;
import java.util.Set;

public class VehicleRunner {
    public static void main(String[] args) {



            Set<VehicleDto> vehicleDtos = new HashSet<>();

            vehicleDtos.add(new VehicleDto("BMW"));
            vehicleDtos.add(new VehicleDto("Audi"));
            vehicleDtos.add(new VehicleDto("Mercedes"));
            vehicleDtos.add(new VehicleDto("Toyota"));
            vehicleDtos.add(new VehicleDto("Honda"));
            vehicleDtos.add(new VehicleDto("BMW"));
            vehicleDtos.add(new VehicleDto("Mahindra"));
            vehicleDtos.add(new VehicleDto("Tata"));
            vehicleDtos.add(new VehicleDto("Kia"));
            vehicleDtos.add(new VehicleDto("Ford"));

            System.out.println(vehicleDtos);
            System.out.println("Size: " + vehicleDtos.size());
    }
}
