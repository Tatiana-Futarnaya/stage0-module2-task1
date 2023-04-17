import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Runner  {
    public static void main(String[] args) {
        Map<String, Set<String>> projects= Map.of("AXE", Set.of("Helen", "Bob", "Marian", "Tom"),
                "MazPay", Set.of("James", "John", "Robert"),
                "SeaV", Set.of("John", "Robert", "Angelina", "David"),
                "DelFo", Set.of("Patricia", "Jessica", "Mark", "Paul"),
                "ReaNon", Set.of("George", "Kyle", "Robert", "Brandon", "Austin"));
                String developer="Robert";
        List<String> list=new ArrayList<>();
        for (Map.Entry<String,Set<String>> item: projects.entrySet()) {
            for (String value: item.getValue()) {
                if(developer.equals(value)){
                    list.add(item.getKey());
                }
            }
        }
        Comparator c=Collections.reverseOrder();
        Collections.sort(list,c);
        String tmp=null;
        for (int i=1; i<list.size();i++){
            if(list.get(i-1).length()<list.get(i).length()){
                tmp=list.get(i-1);
                list.set(i-1,list.get(i));
                list.set(i,tmp);
            }
        }

        System.out.println(list);;

    }}

class ListComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}



