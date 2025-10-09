import java.awt.Graphics2D;

/**
 * Interface specifying the 'drawable' capability.
 *
 * Classes that implement this interface have a draw method, allowing
 * them to be rendered using the given Java graphics context.
 *
 * @author Nick Efford
 */
public interface Drawable {
  void draw(Graphics2D context);
}
