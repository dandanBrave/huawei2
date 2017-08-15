import java.util.*;

/**
 * Created by Administrator on 2017/8/15.
 */
public class UseOfLinkedList {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        LinkedList<String> lList = new LinkedList<String>();
//        lList.add("1");
//        lList.add("2");
//        lList.add("3");
//        lList.add("4");
//        lList.add("5");
//        System.out.println("链表的第一个元素是：" +lList.getFirst());
//        System.out.println("链表的最后一个元素是："+lList.getLast());
//        for(String str:lList){
//            System.out.println(str);
//        }
//        List sub1 = lList.subList(1,4);
//        System.out.println(sub1);
//        lList.remove(2);
//        System.out.println(lList);


//        Queue queue = new Queue();
//        for (int i = 0; i < 10; i++) {
//            queue.put(Integer.toString(i));
//        }
//
//        while (!queue.isEmpty()){
//            System.out.println(queue.get());
//        }

//
        List<String> theList = new LinkedList<String>();
        theList.add("A");
        theList.add("B");
        theList.add("C");
        theList.add("D");
        String [] my = theList.toArray(new String[0]);
        for (int i = 0; i < my.length ; i++) {
            System.out.println(my[i]);
        }

//        System.out.println(linkedList.remove("2"));
//        System.out.println(linkedList);
//        linkedList.subList(2,5).clear();
//        System.out.println(linkedList);
//        Object object = linkedList.removeFirst();
//        System.out.println(object + " has been removed");
//        System.out.println(linkedList);
//        object = linkedList.removeLast();
//        System.out.println(object + " has been removed");
//        System.out.println(linkedList);
        //linkedList.clear();
//        ArrayList<String> arrayList = new ArrayList<>(linkedList);
//        for(String s:arrayList){
//            System.out.println("s = " + s);
//        }

    }
//    public static class StackL{
//        private LinkedList list = new LinkedList();
//        public void push(Object v){
//            list.addFirst(v);
//        }
//        public Object top(){
//            return list.getFirst();
//        }
//        public Object pop(){
//            return list.removeFirst();
//        }
//    }

//
//    public static class Queue{
//        private LinkedList list = new LinkedList();
//        public void put(Object v){
//            list.addLast(v);
//        }
//        public Object get(){
//            return list.removeFirst();
//        }
//        public boolean isEmpty(){
//            return list.isEmpty();
//        }
//    }
}
