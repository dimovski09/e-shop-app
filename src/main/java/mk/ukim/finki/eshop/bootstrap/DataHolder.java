package mk.ukim.finki.eshop.bootstrap;
import mk.ukim.finki.eshop.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts = new ArrayList<>();

//    @PostConstruct
//    public void init(){
//        categories.add(new Category("Sport", "Sport Category"));
//        categories.add(new Category("Music", "Music Category"));
//
//        users.add(new User("filip.dimovski", "fd", "Filip", "Dimovski"));
//
//
//        Manufacturer manufacturer = new Manufacturer("Nike", "NY NY");
//        manufacturers.add(manufacturer);
//
//        Category category = new Category("Sport", "Sport category");
//        categories.add(category);
//        products.add(new Product("Ball 1", 235.8, 7, category, manufacturer ));
//        products.add(new Product("Ball 2", 235.8, 7, category, manufacturer ));
//        products.add(new Product("Ball 3", 235.8, 7, category, manufacturer ));
//
//    }
}
