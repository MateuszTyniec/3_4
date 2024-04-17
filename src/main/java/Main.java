public class Main 
{
    public static void main(String[] args) 
  {
        int wielkosc = 5; 
        for (int i = 0; i < wielkosc; i++)
          {
            System.out.print("*");
        }
        System.out.println();

        
        for (int i = 0; i < wielkosc - 2; i++)
          {
            System.out.print("*");
            for (int j = 0; j < wielkosc - 2; j++) 
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        
        for (int i = 0; i < wielkosc; i++) 
        {
            System.out.print("*");
        }
        System.out.println();
    }
}