import java.util.scanner;

public ScannerExample{
    public static void main(string[] args){

        Scanner sc = new Scanner(System.in);

        Sysrem.out.print("Enter a number:");
        int number = sc.nextlnt();

        if(number >= 0){
            System.out.print("The number is Positive.");
        }else{
            system.out.println("The number is Negative.");
        }
        sc.close();
            }
}
