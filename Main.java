import java.time.LocalDateTime;

public class Main {
public static void main(String[] args) {
// create cleaners
Cleaner john = new Cleaner("manish", "123 patna", "5522-73904", "manish@email.com");
Cleaner jane = new Cleaner("John wick", "322 Oak street", "3335-3322", "wick@email.com");
    // create jobs
    Job office = new Job("293 apple street", "laundry cleaning", LocalDateTime.of(2023, 4, 15, 10, 0));
    Job home = new Job("455 Maple tree", "room cleaning", LocalDateTime.of(2023, 4, 16, 14, 0));

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
