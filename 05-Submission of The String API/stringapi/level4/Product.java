package stringapi.level4;

import java.util.*;

class Product {
    String title, sku, category, brand, model;
    String[] specifications;
    String[] features;
    double rating;
    double originalPrice, discount, finalPrice;
    boolean available;

    public Product(String title, String sku, String category, String brand, String model,
                   String[] specifications, String[] features,
                   double rating, double originalPrice, double discount, boolean available) {
        this.title = title;
        this.sku = sku;
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.specifications = specifications;
        this.features = features;
        this.rating = rating;
        this.originalPrice = originalPrice;
        this.discount = discount;
        this.finalPrice = originalPrice - discount;
        this.available = available;
    }
}

class DescriptionBuilder {

    public static String reverseSKU(String sku) {
        return new StringBuilder(sku).reverse().toString();
    }

    public static String buildTitle(Product p) {
        return "<h1>" + p.title + " (SKU: " + p.sku + ")</h1>\n";
    }

    public static String buildBasicInfo(Product p) {
        return "<p>Category: " + p.category + "<br>Brand: " + p.brand + "<br>Model: " + p.model + "</p>\n";
    }

    public static String buildSpecifications(Product p) {
        StringBuilder sb = new StringBuilder("<h2>Specifications:</h2>\n<ul>\n");
        for (String spec : p.specifications) {
            sb.append("<li>").append(spec).append("</li>\n");
        }
        sb.append("</ul>\n");
        return sb.toString();
    }

    public static String buildFeatures(Product p) {
        StringBuilder sb = new StringBuilder("<h2>Features:</h2>\n<ul>\n");
        for (String feature : p.features) {
            // Replace keyword "cheap" with "affordable"
            feature = feature.replaceAll("(?i)cheap", "affordable");
            sb.append("<li>").append(feature).append("</li>\n");
        }
        sb.append("</ul>\n");
        return sb.toString();
    }

    public static String buildRating(Product p) {
        return "<p>Customer Rating: " + p.rating + "/5</p>\n";
    }

    public static String buildPricing(Product p) {
        return "<p>Price: <del>$" + p.originalPrice + "</del> Discount: $" + p.discount + " Final Price: $" + p.finalPrice + "</p>\n";
    }

    public static String buildAvailability(Product p) {
        return "<p>Status: " + (p.available ? "In Stock" : "Out of Stock") + "</p>\n";
    }

    public static String buildPromotionalBanner(String message) {
        return "<p style='color:red; font-weight:bold;'>" + message + "</p>\n";
    }

    public static int calculateReadingTime(String htmlContent) {
        // Strip HTML tags
        String text = htmlContent.replaceAll("<[^>]*>", " ");
        int wordCount = text.trim().split("\\s+").length;
        return Math.max(1, wordCount / 200); // minutes
    }

    public static String generateDescription(Product p, String bannerMessage) {
        StringBuilder sb = new StringBuilder();
        sb.append(buildTitle(p));
        sb.append(buildBasicInfo(p));
        sb.append(buildPromotionalBanner(bannerMessage));
        sb.append(buildSpecifications(p));
        sb.append(buildFeatures(p));
        sb.append(buildRating(p));
        sb.append(buildPricing(p));
        sb.append(buildAvailability(p));
        sb.append("<p>Reversed SKU for verification: " + reverseSKU(p.sku) + "</p>\n");
        return sb.toString();
    }
}

public class ECommerceDescriptionGenerator {

    public static void main(String[] args) {

        Product laptop = new Product(
                "Gaming Laptop", "LAP12345", "Electronics", "TechBrand", "GamerX",
                new String[]{"16GB RAM", "512GB SSD", "RTX 3060 GPU", "Intel i7 CPU", "15.6 inch FHD Display"},
                new String[]{"High performance", "Affordable gaming", "RGB Keyboard", "Long battery life"},
                4.5, 1500, 200, true
        );

        Product jacket = new Product(
                "Winter Jacket", "JCK54321", "Clothing", "FashionCo", "WarmPro",
                new String[]{"Water-resistant", "Hooded", "Polyester 100%", "Multiple pockets", "Machine washable"},
                new String[]{"Lightweight yet warm", "Affordable quality", "Stylish design", "Comfort fit"},
                4.2, 120, 30, true
        );

        Product coffeeMaker = new Product(
                "Coffee Maker", "CFM98765", "Home Appliances", "BrewMaster", "Brew1000",
                new String[]{"12 cup capacity", "Programmable timer", "Auto shut-off", "Stainless steel", "Easy clean"},
                new String[]{"Fast brewing", "Affordable model", "Compact size", "Removable filter"},
                4.8, 80, 15, false
        );

        List<Product> products = Arrays.asList(laptop, jacket, coffeeMaker);
        int counter = 1;

        for (Product p : products) {
            System.out.println("=== Product " + counter + " Description ===");
            String description = DescriptionBuilder.generateDescription(p, "Limited time offer! Grab now!");
            System.out.println(description);
            System.out.println("Total Description Length: " + description.length() + " characters");
            System.out.println("Estimated Reading Time: " + DescriptionBuilder.calculateReadingTime(description) + " minute(s)\n");
            counter++;
        }
    }
}
