import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts{
    public static void main(String[] args){
        Product door = new Product("Wooden Door",35);
        Product floorPanel = new Product("Floor Panel",20);
        Product window = new Product("Glass Window",10);

        Collection<Product> products = new ArrayList<Product>(); //创建一个list
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        final Iterator<Product> productIterator = products.iterator();

        while(productIterator.hasNext()){
            Product product = productIterator.next();
            System.out.println(product);
        }

        for(Product product: products){
            System.out.println(product);
        }



    }
}
