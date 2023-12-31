package com.smart4aviation.flightInformation.repository;

import com.smart4aviation.flightInformation.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    //@Query("SELECT f FROM Flight f WHERE f.flightNumber = :flightNumber AND f.departureDate = :departureDate")
    Optional<Flight> findByFlightNumberAndDepartureDate(int flightNumber, String departureDate);
    long countByDepartureAirportIATACodeAndDepartureDate(String code, String date);
    Optional<List<Flight>> findAllByDepartureAirportIATACodeAndDepartureDate(String code, String date);
    long countByArrivalAirportIATACodeAndDepartureDate(String code, String date);
    Optional<List<Flight>> findAllByArrivalAirportIATACodeAndDepartureDate(String code, String date);
}
