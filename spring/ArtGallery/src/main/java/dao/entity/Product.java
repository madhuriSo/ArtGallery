package dao.entity;

public class Product {
    private int pid;
    private String name;
    private String description;
    private int price;
    private String image;

    public Product(int p,String nm,String description,int price, String image){
        pid=p;
        name=nm;
        this.description=description;
        this.price=price;
        this.image=image;

    }
    public Product(){
        new Product(0,"","",0,"");
    }


    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }

    public int compareTo(Object o) {
        return this.pid-((Product)o).pid;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
