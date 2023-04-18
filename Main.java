import java.time.LocalDateTime;

public class Main {
public static void main(String[] args) {
// create cleaners
Cleaner john = new Cleaner("John Smith", "123 Main St", "555-1234", "john@email.com");
Cleaner jane = new Cleaner("Jane Doe", "456 Oak Ave", "555-5678", "jane@email.com");
    // create jobs
    Job office = new Job("123 Elm St", "office cleaning", LocalDateTime.of(2023, 4, 15, 10, 0));
    Job home = new Job("789 Maple Ave", "home cleaning", LocalDateTime.of(2023, 4, 16, 14, 0));

    // create lists
    CleanerList cleanerList = new CleanerList();
    cleanerList.addCleaner(john);
    cleanerList.addCleaner(jane);

    JobList jobList = new JobList();
    jobList.addJob(office);
    jobList.addJob(home);

    JobAssignmentList jobAssignmentList = new JobAssignmentList();
    jobAssignmentList.assignJob(john, office);
    jobAssignmentList.assignJob(jane, home);

    // print lists
    System.out.println("Cleaners:");
    System.out.println(cleanerList);

    System.out.println("Jobs:");
    System.out.println(jobList);

    System.out.println("Job assignments:");
    System.out.println(jobAssignmentList);
}
}