import java.time.LocalDateTime;

public class JobAssignment {
    private Cleaner cleaner;
    private Job job;
    private LocalDateTime dateAssigned;

    public JobAssignment(Cleaner cleaner, Job job, LocalDateTime dateAssigned) {
        this.cleaner = cleaner;
        this.job = job;
        this.dateAssigned = dateAssigned;
    }

    public Cleaner getCleaner() {
        return cleaner;
    }

    public Job getJob() {
        return job;
    }

    public LocalDateTime getDateAssigned() {
        return dateAssigned;
    }

    @Override
    public String toString() {
        return "JobAssignment{" +
                "cleaner=" + cleaner +
                ", job=" + job +
                ", dateAssigned=" + dateAssigned +
                '}';
    }
}
