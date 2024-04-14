import main.java.com.RestauranteMexicano.modelos.Producto;

public interface Productomapper {

    public List<Producto> consultarProductos();

    public Producto consultarProducto(int id);

    public void insertarProducto(Item it);

}
