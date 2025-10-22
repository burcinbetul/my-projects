import java.util.Scanner;

public class Traveller implements AbroadRules {
    private int fee;
    private boolean politicalBan;
    private boolean visaStatus;

    public Traveller(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The fee you paid: ");
        this.fee = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Have you any political ban? (yes or no)");
        String result = scanner.nextLine();

        if(result == "yes"){
            this.politicalBan = true;
        }
        else{
            this.politicalBan = false;
        }

        System.out.println("Have you visa for the country? (yes or no)");
        String result2 = scanner.nextLine();
        if(result2.equals("yes")){
            this.visaStatus = true;
        }
        else{
            this.visaStatus = false;
        }



    }


    @Override
    public boolean internationalFeeControl() {
        if(this.fee < 100){ //Is the fee paid less than $100?
            System.out.println("Please pay the correct international fee.");
            return false;
        }
        else{
            System.out.println("International fee is correct.");
            return true;
        }
    }

    @Override
    public boolean politcalBan() {
        if(this.politicalBan == true){
            System.out.println("You hava a political ban so, you can not go to abroad.");
            return false;
        }
        else{
            System.out.println("You haven't political ban.");
            return true;
        }

    }

    @Override
    public boolean visaStatus() {
        if (this.visaStatus == true){
            System.out.println("Visa status is okey.");
            return true;
        }
        else{
            System.out.println("You haven't visa for the country...");
            return false;
        }

    }
}
