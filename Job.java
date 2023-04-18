import java.time.LocalDateTime;

public class Job {
    private String location;
    private String type;
    private LocalDateTime date;

    public Job(String location, String type, LocalDateTime date) {
        this.location = location;
        this.type = type;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
