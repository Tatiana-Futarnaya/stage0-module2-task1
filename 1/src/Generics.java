import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public  List<List<String>> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
       List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> Object genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public void  cloneMethod(List<? super Object> consumer, List<? extends Object> producer) {
        System.out.println("consumer");
        consumer.addAll(producer);

    }


}
