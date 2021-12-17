package pl.paulina_labarzewska_4ta.hotelsapplication.remote.rest.dto.request;

import pl.paulina_labarzewska_4ta.hotelsapplication.remote.rest.dto.response.ReservationStatusDto;

import java.util.List;

public class UpdateReservationDto {

    private ReservationStatusDto status;
    private List<HotelReservationDto> hotels;
    private PersonReservationDto person;

    public UpdateReservationDto(ReservationStatusDto status, List<HotelReservationDto> hotels, PersonReservationDto person) {
        this.status = status;
        this.hotels = hotels;
        this.person = person;
    }

    public ReservationStatusDto getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusDto status) {
        this.status = status;
    }

    public List<HotelReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }

}
