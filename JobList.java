import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JobList {
    private List<Job> jobs;

    public JobList() {
        this.jobs = new ArrayList<>();
    }

    public void addJob(Job job) {
        jobs.add(job);
    }

    public void removeJob(Job job) {
        jobs.remove(job);
    }
    public List<Job> getJobs() {
        return jobs;
        }public List<Job> getJobsByLocation(String location) {
            List<Job> result = new ArrayList<>();
            for (Job job : jobs) {
                if (job.getLocation().equals(location)) {
                    result.add(job);
                }
            }
            return result;
        }
        
        public List<Job> getJobsByDate(LocalDateTime date) {
            List<Job> result = new ArrayList<>();
            for (Job job : jobs) {
                if (job.getDate().equals(date)) {
                    result.add(job);
                }
            }
            return result;
        }
        
        @Override
        public String toString() {
            return "JobList{" +
                    "jobs=" + jobs +
                    '}';
        }
        }