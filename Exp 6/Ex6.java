import java.util.*;
interface Library
{
    void ReturnBook();
    void BorrowBook();
    void Display();
}
class Student implements Library
{
    String regno;
    String name;
    String department;
    int np_books=200;
    private Scanner s;
    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNp_books() {
        return np_books;
    }

    public void setNp_books(int np_books) {
        this.np_books = np_books;
    }
   int no1;
   @Override
   public void BorrowBook()
   {
       s=new Scanner(System.in);
       System.out.print("\nEnter the number of books you want to borrow: ");
       no1=s.nextInt();
       if(no1<np_books)
       {
           System.out.print("Book issued successfully..........");
           np_books-=no1;
           Random r=new Random();
           int mon=r.nextInt(12);
           int day=r.nextInt(30);
           int yr=2018;
           System.out.print("\nDue date: "+day+" "+mon+" "+yr);
       }
       else
       {
           System.out.println("Books not available!!!");
       }
   }
   @Override
   public void ReturnBook()
   {
       if(no1>0){
       s=new Scanner(System.in);
       int no;
       System.out.print("\nEnter the number of books you want to return: ");
       no=s.nextInt();
       np_books+=no;   
       System.out.print("\n"+no+" Books returned successfully....");
   }
   else
           System.out.println("No Books borrowed!!!!");
   }
   @Override
   public void Display()
   {
       s=new Scanner(System.in);
       System.out.println("Name: "+name);
       System.out.println("Register Number: "+regno);
       System.out.println("Department: "+department);
       System.out.println("No of books available: "+np_books);
       System.out.println("No of books borrowed: "+no1);
   }
}
class Faculty implements Library
{
    String empno;
    String name;
    String department;
    int np_books=150;
    Scanner s;
    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNp_books() {
        return np_books;
    }

    public void setNp_books(int np_books) {
        this.np_books = np_books;
    }
   
    @Override
   public void ReturnBook()
   {
       int no;
       s=new Scanner(System.in);
       System.out.print("\nEnter the number of books you want to return: ");
       no=s.nextInt();
       np_books+=no;  
       System.out.print("\n"+no+" Books returned successfully....");
   }
   int no1;
   @Override
   public void BorrowBook()
   {
       s=new Scanner(System.in);
       System.out.print("\nEnter the number of books you want to borrow: ");
       no1=s.nextInt();
       if(no1<np_books)
       {
           System.out.print("\nBook issued................. ");
           np_books-=no1;
           Random r=new Random();
           int mon=r.nextInt(12);
           int day=r.nextInt(30);
           int yr=2018;
           System.out.println("\nDue date: "+day+" "+mon+" "+yr);
       }
       else
       {
           System.out.println("Books not available!!!");
       }
   }
   @Override
   public void Display()
   {
       System.out.println("Name: "+name);
       System.out.println("Employee Number: "+empno);
       System.out.println("Department: "+department);
       System.out.println("No of books available: "+np_books);
       System.out.println("No of books borrowed: "+no1);
   }
}
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
       boolean b,b2;
       b=true;
       b2=true;
       Faculty f[]= new  Faculty[3];
       for(int i=0;i<3;i++)
       {
           f[i]= new Faculty();
       }
       Student st[]= new  Student[3];
       for(int i=0;i<3;i++)
       {
           st[i]= new Student();
       }
       OUTER:while(b){
        System.out.println("CHOICES TO DO.......");
        System.out.println("1.Library for Students\n2.Library for faculty\n3.Exit");
        System.out.print("\nEnter the choice: ");
        int ch;
        ch=s.nextInt();
        switch(ch){
            case 1:
                String name,department;
                String regno;
                System.out.print("\nAdd details for 3 students");
                for(int i=0;i<3;i++){
                System.out.println("\n\nEnter detail for student "+(i+1)+": ");
                System.out.print("\nEnter Name of the student: ");
                name=s.next();
                System.out.print("\nEnter Register Number: ");
                regno=s.next();
                System.out.print("\nDepartment: ");
                department=s.next();
                st[i].setDepartment(department);
                st[i].setName(name);
                st[i].setRegno(regno);}
                int cnt=0;
                for(int i=0;i<3;i++){
                while(b2)
                {
                String id;
                System.out.print("\nEnter the student id to perform operation: ");
                id=s.next();
                for(int j=0;j<3;j++)
                {
                if(id.equals(st[j].regno))
                {
                    cnt++;
                
                System.out.println("\nPress...\n1.Borrow Book\n2.Return Book\n3.Display\n4.Exit");
                System.out.print("\nEnter the choice: ");
                int ch1;
                ch1=s.nextInt();
                switch(ch1){
                    case 1:
                        st[j].BorrowBook();
                        break;
                    case 2:
                        st[j].ReturnBook();
                        break ;
                    case 3:
                        st[j].Display();
                        break;
                    case 4:
                        b2=false;
                        continue OUTER;}
                }}}}
                if(cnt==0){
                        System.out.println("Register number not found....Please try again...");
                break;}
     
                case 2:
                    System.out.println("Add details for 3 faculties");
                for(int i=0;i<3;i++){
                    System.out.println("\n\nEnter detail for faculty "+(i+1)+": ");
                String name1,department1;
                String empno;
                System.out.print("\nEnter Name of the Faculty: ");
                name1=s.next();
                System.out.print("\nEnter Employee Number: ");
                empno=s.next();
                System.out.print("\nDepartment: ");
                department1=s.next();
                f[i].setDepartment(department1);
                f[i].setName(name1);
                f[i].setEmpno(empno);}
                int cnt1=0;
                while(b2)
                {
                    String id;
                System.out.print("\nEnter the Faculty id to perform operation: ");
                id=s.next();
                for(int j=0;j<3;j++)
                {
                if(id.equals(f[j].empno))
                {
                    cnt1++;
                    System.out.println("\nPress...\n1.Borrow Book\n2.Return Book\n3.Display\n4.Exit");
                System.out.print("\nEnter the choice: ");
                int ch1;
                ch1=s.nextInt();
                switch(ch1){
                    case 1:
                        f[j].BorrowBook();
                        break;
                    case 2:
                        f[j].ReturnBook();
                        break ;
                    case 3:
                        f[j].Display();
                        break;
                    case 4:
                        b2=false;
                }}}}
                if(cnt1==0){
                        System.out.println("Register number not found....Please try again...");
                break;}
            case 3:
                b=false;
    
    }
    }
    }
    }

    

