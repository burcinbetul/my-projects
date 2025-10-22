import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);

    public static void print_operations() {
        System.out.println("\t 0- view operations");
        System.out.println("\t 1- view singers");
        System.out.println("\t 2- add singer");
        System.out.println("\t 3- update singer");
        System.out.println("\t 4- remove singer");
        System.out.println("\t 5- find singer");
        System.out.println("\t 6- exit the application.");

    }
    public static void view_singers(){
        singers.print_singers();
    }
    public static void add_singer(){
        System.out.println("The name of the singer you want to add: ");
        String name =scanner.nextLine();
        singers.add_singer(name);
    }
    public static void update_singer(){
        System.out.println("The position you want to update: ");
        int position = scanner.nextInt();
        scanner.nextLine();

        String new_name = scanner.nextLine();

        singers.update_singer(new_name,position-1);
    }
    public static void remove(){
        System.out.println("The position you want to remove: ");
        int position = scanner.nextInt();
        singers.remove_singer(position-1);
    }
    public static void find(){
       System.out.println("The singer you want to find: ");
       String name = scanner.nextLine();
       singers.find_singer(name);
    }


    public static void main(String[] args) {
        System.out.println("\t Welcome the singers app...");
        print_operations();

        boolean exit = false;

        int operation;

        while(!exit){
            System.out.println("Chose a operation: ");
            operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation){
                case 0:
                    print_operations();
                    break;
                case 1:
                    view_singers();
                    break;
                case 2:
                    add_singer();
                    break;
                case 3:
                    update_singer();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    find();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exit from application.");
                    break;









            }
        }






    }
}