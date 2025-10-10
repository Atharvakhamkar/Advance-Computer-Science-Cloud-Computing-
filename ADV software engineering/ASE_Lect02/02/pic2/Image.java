import java.awt.Graphics2D;
import java.awt.image.BufferedImageOp;
import java.awt.image.RescaleOp;
import com.foo.imglib.BasicImage;

/**
 * Simple representation of an image.
 *
 * @author Nick Efford
 */
public class Image extends BasicImage implements Drawable {

  private int x, y;

  /**
   * Creates an Image object.
   *
   * @param x Upper-left corner's x coordinate
   * @param y Upper-left corner's y coordinate
   * @param filename Name of file containing the image
   */
  public Image(int x, int y, String filename) {
    super(filename);
    this.x = x;
    this.y = y;
  }

  /**
   * @return Upper-left corner's x coordinate
   */
  public int getX() {
    return x;
  }

  /**
   * @return Upper-left corner's y coordinate
   */
  public int getY() {
    return y;
  }

  /**
   * Draws this image using the given graphics context.
   *
   * @param context Graphics context for drawing
   */
  public void draw(Graphics2D context) {
    BufferedImageOp nullOp = new RescaleOp(1.0f, 0.0f, null);
    context.drawImage(getImage(), nullOp, x, y);
  }
}
