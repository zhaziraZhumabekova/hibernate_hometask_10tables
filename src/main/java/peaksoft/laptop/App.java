package peaksoft.laptop;

import java.util.List;

public class App {
    public static void main(String[] args) {
        LaptopService laptopService = new LaptopService();
//        Laptop laptop = new Laptop("ACER", "GOOD");
//        laptopService.create(laptop);
//        System.out.println(laptopService.getById(1));
        List<Laptop> laptops = laptopService.getAll();
        for (Laptop lp : laptops) {
            System.out.println(lp);
        }

    }
}

