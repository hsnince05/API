package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingResponsePojo {

    private Integer bookiingid;
    private BookingPojo booking;

    public BookingResponsePojo() {
    }

    public BookingResponsePojo(Integer bookiingid, BookingPojo booking) {
        this.bookiingid = bookiingid;
        this.booking = booking;
    }

    public Integer getBookiingid() {
        return bookiingid;
    }

    public void setBookiingid(Integer bookiingid) {
        this.bookiingid = bookiingid;
    }

    public BookingPojo getBooking() {
        return booking;
    }

    public void setBooking(BookingPojo booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "BookingResponsePojo{" +
                "bookiingid=" + bookiingid +
                ", booking=" + booking +
                '}';
    }
}
