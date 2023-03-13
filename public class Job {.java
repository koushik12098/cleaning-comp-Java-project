public class Job {
    private String location;
    private String date;
    private String time;
    private boolean completed;
    
    // constructor
    public Job(String location, String date, String time) {
        this.location = location;
        this.date = date;
        this.time = time;
        this.completed = false; // job is not completed by default
    }
    
    // getters and setters
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    public boolean isCompleted() {
        return completed;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}