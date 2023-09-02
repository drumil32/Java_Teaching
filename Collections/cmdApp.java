import java.util.*;

class Student implements Comparable<Object>{
    String firstName = null;
    String middleName = null;
    String lastName = null;
    int rollNo = 0;
    String address = null;
    int sem = 0;
    String branch = null;

    private Student(String []name, int rno, String address, int sem, String branch){
        firstName = name[0];
        middleName = name[1];
        lastName = name[2];

        rollNo = rno;
        this.address = address;
        this.sem = sem;
        this.branch = branch;
    }
    static class Builder{
        String firstName = null;
        String middleName = null;
        String lastName = null;
        int rollNo = 0;
        String address = null;
        int sem = 0;
        String branch = null;

        public Builder addName(String fName,String mName, String lName){
            firstName = fName;
            middleName = mName;
            lastName = lName;
            return this;
        }
        public Builder addSem(int sem){
            this.sem = sem;
            return this;
        }
        public Builder addRollNo(int rno){
            rollNo = rno;
            return this;
        }
        public Builder addAddr(String address){
            this.address = address;
            return this;
        }
        public Builder addBranch(String branch){
            this.branch = branch;
            return this;
        }
        public Student buildStudent() throws Exception{
            if(firstName == null || sem == 0 || rollNo == 0 || branch == null || address == null){
                throw new Exception("Missing Value in Student", null);
            }
            return new Student(new String[]{firstName,middleName,lastName}, rollNo, address, sem, branch);
        }
    }
    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        return (this.rollNo - s.rollNo);
    }
    
}
class University{
    String name = null;
    long regNum = 0;
    String address = null;
    Map<String,Set<Student>> department = null;

    private University(String name, long reno, String addr, Map<String,Set<Student>> mp){
        this.name = name;
        this.regNum = reno;
        this.address = addr;
        this.department = mp;
    }

    static class Builder{
        String name = null;
        long regNum = 0;
        String address = null;
        Map<String,Set<Student>> department = null;
            public Builder addName(String name){
                this.name = name;
                return this;
            }
        public Builder addRegNum(long num){
            regNum = num;
            return this;
        }
        public Builder addAddress(String addr){
            address = addr;
            return this;
        }
        public Builder addDept(String dName){
            if(department == null){
                department = new TreeMap<>();
            }
            department.put(dName, new TreeSet<>());
            return this;
        }
        public Builder addStudent(String dept,Student std) throws Exception{
            if(department == null)
                throw new Exception("Invalid method call", null);
            department.get(dept).add(std);
            return this;
        }
        public University builUniversity(){
            return new University(name, regNum, address, department);
        }

    }
    public University addDept(String dName){
        if(department == null){
            department = new TreeMap<>();
        }
        department.put(dName, new TreeSet<>());
        return this;
    }
    public University addStudent(String dept,Student std) throws Exception{
        if(department == null)
            throw new Exception("Invalid method call", null);
        department.get(dept).add(std);
        return this;
    }
    
}
public class cmdApp {
    public void Menu(String name){
        System.out.println("********************************");
        System.out.println("********** Welcome *************");
        System.out.println("*** Enter 1 to print "+ name +"****" );
        System.out.println("Enter 2 to Search in for "+ name  );
        System.out.println("********************************");
    }
    public void addUniversity(){
        
    }
    public static void main(String[] args) {
        try{
            University.Builder b = new University.Builder();
            b.addName("DDU");
            b.addRegNum(101);
            b.addDept("IT");
            b.addAddress("College Road Nadiad");
            b.addStudent("IT", new Student.Builder().addName("A", "B", "C").addRollNo(10101).addSem(5).addBranch("IT").addAddr("Somewhere on earth").buildStudent());
            University UNI = b.builUniversity();
            Map<String,University> list = new TreeMap<>();
            list.put("DDU", UNI);

            cmdApp obj = new cmdApp();
            Scanner sc = new Scanner(System.in);
            try{

                obj.Menu( "University");
                int n = sc.nextInt();
                String dummy = sc.nextLine();
                if(n == 1){
                    System.out.println(list.keySet());
                }else if(n == 2){
                    System.out.println("Enter College name : ");
                    String inCol = sc.nextLine();
                    if(!list.containsKey(inCol))
                        throw new Exception("Invalid College Name", null);
                    System.out.println("Enter Department name : ");
                    String dept = sc.nextLine();
                    University u = list.get(inCol);
                    if(!u.department.containsKey(dept))
                        throw new Exception("Invalid Department Name", null);
                    
                    System.out.println("The list of students from this uni are " );
                    u.department.get(dept).forEach((s) -> {
                        System.out.println(s.firstName);
                        System.out.println(s.middleName);
                        System.out.println(s.lastName);
                        System.out.println(s.rollNo);
                        System.out.println(s.sem);
                        System.out.println(s.address);});
                }else{
                    System.out.println("***** Invalid Input ***********");
                }

            }catch(Exception e)
            {

            }
            finally{
                sc.close();
            }
    }catch(Exception e){
        e.printStackTrace();
        System.out.println(e);
    }
        
    }    
}