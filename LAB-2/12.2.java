package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Beer {
    private String name;
    private int price;
}
public class Main {
    public static void main(String[] args) {
        Beer beer1 = new Beer();
        beer1.setName("Tyskie Gronie");
        beer1.setPrice(5);
        Beer beer2 = new Beer("Amber Pszeniczniak", 7);
        System.out.println(beer1.getName() + " costs " + beer1.getPrice() + " PLN");
        System.out.println(beer2.getName() + " costs " + beer2.getPrice() + " PLN");
    }
}