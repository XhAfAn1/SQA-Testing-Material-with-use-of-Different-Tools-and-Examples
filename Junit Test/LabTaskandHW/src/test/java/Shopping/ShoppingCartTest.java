package Shopping;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    private final ShoppingCart cart = new ShoppingCart();

    @Test
    void testAddItems() {
        cart.addItem("A");
        cart.addItem("B");
        cart.addItem("C");
        assertEquals(3, cart.getItemCount());
    }

    @Test
    void testRemoveItem() {
        cart.addItem("X");
        cart.addItem("Y");
        cart.removeItem("Y");
        assertEquals(1, cart.getItemCount());
    }

    @Test
    void testClearCart() {
        cart.addItem("A");
        cart.addItem("B");
        cart.clear();
        assertEquals(0, cart.getItemCount());
    }

    @Test
    void testRemoveNonExistentItem() {
        assertDoesNotThrow(() -> cart.removeItem("Z"));
    }
}
