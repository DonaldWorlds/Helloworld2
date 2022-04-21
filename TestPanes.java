import javax.swing.JOptionPane;
/** TestScanner implements an application that
Accepts the information of many employees:
Their Age, income and name.
*/

public class TestPanes
{
   public static void main(String[] args)
   {
      String name, inputString; 
      int age;   
      double income;
      JOptionPane.showMessageDialog(null,"Welcome to the Second Test Scanner class program.");
      name = JOptionPane.showInputDialog("\nWhat is your age? [Negative to Stop] ");
      age = Integer.parseInt(name);
      while(!(age < 0))
      {
       inputString = JOptionPane.showInputDialog("What is your annual income? ");
       income =  Double.parseDouble(inputString);
       inputString =  JOptionPane.showInputDialog("What is your name? ");
       JOptionPane.showMessageDialog(null,"Hello,  " + name + " your age is " + age +
                                           " and yout income is $" + income);
       JOptionPane.showMessageDialog(null,"Welcome to the Second Test Scanner class program.");
       
       name = JOptionPane.showInputDialog("\nWhat is your age? [Negative to Stop] ");
       age = Integer.parseInt(name);
      }
      JOptionPane.showMessageDialog(null,"End of Program!");
      System.exit(0);
   }
}