package Ss11_java__java_collection_framework.bai_tap.Product_Management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Product implements Interface,  Comparable<Product>{

    private String name;
    private int price;

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    ArrayList<Product> arr= new ArrayList<>();

    @Override
    public void add() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập tên sp");
        name=scanner.nextLine();
        System.out.println("mời nhập giá sp");
        price=scanner.nextInt();
        Product product = new Product(name,price);
        arr.add(product);
        for( Product product1 : arr){
            System.out.println(product1);
        }

    }

    @Override
    public void edit() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập vào id sản phẩm cần xóa");
        int id=Integer.parseInt(scanner.nextLine());
        boolean flag=true;
        for(int i=0;i<arr.size();i++){
            if(id==i){
                System.out.println("mời sửa tên sp");
                name=scanner.nextLine();
                System.out.println("mời sửa giá sp");
                price=scanner.nextInt();
                arr.get(i).setName(name);
                arr.get(i).setPrice(price);
                for(Product product: arr){
                    System.out.println(product);
                }
                flag=true;
                break;



            }
        }
        if(flag=false){
            System.out.println(" id sp không có trong hệ thống ");
        }

    }

    @Override
    public void delete() {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" mời nhập id sản phẩm cần xóa");
        int id=Integer.parseInt(scanner.nextLine());
        boolean flag=true;
        for(int i=0; i<arr.size();i++){
            if(id==i){
                arr.remove(i);
                for( Product product: arr){
                    System.out.println(product);
                }
                flag=true;
                break;

            }
        }
        if( flag=false){
            System.out.println(" id sản phẩm nhập vào không tồn tại ");
        }


    }

    @Override
    public void search() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập id sản phẩm cần xem ");
        int id=scanner.nextInt();
        for(int i=0; i<arr.size();i++){
            if(id==i){
                System.out.println(arr.get(i));
            }
        }

    }

    @Override
    public void Sort() {
        Collections.sort(arr);
        for(Product st : arr){
            System.out.println(st.toString());
        }
    }


    @Override
    public int compareTo(Product o) {
        return price-o.price;
    }

}
