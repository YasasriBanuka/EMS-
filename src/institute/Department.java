
package institute;

interface Manager {
    @Override
    String toString();
}
// DEPARTMENT CLASS IMPLEMENTING MANAGER 

 class Department implements Manager {
    private int id;
    private String department;

    public Department(int id, String department) {
        
        this.id = id;
        this.department = department;
    }

 //  IMPLEMENTING THE INTERFACE METHOD 
    @Override
    public String toString() {
        return department;
    }
}
//=================================================================================================================
 
class Designation implements Manager {
     
    private int id;
    private String designation;

    public Designation(int id, String designation) {
        
        this.id = id;
        this.designation = designation;
    }

    // IMPLEMENTING THE INTERFACE METHOD 
    @Override
    public String toString() {
        return designation;
        
    }
}
