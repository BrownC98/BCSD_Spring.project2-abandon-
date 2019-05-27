package domain;


import java.sql.Date;

public class EventVO {
    //eventID, userID, event_name, start, end, state
    private int eventId;
    private int userId;//(fk)
    private String eventName;
    private Date eventStart;
    private Date eventEnd;
    private String eventState;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventStart() {
        return eventStart;
    }

    public void setEventStart(Date eventStart) {
        this.eventStart = eventStart;
    }

    public Date getEventEnd() {
        return eventEnd;
    }

    public void setEventEnd(Date eventEnd) {
        this.eventEnd = eventEnd;
    }

    public String getEventState() {
        return eventState;
    }

    public void setEventState(String eventState) {
        this.eventState = eventState;
    }

    @Override
    public String toString() {
        return "EventVO{" +
                "eventId=" + eventId +
                ", userId=" + userId +
                ", eventName='" + eventName + '\'' +
                ", eventStart=" + eventStart +
                ", eventEnd=" + eventEnd +
                ", eventState='" + eventState + '\'' +
                '}';
    }
}
