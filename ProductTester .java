import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductTester
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String tempName;
        int tempQty;
        double tempPrice;
        int maxSize = 10;
        boolean active = true;
        int play = 0;

       /* a while active loop for continue playing if active is true the program keeps running until you want to stop*/
        while (active)
        {
            /*a block of code for errors it checks if maxSize is anything than a positive number*/
            do
            {
                try
                {
                    if (maxSize > 0)
                    {
                        System.out.println("\nEnter the number of products you would like to add\n" + "Enter 0 (zero) if you do not wish to add products:");
                        maxSize = in.nextInt();
                        System.out.println("");
                    } else
                    {
                        if (maxSize != -1)
                        {
                            System.out.println("Incorrect Value entered\n");
                        }
                        System.out.println("\nEnter the number of products you would like to add\n" + "Enter 0 (zero) if you do not wish to add products:");
                        maxSize = in.nextInt();
                        System.out.println("");
                    }
                } catch (Exception e)
                {
                    in.nextLine();
                    System.out.println("\nIncorrect Data type entered \n");
                    maxSize = -1;
                }
            } while (maxSize < 0);

//           /*gives arraylist a value of how many values u want to store*/
            ArrayList<Product> producten = new ArrayList<Product>(maxSize);

            /*if maxSize is equal to 0 the program stops running
            * else it takes my maxSize value input and iterates trough the array list and assigns new values on place */
            if (maxSize == 0)
            {
                System.out.println("No products required!");
                break;
            } else
            {
                for (int i = 0; i < maxSize; i++)
                {
                    System.out.println("Fill Productname in");
                    tempName = in.next();
                    System.out.println("");
                    System.out.println("Fill Product price in");
                    tempPrice = in.nextDouble();
                    System.out.println("");
                    System.out.println("Fill Product quantity in");
                    tempQty = in.nextInt();
                    System.out.println("");
                    in.nextLine();
                    producten.add(new Product(tempName, tempPrice, tempQty));
                }
            }
            /*prints out the data of each product*/
            for (int i = 0; i < producten.size(); i++)
            {
                System.out.println(producten.get(i));
            }

            /*piece of code for if u want to add more products or if u want the program to stop
            * it also handles error input for anything other than a value of 1 or 2*/
            do
            {
                try
                {   System.out.println("Would you like to add more products?: \n1: Yes \n2: No");
                    play = in.nextInt();
                    if (play == 1)
                    {
                        active = true;
                        in.nextLine();
                    } else if (play == 2)
                    {
                        active = false;
                        System.out.println("\nNo more products required!");
                    }
                    else if(play <= 0){
                        System.out.println("\nIncorrect choice \n");
                    }
                } catch (Exception e)
                {
                    in.nextLine();
                    System.out.println("\nIncorrect data input \n");
                    play = 0;
                }

            } while (play <= 0);
        }


    }
}