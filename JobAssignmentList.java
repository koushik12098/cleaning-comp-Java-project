import java.util.ArrayList;
import java.util.List;

public class JobAssignmentList {
private List<JobAssignment> jobAssignments;
public JobAssignmentList() {
    this.jobAssignments = new ArrayList<>();
}

public void assignJob(Cleaner cleaner, Job job) {
    JobAssignment assignment = new JobAssignment(cleaner, job, java.time.LocalDateTime.now());
    jobAssignments.add(assignment);
}

public void unassignJob(Cleaner cleaner, Job job) {
    for (JobAssignment assignment : jobAssignments) {
        if (assignment.getCleaner().equals(cleaner) && assignment.getJob().equals(job)) {
            jobAssignments.remove(assignment);
            break;
        }
    }
}

public List<JobAssignment> getJobAssignments() {
    return jobAssignments;
}

public List<JobAssignment> getJobAssignmentsForCleaner(Cleaner cleaner) {
    List<JobAssignment> result = new ArrayList<>();
    for (JobAssignment assignment : jobAssignments) {
        if (assignment.getCleaner().equals(cleaner)) {
            result.add(assignment);
        }
    }
    return result;
}

@Override
public String toString() {
    return "JobAssignmentList{" +
            "jobAssignments=" + jobAssignments +
            '}';
}
}