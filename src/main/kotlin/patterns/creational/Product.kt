package patterns.creational

/**
 * Interfaz genérica para productos en patrones creacionales.
 * Define una operación que describe el resultado del producto.
 */
interface Product {
    /** Devuelve una descripción legible del producto. */
    fun descripcion(): String
}
