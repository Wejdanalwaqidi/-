import java.util.Scanner;

public class CounterPeople_Test {

    public static void main(String[] args) {
        int people,p1;
        Scanner in=new Scanner( System.in);
        CounterPeople click=new CounterPeople();
        System.out.println("enter the  number of people:");
        p1=in.nextInt();
        System.out.println("enter 1 to counting or -1 to undo or 0 to resent." );
        System.out.println("if you want to exit enter 2):");
        people=in.nextInt();
        while (people!=2)
        {
            if (people==1) {
                click.click();
                System.out.println("the people is "+click.setLimit(p1));
            }
            if (people==0) {
                click.reset();
                System.out.println("the people is "+click.getValue());     }
            if (people==-1)
            {
                click.undo();
                System.out.println("the people is "+click.getValue());
            }
            people=in.nextInt();
        }
    }
}


