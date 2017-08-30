package main;

public class Users {
    private String name;
    private String tel;
    private double price;

    public Users(){

    }

    public Users(String name, String tel, double price) {
        this.name = name;
        this.tel = tel;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", price=" + price +
                '}';
    }
}