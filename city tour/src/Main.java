import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {

    public static void print_operation(){

        System.out.println("0-View operation.");
        System.out.println("1-Go to ex city.");
        System.out.println("2-Go to next city.");
        System.out.println("3-Exit the app.");
    }

    public static void visit_cities(LinkedList<String> cities){
        ListIterator<String> iterator = cities.listIterator();

        int operation;

        print_operation();
        Scanner scanner = new Scanner(System.in);
        if(!iterator.hasNext()){
            System.out.println("There isn't any city.");

        }
        boolean exit = false;
        boolean forward = true;


        while (!exit){
            System.out.println("Enter a operation: ");

            operation = scanner.nextInt();

            switch (operation){
                case 0:
                    print_operation();
                    break;
                case 1:
                    if (forward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        forward = false;

                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Going to the city: "+iterator.previous());
                    }
                    else{
                        System.out.println("Start the city tour...");
                    }
                    break;

                case 2:
                    if(!forward){
                        if(iterator.hasNext()){
                            iterator.next();

                        }
                        forward = true;
                    }

                    if(iterator.hasNext()){
                        System.out.println("Go to the city: "+iterator.next());
                    }
                    else{
                        System.out.println("There isn't any destination city.");
                    }
                    forward = true;

                    break;
                case 3:
                    exit = true;
                    System.out.println("Exit the app.");
                    break;



            }
        }

    }

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();

        cities.add("Ankara");
        cities.add("Eskişehir");
        cities.add("Afyon");

        visit_cities(cities);

    }
}