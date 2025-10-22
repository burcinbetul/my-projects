//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to Sabiha Gökçen Airport...");
        String conditions = "Foreign visit rules\n"
                           +"There must not be any political ban\n"
                           +"Pay the full 100 TL fee\n"
                     +"You must have a visa for the country you are going to";
        String message = "You must meet all the conditions";

        while(true){
            System.out.println(message);
            System.out.println(conditions);
            Traveller traveller = new Traveller();
            System.out.println("Controlling the fee...");
            Thread.sleep(3000);

            if(traveller.internationalFeeControl() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Controlling the political ban");
            Thread.sleep(3000);

            if(traveller.politcalBan() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Controlling the visa status");
            Thread.sleep(3000);

            if(traveller.visaStatus() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("The procedures are complete, you can go abroad.");
            break;







        }


    }
}