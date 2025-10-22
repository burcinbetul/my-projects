import java.util.ArrayList;

public class Singers {
    private ArrayList<String> singers_list = new ArrayList<String>();

    public void print_singers(){
        System.out.println("There are " + singers_list.size() + " Singers on list");

        for (int i = 0; i < singers_list.size(); i++ ){
            System.out.println((i+1) + ".singer: " + singers_list.get(i));

        }

    }
    public void add_singer(String name){
        singers_list.add(name);
        System.out.println("Singer list updated.");
    }
    public void update_singer(String new_name,int position){
        singers_list.set(position,new_name);
        System.out.println("Singer list updated.");
    }
    public void remove_singer(int position){
       String name = singers_list.get(position);
       singers_list.remove(position);
       System.out.println("Singer named " + name + " was removed from the list.");

    }
    public void find_singer(String singer_name) {
        int position = singers_list.indexOf(singer_name);

        if (position >= 0) {
            System.out.println("the singer found.");
            System.out.println("Singer named" + singer_name + (position + 1) + ".position.");
        } else {
            System.out.println("The singer didn't find.");
        }
    }
}



