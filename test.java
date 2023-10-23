/**
 *
 * @author user
 */
public class Test {
    public static void main (String[] args)
    {
     int myVariable1 = 100;
     int myVariable2 = 200;
   
   System.out.println ("Value Test");
   
   displayIt(myVariable1,myVariable2);
   displayItTimesTwo(myVariable1,myVariable2);
   displayItPlusOneHundred (myVariable1,myVariable2);
    }
   
    
    public static void displayIt (int myVariable1, int myVariable2)
    {
        System.out.println ("The values given are: " + myVariable1 + " and " + myVariable2); 
    }
    
    public static void displayItTimesTwo (int myVariable1, int myVariable2)
    {
      int timestwo = myVariable1*2, timestwo2 = myVariable2*2;
      System.out.print ("\nValues Multiplied by two");
      System.out.print ("\nValues given are: " + myVariable1 + " and " + myVariable2); 
      System.out.println ("\nAnd the values given multiplied by two becomes: " + timestwo + " and " + timestwo2);
    }
    public static void displayItPlusOneHundred(int myVariable1, int myVariable2)
    {
     int plushundred = myVariable1 + 100, plushundred2 = myVariable2 +100;
     System.out.print ("\nOne Hundred added to display values");
     System.out.print ("\nValues given are: " + myVariable1 + " and " + myVariable2);
     System.out.print ("\nAnd the values added by 100 becomes: " + plushundred + " and " + plushundred2);
    }
    
}

