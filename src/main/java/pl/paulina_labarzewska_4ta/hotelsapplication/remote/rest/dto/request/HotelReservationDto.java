package pl.paulina_labarzewska_4ta.hotelsapplication.remote.rest.dto.request;

public class HotelReservationDto {

    private Integer id;
    private Integer room;
    private Integer days;

    public HotelReservationDto(Integer id, Integer room, Integer days) {
        this.id = id;
        this.room = room;
        this.days = days;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
