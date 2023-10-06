package movie_exp3;
import java.util.Scanner;

class Movie
{
    private String movie_name;
    private String threatre_name;
    private int no_tickets;
    private int t_cost;

    public Movie(String movie_name, String threatre_name, int no_tickets, int t_cost) {
        this.movie_name = movie_name;
        this.threatre_name = threatre_name;
        this.no_tickets = no_tickets;
        this.t_cost = t_cost;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getThreatre_name() {
        return threatre_name;
    }

    public void setThreatre_name(String threatre_name) {
        this.threatre_name = threatre_name;
    }

    public int getNo_tickets() {
        return no_tickets;
    }

    public void setNo_tickets(int no_tickets) {
        this.no_tickets = no_tickets;
    }

    public int getT_cost() {
        return t_cost;
    }

    public void setT_cost(int t_cost) {
        this.t_cost = t_cost;
    }
}
public class Movie_exp3 
{
public static void main(String[] args) 
{
            System.out.println("How many Threatre are there in your Locality..?");
            System.out.println("Your Answer");
            int n;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            //Declaring array of objects
            //of size n
            Movie m[]=new Movie[n];
            for(int i=0;i<n;i++)
            {
                //object declared
                m[i]=new Movie("Empty","empty",0,0); 
            }
            boolean b;
            b=true;
            outer: while(b)
            {
                System.out.println("\t\t::Menu::");
                System.out.println("1. Add Movie Details");
                System.out.println("2. Search Movie details for given Movie name");
                System.out.println("3. Book ticket and display the ticket details");
                System.out.println("4. Search Movie name for given Theatre ");
                System.out.println("5. Exit");
                System.out.print("Your Choice: ");
                int ch;
                ch=s.nextInt();
                switch(ch)
                {
                    case 1: System.out.println("Add details for "+ n+ " Movies");
                            for(int i=0;i<n;i++)
                            {
                                System.out.println("Enter Movie name");
                                String mn;
                                mn=s.next();
                                m[i].setMovie_name(mn);
                                System.out.println("Enter the Theatre name");
                                String tn;
                                tn=s.next();
                                m[i].setThreatre_name(tn);
                                System.out.println("Enter no. of tickets");
                                int t;
                                t=s.nextInt();
                                m[i].setNo_tickets(t);
                                System.out.println("Enter ticket cost");
                                int tc;
                                tc=s.nextInt();
                                m[i].setT_cost(tc);
                                
                            }
                            System.out.println("Successfully Added");
                            break;
                    case 2: System.out.println("Enter Movie name for Movie details");
                            String mn1;
                            mn1=s.next();
                            for(int i=0;i<n;i++)
                            {
                                if(mn1.equals(m[i].getMovie_name()))
                                {
                                    System.out.println("Details of Movie "+ m[i].getMovie_name()+" are");
                                    System.out.println("No. of Available tickets:"+ m[i].getNo_tickets());
                                    System.out.println("Ticket cost Rs:"+ m[i].getT_cost());
                                    continue outer;
                                }
                                System.out.println("Seaching");
                            }
                            System.out.println("Not found");
                            break;
                    case 3: System.out.println("The list of Movie available");
                            for(int i=0;i<n;i++)
                            {
                                System.out.print("Movie "+(i+1));
                                System.out.println(" "+m[i].getMovie_name());
                            }
                            System.out.println("Enter Movie name to buy tickets");
                            String ss;
                            ss=s.next();
                            int c=-1;
                            for(int i=0;i<n;i++)
                            {
                                if(ss.equals(m[i].getMovie_name()))
                                {
                                    c=i;
                                }
                            }
                            if(c>=0);
                            {
                                System.out.println("Movie Details");
                                System.out.println("Tickets avialable:"+m[c].getNo_tickets());
                                System.out.println("Ticket Price Rs:"+m[c].getT_cost());
                                System.out.println("How many Tickets you want..?");
                                int w;
                                w=s.nextInt();
                                if(m[c].getNo_tickets()>=w)
                                {
                                    System.out.println("*********************************************************");
                                    System.out.println("Generating tickets....");
                                    System.out.println("Booking Done ,Thanks for your time");
                                    int ww;
                                    ww=m[c].getNo_tickets()-w;
                                    m[c].setNo_tickets(ww);
                                    int ll=9384;
                                    System.out.println("Booking ID is: "+ll);
                                    System.out.println("Movie name: "+m[c].getMovie_name());
                                    int p;
                                    p=m[c].getT_cost()*w;
                                    System.out.println("Total Cost Rs:"+ p);
                                    System.out.println("Enjoy Your Movie ...");
                                    System.out.println("***************************************************");
                                    
                                }
                            }
                            if(c==-1)
                            {
                                System.out.println("Movie not found");
                            }
                            break;
                    case 4: System.out.println("Enter Theatre name to search for Movie");
                            String sss;
                            sss=s.next();
                            int j=-1;
                            for(int i=0;i<n;i++)
                            {
                                if(sss.equals(m[i].getThreatre_name()))
                                {
                                    System.out.println("Theatre found");
                                    j=i;
                                }
                            }
                            if(j==-1)
                            {
                                System.out.println("Theatre not found;");
                            }
                            if(j>=0)
                            {
                                System.out.println("Movie available in "+m[j].getThreatre_name()+" is");
                                System.out.println("Movie Name:"+m[j].getMovie_name());
                                System.out.println("Movie Cost:"+m[j].getT_cost());
                                System.out.println("Movie Availability:"+m[j].getNo_tickets());
                                System.out.println("**************************************************");
                            }
                            break;
                    case 5:
                           System.out.println("Bye Bye");
                           b=false;
                }
            }
            
    }
}
 

