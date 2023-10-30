package org.de.jdbc.mapper;

import java.time.LocalDateTime;

public class Product {

    int id;
    String name;
    LocalDateTime updateAt;
    String contents;
    int price;

    public Product(int id, String name, LocalDateTime updateAt, String contents, int price) {
        this.id = id;
        this.name = name;
        this.updateAt = updateAt;
        this.contents = contents;
        this.price = price;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", updateAt=" + updateAt +
                ", contents='" + contents + '\'' +
                ", price=" + price +
                '}';
    }
}
