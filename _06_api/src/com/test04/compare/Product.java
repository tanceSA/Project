package com.test04.compare;

/**
 * ClassName: Product
 * Package: com.test04.compare
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/7 下午 04:42
 * @Version 1.0
 */
public class Product implements Comparable {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /*
     * 當前的類別需要實現Comparable中的抽象方法 compareTo(Object o)
     * 在此方法中，指名如何判斷當前類的物件的大小 比如按照價格排序
     * */
    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }

        if(o instanceof Product p){
            int value =  Double.compare(this.price,p.price);
            if(value!=0){
                return -value;
            }else {
                return this.name.compareTo(p.name);
            }
        }
        throw new RuntimeException("類型不匹配");

    }
}
