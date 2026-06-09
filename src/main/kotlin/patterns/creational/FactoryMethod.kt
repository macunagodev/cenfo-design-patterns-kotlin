package patterns.creational

abstract class TallerPendiente {
    fun prepararPedido(): String {
        val producto = crearProducto()
        return "Pedido preparado para ${producto.descripcion()}"
    }

    // Método fábrica: las subclases deben proveer el producto concreto.
    protected abstract fun crearProducto(): Product
}

// Producto concreto
class ProductoLocal(private val nombre: String) : Product {
    override fun descripcion(): String = nombre
}

// Creador concreto
class TallerLocal : TallerPendiente() {
    override fun crearProducto(): Product {
        // Aquí se encapsula la creación del producto concreto.
        return ProductoLocal("Producto local listo")
    }
}

class FactoryMethodDemo {
    fun ejecutar(): String {
        val taller: TallerPendiente = TallerLocal()
        return taller.prepararPedido()
    }
}
