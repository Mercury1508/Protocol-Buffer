package com.example.nonreactive.PerformanceSpeed;
import com.example.proto.Address;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class Performance {

    private static ObjectMapper mapper = new ObjectMapper();
    private static AddressJson addressJson;
    private static Address address;

    public static void main(String[] args) {

        addressJson = Performance.generateAddressJson();
        address = Performance.generateAddressProto();

        for (int i = 0; i < 3; i++) {
            testPerformance(Performance::jsonSerializingAndDeserializing, "Json");
            testPerformance(Performance::protoSerializingAndDeserializing, "proto");
        }
    }

    private static AddressJson generateAddressJson() {
        return new AddressJson(2203,"San Marino",45,"DPS school","Gurgaon","Haryana","122003","India","Asia","Earth");
    }

    @SneakyThrows
    private static void jsonSerializingAndDeserializing() {
        var addressJson = mapper.writeValueAsString(Performance.generateAddressJson());
        var addressRestDeserializing = mapper.readValue(addressJson, AddressJson.class);
    }

    private static Address generateAddressProto() {
        return Address.newBuilder()
                .setHouseNumber(2203)
                .setApartment("San Marino")
                .setSector(45)
                .setLandmark("DPS school")
                .setCity("Gurgaon")
                .setState("Haryana")
                .setPincode("122003")
                .setCountry("India")
                .setContinent("Asia")
                .setPlanet("Earth")
                .build();
    }

    @SneakyThrows
    private static void protoSerializingAndDeserializing() {
        var bytes = address.toByteArray();
        var adrress = Address.parseFrom(bytes);
    }

    private static void testPerformance(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            runnable.run();
        }
        long time2 = System.currentTimeMillis();

        System.out.println(method + " : " + (time2 - time1) + " ms");
    }

}
