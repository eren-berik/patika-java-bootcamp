public class Main {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<>();
        System.out.println("Capacity of the list: " + list.getCapacity());
        System.out.println("Number of elements in the list: " + list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Capacity of the list: " + list.getCapacity());
        System.out.println("Number of elements in the list: " + list.size());

        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Capacity of the list: " + list.getCapacity());
        System.out.println("Number of elements in the list: " + list.size());

        System.out.println("2. indisteki değer : " + list.get(2));
        System.out.println("List: " + list);

        System.out.println("Is list empty? -> " + list.isEmpty());

        list.clear();
        System.out.println(list);
        System.out.println("Is list empty after clear? -> " + list.isEmpty());

        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);
        System.out.println("Capacity of the list: " + list.getCapacity());
        System.out.println("Number of elements in the list: " + list.size());
        System.out.println("Is 100 in the list?: " + list.contains(100));
        System.out.println("Is 60 in the list?: " + list.contains(60));

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(2);
        System.out.println(list);
        System.out.println("Capacity of the list: " + list.getCapacity());
        System.out.println("Number of elements in the list: " + list.size());

        list.set(0,10);
        System.out.println(list);
        System.out.println("Index of 30: " + list.indexOf(30));
        list.add(10);
        System.out.println(list);
        System.out.println("Known last index of 10: " + list.lastIndexOf(10));
        System.out.println("Capacity of the list: " + list.getCapacity());
        System.out.println("Number of elements in the list: " + list.size());

        list.remove(2);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.remove(17);
        System.out.println(list);
        System.out.println(list.indexOf(20));
        System.out.println(list.indexOf(100));

        list.clear();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("Is 10 in the list?: " + list.contains(10));
        System.out.println("Is 20 in the list?: " + list.contains(20));
        System.out.println("Capacity of the list: " + list.getCapacity());
        System.out.println("Number of elements in the list: " + list.size());
        System.out.println(list);

        CustomList<Integer> sublist = list.sublist(1,13);
        System.out.println(sublist);
        System.out.println("Capacity of the sublist: " + sublist.getCapacity());
        System.out.println("Number of elements in the sublist: " + sublist.size());
        System.out.println("Capacity of the list: " + list.getCapacity());
        System.out.println("Number of elements in the list: " + list.size());
        System.out.println("Is 100 in the list?: " + sublist.contains(100));
        System.out.println("Is 60 in the list?: " + sublist.contains(30));
    }
}