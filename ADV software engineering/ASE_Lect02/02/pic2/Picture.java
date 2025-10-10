import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a picture (interface-based version).
 *
 * @author Nick Efford
 * @version 1.4 (2016-04-19)
 */
public class Picture {

  private List<Drawable> items;

  /**
   * Creates an empty picture.
   */
  public Picture() {
    items = new ArrayList<>();
  }

  /**
   * Creates a picture containing some drawable items.
   */
  public Picture(List<Drawable> items) {
    this.items = items;
  }

  /**
   * Adds a drawable item to this picture.
   *
   * @param item Drawable item to be added
   */
  public void add(Drawable item) {
    items.add(item);
  }

  /**
   * Draws this picture in the specified graphics context.
   *
   * @param context Graphics context used for drawing
   */
  public void draw(Graphics2D context) {
    for (Drawable item: items) {
      item.draw(context);
    }
  }
}
