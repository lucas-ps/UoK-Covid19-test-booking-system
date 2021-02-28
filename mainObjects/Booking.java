package UoKCovid19TestBookingSystem.mainObjects;

import UoKCovid19TestBookingSystem.helperModules.BookingStatus;
import UoKCovid19TestBookingSystem.helperModules.TimeSlot;

import java.time.LocalDateTime;
import java.util.*;

public class Booking {

    // Attributes

    private Assistant assistantID;
    private Room room;
    private String studentEmail;
    private TimeSlot timeSlot;
    private BookingStatus status;

    // Constructor

    public Booking(Assistant assistantID,
                   Room room,
                   String studentEmail,
                   TimeSlot timeSlot,
                   BookingStatus status){
        this.assistantID = assistantID;
        this.room = room;
        this.studentEmail = studentEmail;
        this.timeSlot = timeSlot;
        this.status = status;
    }

    // Methods
}
