import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
/*/*
 * Create the Student and Priorities classes here.
 */
class Priorities {
    PriorityQueue<Student> pq = new PriorityQueue<>();

    public List<Student> getStudents(List<String> events) {
        String[] sa;
        String command;
        String name;
        double cpga;
        int id;
        for (String e : events) {
            sa = e.split("\\s");
            command = sa[0];

            if (command.equals("ENTER")) {
                name = sa[1];
                cpga = Double.parseDouble(sa[2]);
                id = Integer.parseInt(sa[3]);
                pq.offer(new Student(name, cpga, id));
            }
            if (command.equals("SERVED")) {
                pq.poll();
            }
        }
        ArrayList<Student> l = new ArrayList<Student>(pq);
        l.sort(null);
        return l;
    }

}

class Student implements Comparable<Student> {
    String name;
    double cpga;
    int id;

    public String getName() {
        return name;
    }

    public double getCpga() {
        return cpga;
    }

    public int getId() {
        return id;
    }

    public Student(String name, double cpga, int id) {
        super();
        this.name = name;
        this.cpga = cpga;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.cpga != o.cpga ? Double.compare(o.cpga,
                 this.cpga) : !this.name.equals(o.name) ?
                 this.name.compareTo(o.name) : Integer.compare(this.id, o.id);

        //return Comparator.comparing(Student::getCpga, Comparator.reverseOrder()).thenComparing(Student::getName).thenComparing(Student::getId).compare(this, o);
    }

}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}