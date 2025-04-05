public class Pedido {
    String producto;
    int cantidad;
    Pedido siguiente;
    Pedido anterior;

    //Se crea automaticamente con el click derecho, después acción de código fuente y por último generar constructores
    public Pedido(String producto, int cantidad, Pedido siguiente, Pedido anterior) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    

}
