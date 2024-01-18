
package institute;
public class Employee {
    private String eName; private String eDepartment;String eDesignation; private String eNumber;
    private String epf;
    
 public Employee (String eName,String eDepartment ,String eDesignation,String eNumber,String epf){
     this.eName =eName;this.eDepartment = eDepartment;this.eDesignation =eDesignation; this.eNumber =eNumber;
     this.epf= epf; 
 }
 // getters and setters
 public String geteName(){
     return eName;
 }
 public void seteName(String eName){
     this.eName=eName;
 }
 public String geteDepartment(){   
     return eDepartment;  
}
 public void seteDepartment(){
     this.eDepartment=eDepartment;
 }
 public String geteDesignation(){ 
     return eDesignation;  
 }
 public void seteNumber(String eNumber){
     this.eNumber =eNumber;
 }
 public String getepf(){
     return epf;  
 }
 public void setepf(String epf){
     this.epf = epf;
 }
}