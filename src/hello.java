import java.util.Scanner;

// Scan multiple variables

public class hello{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

//        ***Assigning String without makng any array

        String str="Dhruv";
      for(int i=str.length()-1; i>=0;i--){  //Print Reverse
            System.out.println(str.charAt(i));
        }
//        System.out.println(str.charAt(0));


//        ***Assigning and printing variables

//        System.out.println("Enter integer :");
//        int a= sc.nextInt();
//
//        System.out.println("Enter double :");
//        double b= sc.nextDouble();
//
//        System.out.println("Enter single word");
//        String c= sc.next();
//
//           sc.nextLine(); // Remove Buffering.
//
//        System.out.println("Enter full Line");
//        String d =sc.nextLine();


//
//        System.out.println("Integer: "+a);
//        System.out.println("Double :"+b);
//        System.out.println("Word:"+c);
//        System.out.println("Line:"+d);


//        **Typecasting

//        short z=130;
//       byte x=(byte)z;   // forcefully assign short into byte
//        System.out.println(x);
//
//           int arr[]={1,2,3,4,5};
//           for(int i=0;i<arr.length;i++){
//               System.out.println(arr[i]);
//           }
//        System.out.println(arr[0]);
    }

}