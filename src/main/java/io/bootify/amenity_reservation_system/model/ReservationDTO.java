package io.bootify.amenity_reservation_system.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationDTO {

    private Long id;

    @NotNull
    private LocalDate reservationDate;

    @NotNull
    @Schema(type = "string", example = "18:30")
    private LocalTime startTime;

    @NotNull
    @Schema(type = "string", example = "18:30")
    private LocalTime endTime;

    @NotNull
    private Long user;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(final LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(final LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(final LocalTime endTime) {
        this.endTime = endTime;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(final Long user) {
        this.user = user;
    }

}
