import java.util.ArrayList;
import java.util.List;

public class CleanerList {
    private List<Cleaner> cleaners;

    public CleanerList() {
        this.cleaners = new ArrayList<>();
    }

    public void addCleaner(Cleaner cleaner) {
        cleaners.add(cleaner);
    }

    public void removeCleaner(Cleaner cleaner) {
        cleaners.remove(cleaner);
    }

    public List<Cleaner> getCleaners() {
        return cleaners;
    }

    public Cleaner getCleanerByName(String name) {
        for (Cleaner cleaner : cleaners) {
            if (cleaner.getName().equals(name)) {
                return cleaner;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "CleanerList{" +
                "cleaners=" + cleaners +
                '}';
    }
}
