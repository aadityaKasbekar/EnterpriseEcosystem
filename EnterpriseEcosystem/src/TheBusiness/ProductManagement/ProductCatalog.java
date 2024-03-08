/**
 * Represents a catalog of products with a specific type.
 * Manages a list of products and provides methods for creating new products and generating product performance reports.
 */
package TheBusiness.ProductManagement;

import TheBusiness.Business.Business;
import java.util.ArrayList;

/**
 * Represents a catalog of products with a specific type. Manages a list of
 * products and provides methods for creating new products and generating
 * product performance reports.
 *
 * @author Aaditya Kasbekar
 */
public class ProductCatalog {

    /**
     * The type of the product catalog.
     */
    String type;
    Business business;
    /**
     * The list of productCatalog in the catalog.
     */
    ArrayList<Product> productCatalog; //list of productCatalog initially empty

    /**
     * Constructor to create a product catalog with a specified type.
     *
     * @param n The type of the product catalog.
     */
    public ProductCatalog(String n) {
        type = n;
        productCatalog = new ArrayList();  ///create the list of elements otherwise it is null
    }

    /**
     * Default constructor to create a product catalog with an unknown type.
     */
    public ProductCatalog(Business b) {
        type = "unknown";
        productCatalog = new ArrayList();
    }

    /**
     * Creates and adds a new product to the catalog with a name and specified
     * price.
     *
     * @param n The name of the new product.
     * @param price The price of the new product.
     * @return The created Product object.
     */
    public Product addProduct(Product p) {

        productCatalog.add(p);
        return p;
    }

    public void deleteProduct(Product p) {
        this.productCatalog.remove(p);
    }

    /**
     * Gets the list of productCatalog in the catalog.
     *
     * @return The list of productCatalog in the catalog.
     */
    public ArrayList<Product> getProductList() {
        return productCatalog;
    }

    public Product findProduct(String id) {
        for (Product p : productCatalog) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
