package com.foo.imglib;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Simple class representing an image read from a file.
 */
public class BasicImage {

  private BufferedImage img;

  /**
   * Creates a BasicImage object.
   *
   * @param filename Name of file containing the image
   */
  public BasicImage(String filename) {
    try {
      File inputFile = new File(filename);
      img = ImageIO.read(inputFile);
    }
    catch (IOException error) {
      img = new BufferedImage(64, 64, BufferedImage.TYPE_INT_RGB);
    }
  }

  /**
   * @return The image data
   */
  public BufferedImage getImage() {
    return img;
  }

  /**
   * @return Width of the image
   */
  public int getWidth() {
    return img.getWidth();
  }

  /**
   * @return Height of the image
   */
  public int getHeight() {
    return img.getHeight();
  }
}
