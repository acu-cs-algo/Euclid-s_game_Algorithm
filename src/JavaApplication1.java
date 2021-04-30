import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class JavaApplication1 {
 	static int Gcd (int m ,int n) {
		while(n==0){
                    return m;
                }
                  if ( m >n)
                {
			return Gcd(m-n,n);			
                }
                  else
			return Gcd(n-m,m);
	}
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n1;
         System.out.println("Enter The First Number: ");
         n1 = input.nextInt();
         int n2;
         System.out.println("Enter The First Number: ");
         n2 = input.nextInt();
         int n3=Gcd(n1,n2);
                      System.out.println("GCD = "+ n3); 
               
         
         if((n1/n3)%2==0){
             System.out.println("Playar Two will Win."); 
     }
         else{
            System.out.println("Playar one will Win.");  
         }
         }
    /**
     * @param args the command line arguments
     */
}
