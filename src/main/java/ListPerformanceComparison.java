import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceComparison {

    public static void addTest(int numOperations, List<Integer> arrayList){
        for (int i = 0; i < numOperations; i++)
            arrayList.add(i);
    }

    public static void getTest(int numOperations, List<Integer> arrayList){
        for (int i = 0; i < numOperations; i++)
            arrayList.get(i);
    }

    public static void sortTest(List<Integer> arrayList){
        arrayList.sort((x, y)->x > y ? 1 : -1);
    }

    public static void findTest(int searchedNum, List<Integer> arrayList){
        arrayList.contains(searchedNum);
    }

    public static void deleteTest(List<Integer> arrayList){
            arrayList.clear();
    }

    public static void main(String[] args) {
        int numOperations = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Добавление : ");

        System.out.println(ArrayList.class);
        System.out.println(TimeDecorator.getTime(()->addTest(1000, arrayList)));

        System.out.println(LinkedList.class);
        System.out.println(TimeDecorator.getTime(()->addTest(1000, linkedList)));

        System.out.println("-------------------------");

        System.out.println("Доступ : ");

        System.out.println(ArrayList.class);
        System.out.println(TimeDecorator.getTime(()->getTest(1000, arrayList)));

        System.out.println(LinkedList.class);
        System.out.println(TimeDecorator.getTime(()->getTest(1000, linkedList)));

        System.out.println("-------------------------");

        System.out.println("Сортировка : ");

        System.out.println(ArrayList.class);
        System.out.println(TimeDecorator.getTime(()->sortTest(arrayList)));

        System.out.println(LinkedList.class);
        System.out.println(TimeDecorator.getTime(()->sortTest(linkedList)));

        System.out.println("-------------------------");

        System.out.println("Поиск : ");

        System.out.println(ArrayList.class);
        System.out.println(TimeDecorator.getTime(()->findTest(500, arrayList)));

        System.out.println(LinkedList.class);
        System.out.println(TimeDecorator.getTime(()->findTest(500, linkedList)));

        System.out.println("-------------------------");

        System.out.println("Удаление : ");

        System.out.println(ArrayList.class);
        System.out.println(TimeDecorator.getTime(()->deleteTest(arrayList)));

        System.out.println(LinkedList.class);
        System.out.println(TimeDecorator.getTime(()->deleteTest(linkedList)));
    }
}