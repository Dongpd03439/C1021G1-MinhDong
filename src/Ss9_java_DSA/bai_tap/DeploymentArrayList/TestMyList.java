package Ss9_java_DSA.bai_tap.DeploymentArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Đông");
        list.add("Lộc");
        list.add("H.Sơn");
        list.add("Hoàng");

        print(list.getData());
        System.out.println(list.indexOf("Đông"));
        System.out.println(list.indexOf("H.sơn"));
        list.remove(1);
        list.add("very",1);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("Lộc"));
        System.out.println(clone.contains("Hoàng"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}
