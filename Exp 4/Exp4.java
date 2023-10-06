package exp4;
import java.util.Scanner;

class Employee
{
    String name;
    int empid;
    String department;
    String designation;
    int Experience;
    int basicpay,da,gradepay,personalpay,itax,professtax,epf;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    public void setBasicpay(int basicpay) {
        this.basicpay = basicpay;
    }

    public void setDa(int da) {
        this.da = da;
    }

    public void setGradepay(int gradepay) {
        this.gradepay = gradepay;
    }

    public void setPersonalpay(int personalpay) {
        this.personalpay = personalpay;
    }

    public void setItax(int itax) {
        this.itax = itax;
    }

    public void setProfesstax(int professtax) {
        this.professtax = professtax;
    }

    public void setEpf(int epf) {
        this.epf = epf;
    }
    void display()
    {
        System.out.println("\nName of employee: "+name);
        System.out.println("Employee Id: "+empid);
        System.out.println("Department: "+department);
        System.out.println("Designation: "+designation);
        System.out.println("Experience: "+Experience);
        System.out.println("Basic Pay: "+basicpay);
        System.out.println("DA: "+da);
        System.out.println("Grade Pay: "+gradepay);
        System.out.println("Personal Pay: "+personalpay);
        System.out.println("Income Tax: "+itax);
        System.out.println("Professional Tax: "+professtax);
        System.out.println("Employee Provident Fund: "+epf);
}
}
class Permanent_Employee extends Employee
{
    int netsalary;
    void display()
    {
        super.display();
        netsalary=basicpay+da+gradepay+personalpay-itax-professtax-epf;
        System.out.println("Net Salary: "+netsalary);
    }
    void payslip()
    {
        for(int i=1;i<=12;i++)
         {
             System.out.println("Month "+i+" Details: ");
             display();
         }
        
    }
    
}
class Contract_Employee extends Employee
{
    int netsalary;
    void display()
    {
        super.display();
        netsalary=basicpay+da+gradepay+personalpay-itax-professtax-epf;
        System.out.println("Net Salary: "+netsalary);
    }
    void payslip()
    {
         for(int i=1;i<=12;i++)
         {
             System.out.println("Month "+i+" Details: ");
             display();
         }
    }
}

public class Exp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of employees for which data is to be entered: ");
        int n=s.nextInt();
        Employee []e1,e2;
        e1=new Permanent_Employee[n];
        e2=new Contract_Employee[n];
        String nam,dep,desg;
        int choice,basic,da,eid,exp,gp,pp,it,pt,epf;
        label:while(true){
        System.out.println("\nChoices to do........... ");
        System.out.println("1.Create Permanenet Employee");
        System.out.println("2.Create Contract Employee");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.print("\nEnter your choice:");
        choice=s.nextInt();
        switch(choice)
        {
            case 1:
                for(int i=0;i<n;i++)
                {
                e1[i]=new Permanent_Employee();
                System.out.println("Add details for Employee "+(i+1)+": ");
                System.out.print("\nEnter Employee name:");
                nam=s.next();
                e1[i].setName(nam);
                System.out.print("Enter Employee ID:");
                eid=s.nextInt();
                e1[i].setEmpid(eid);
                System.out.print("Enter Department of Employee:");
                dep=s.next();
                e1[i].setDepartment(dep);
                System.out.print("Enter Designation of Employee:");
                desg=s.next();
                e1[i].setDesignation(desg);
                System.out.print("Enter Experience of Employee:");
                exp=s.nextInt();
                e1[i].setExperience(choice);
                System.out.print("Enter Basic Pay:");
                basic=s.nextInt();
                e1[i].setBasicpay(basic);
                System.out.print("Enter Daily Alolowance:");
                da=s.nextInt();
                e1[i].setDa(da);
                System.out.print("Enter Grade Pay:");
                gp=s.nextInt();
                e1[i].setGradepay(gp);
                System.out.print("Enter Personal Pay:");
                pp=s.nextInt();
                e1[i].setPersonalpay(pp);
                System.out.print("Enter Income Tax:");
                it=s.nextInt();
                e1[i].setItax(it);
                System.out.print("Enter Professional Tax:");
                pt=s.nextInt();
                e1[i].setProfesstax(pt);
                System.out.print("Enter Employee Provident Fund:");
                epf=s.nextInt();
                e1[i].setEpf(epf);
                System.out.println("");
                }
                break;
            case 2:
                for(int i=0;i<n;i++)
                {
                System.out.println("Add details for Employee "+(i+1)+": ");
                e2[i]=new Contract_Employee();
                System.out.print("\nEnter Employee name:");
                nam=s.next();
                e2[i].setName(nam);
                System.out.print("Enter Employee ID:");
                eid=s.nextInt();
                e2[i].setEmpid(eid);
                System.out.print("Enter Department of Employee:");
                dep=s.next();
                e2[i].setDepartment(dep);
                System.out.print("Enter Designation of Employee:");
                desg=s.next();
                e2[i].setDesignation(desg);
                System.out.print("Enter Experience of Employee:");
                exp=s.nextInt();
                e2[i].setExperience(choice);
                System.out.print("Enter Basic Pay:");
                basic=s.nextInt();
                e2[i].setBasicpay(basic);
                System.out.print("Enter Daily Alolowance:");
                da=s.nextInt();
                e2[i].setDa(da);
                System.out.print("Enter Grade Pay:");
                gp=s.nextInt();
                e2[i].setGradepay(gp);
                System.out.print("Enter Personal Pay:");
                pp=s.nextInt();
                e2[i].setPersonalpay(pp);
                System.out.print("Enter Income Tax:");
                it=s.nextInt();
                e2[i].setItax(it);
                System.out.print("Enter Professional Tax:");
                pt=s.nextInt();
                e2[i].setProfesstax(pt);
                System.out.print("Enter Employee Provident Fund:");
                epf=s.nextInt();
                e2[i].setEpf(epf);
                System.out.println("");
                }
                break;
            case 3:
                System.out.println("\nChoice...\n1.Display Permanent Employee details.\n2.Display Contract"
                        + "Employee Details\n3.Exit");
                System.out.print("\nEnter your choice: ");
                int cho=s.nextInt();
                System.out.println("");
                if(cho==1)
                {
                for(int i=0;i<n;i++)
                {
                  System.out.print("\nDetails of Employee "+(i+1)+": ");
                  e1[i].display();
                }
                }
                if(cho==2)
                {
                    for(int i=0;i<n;i++)
                {
                  System.out.print("\nDetails of Employee "+(i+1)+": ");
                  e2[i].display();
                }
                } 
                if(cho==3)
                {
                    break label;
                }
                if(cho<=0 &&cho>3)
                {
                    System.out.println("Wrong Choice!!!!!Try Again......");
                }
                break;
            case 4:
                System.exit(0);
                
        }
        }
    }
    
}
