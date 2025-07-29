class Employee {
    private final int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("working as an employee!");
    }

    public int getSalary() {
        return salary;
    }
}


// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
class HRManager extends Employee{
    private final int salary;
  public HRManager(int salary)
  {
    super(salary);
    this.salary=salary;
  }
    
      public void work() {
          System.out.println("Managing employees");
      }
     public int getSalary() {
          return salary;
      }
    
      public void addEmployee() {
          System.out.println("Adding new employee!");
      }
  }




  class SubClassConstructor {
    public static void main(String[] args) {
        Employee emp = new Employee(40000);
        HRManager mgr = new HRManager(70000);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());
        mgr.addEmployee();
    }
}