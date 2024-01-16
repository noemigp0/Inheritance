import accounts.*;
import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;

public class Main {
    public static void main(String[] args) {
         /*Account account = new Account(100, 0.025);
       account.status();
        account.withdraw(45.86);
        account.status();
        account.withdraw(62.96);
        account.status();
        account.deposit(32.50);
        account.status()*/

       /* CheckingAccounts account = new CheckingAccounts(20, 31.5, 700);
        account.purchase(18.63);
        if(account.purchase(18.63)){
            System.out.println("Purchase successful");

        } else {
            System.out.println("Purchase failed");
        }
        System.out.println(account.getRewardPoints());*/

        /*CheckingAccounts ca = new CheckingAccounts(100, 0.037, 500);
        Savings sa = new Savings(100, 0.45);

        ca.status();
        sa.status();

        ca.withdraw(10);
        sa.withdraw(10);

        ca.status();
        sa.status();*/

       /* SilverCheckingAccount silver = new SilverCheckingAccount(5000, 0.025, 1000);
        GoldChekingAccount gold = new GoldChekingAccount(5000, 0.025, 1000);
        DiamonCheckingAccount diamond = new DiamonCheckingAccount(5000, 0.025, 1000);



        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());

        silver.purchase(50);
        gold.purchase(50);
        diamond.purchase(50);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());*/

        //Account account1 = new CheckingAccounts(500, 0.025, 1000);
        //CheckingAccounts account2 = new GoldChekingAccount(1000, 0.032, 2500);

        displayShape(new Square());



    }

    static void displayShape(Shape shape){
       System.out.println(shape.getName());
       shape.draw();
       System.out.println("Sides: " + shape.getSideCount() );


       if(shape instanceof  Square){
            Square square = (Square) shape;
            System.out.println(square.getShapeType());
       }



    }
}