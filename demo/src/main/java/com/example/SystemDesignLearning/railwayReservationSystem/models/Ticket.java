package com.example.SystemDesignLearning.railwayReservationSystem.models;

import com.example.SystemDesignLearning.railwayReservationSystem.enums.BerthType;
import com.example.SystemDesignLearning.railwayReservationSystem.enums.TicketStatus;

public class Ticket {
    private String ticketId;
    private BerthType preferredBerth;
    private BerthType allottedBerth;
    private TicketStatus status;

    public Ticket(String id, BerthType preferredBerth, BerthType allottedBerth, TicketStatus status) {
        this.ticketId = id;
        this.preferredBerth = preferredBerth;
        this.allottedBerth = allottedBerth;
        this.status = status;
    }

    public String getTicketId() {
        return ticketId;
    }

    public BerthType getPreferredBerth() {
        return preferredBerth;
    }

    public BerthType getAllottedBerth() {
        return allottedBerth;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public String getDisplayBerth() {
        if (allottedBerth != null) {
            return allottedBerth.toString();
        }
        return status.toString();
    }

    public void setAllottedBerth(BerthType b) {
        this.allottedBerth = b;
    }

    public void setStatus(TicketStatus s) {
        this.status = s;
    }
}
