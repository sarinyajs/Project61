package controllers;

import models.Cosmetices;
import models.Makeup;
import play.*;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    public static Result main_page(Html content) {return ok(main_page.render(content)); }
    public static Result profile() {return main_page(profile.render());    }
    public static Result index() {return main_page(home_page.render()); }
    public static Result order() {return main_page(order.render()); }
    public static Result promotion() {return main_page(promotion.render()); }
    public static Result location_page() {return main_page(location_page.render()); }
    public static Result products() {return main_page(products.render()); }
    public static Result test() {
        return main_page(test.render());
    }
    public static Result sale1() {
        return main_page(sale1.render());
    }
    public static Result sale2() {
        return main_page(sale2.render());
    }
    public static Result home_page() {
        return main_page(home_page.render());
    }
    public static Result inputMakeup() {
        return main_page(input.render());
    }
    public static Cosmetices cosmetices;
    public Form<Cosmetices>cosmeticesForm=Form.form(Cosmetices.class);



    public static Result PostMakeup() {
        DynamicForm myForm = Form.form().bindFromRequest();
        //Makeup Makeup = new Makeup();
        String id, name, brand, category, amount;
        double price;
        if (myForm.hasErrors()) {
            return main_page(input.render());
        } else {
            id = myForm.get("id");
            name = myForm.get("name");
            brand = myForm.get("brand");
            category = myForm.get("category");
            amount = myForm.get("amount");
            price = Double.parseDouble(myForm.get("price"));
            Makeup Makeup = new Makeup(id, name, brand, category, amount, price);
            return main_page(post.render(Makeup));
        }
    }

    public static Result shop() {
        Makeup p1 = new Makeup("1001", "Lipstick", "Maybelline","LIPS", "100", 199.00);
        Makeup p2 = new Makeup("2001", "Mascara", "Cathy Doll","EYES", "100", 89.00);
        Makeup p3 = new Makeup("3001", "Eyeliner", "Wet n Wild","EYES", "100", 182.00);
        Makeup p4 = new Makeup("4001", "Eyeshadow", "Cosluxe","EYES", "100", 249.00);
        Makeup p5 = new Makeup("5001", "Powder", "Revlon","FACE", "100", 359.00);
        Makeup p6 = new Makeup("6001", "Concealer", "Collection","FACE", "100", 279.00);
        Makeup pp = new Makeup("7007", "papang", "collagen","cabsul" ,"100", 200.00);
        return main_page(shop.render(p1, p2, p3, p4, p5, p6, pp));
    }


}
