import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
    public static void main(String[] args) {
        // create lists
        CleanerList cleanerList = new CleanerList();
        JobList jobList = new JobList();
        JobAssignmentList jobAssignmentList = new JobAssignmentList();

        // populate lists with sample data
        Cleaner john = new Cleaner("manish", "123 patna", "5522-73904", "manish@email.com");
        Cleaner jane = new Cleaner("John wick", "322 Oak street", "3335-3322", "wick@email.com");
        cleanerList.addCleaner(john);
        cleanerList.addCleaner(jane);

        Job office = new Job("293 apple street", "laundry cleaning", java.time.LocalDateTime.of(2023, 4, 15, 10, 0));
        Job home = new Job("455 Maple tree", "room cleaning", java.time.LocalDateTime.of(2023, 4, 16, 14, 0));
        jobList.addJob(office);
        jobList.addJob(home);

        jobAssignmentList.assignJob(john, office);
        jobAssignmentList.assignJob(jane, home);

        // generate reports
        try (FileWriter writer = new FileWriter("report.txt")) {
            writer.write("List of cleaners:\n");
            List<Cleaner> cleaners = cleanerList.getCleaners();
            for (Cleaner cleaner : cleaners) {
                writer.write(cleaner + "\n");
            }

            writer.write("\nList of jobs:\n");
            List<Job> jobs = jobList.getJobs();
            for (Job job : jobs) {
                writer.write(job + "\n");
            }

            writer.write("\nList of job assignments:\n");
            List<JobAssignment> jobAssignments = jobAssignmentList.getJobAssignments();
            for (JobAssignment assignment : jobAssignments) {
                writer.write(assignment + "\n");
            }

            writer.write("\nList of jobs assigned to John:\n");
            List<JobAssignment> johnAssignments = jobAssignmentList.getJobAssignmentsForCleaner(john);
            for (JobAssignment assignment : johnAssignments) {
                writer.write(assignment.getJob() + "\n");
            }
            System.out.println("---> Report has been generated.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
