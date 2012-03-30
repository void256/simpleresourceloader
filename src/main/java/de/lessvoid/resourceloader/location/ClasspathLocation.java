package de.lessvoid.resourceloader.location;

import java.io.InputStream;
import java.net.URL;

/**
 * A resource location that searches the classpath
 * 
 * @author kevin
 */
public class ClasspathLocation implements ResourceLocation {
  /**
   * @see de.lessvoid.resourceloader.location.ResourceLocation#getResourceAsStream(java.lang.String)
   */
  public InputStream getResourceAsStream(final String ref) {
    String cpRef = ref.replace('\\', '/');
    return ClasspathLocation.class.getClassLoader().getResourceAsStream(cpRef);
  }

  /**
   * @see de.lessvoid.resourceloader.location.ResourceLocation#getResource(java.lang.String)
   */
  public URL getResource(final String ref) {
    String cpRef = ref.replace('\\', '/');
    return ClasspathLocation.class.getClassLoader().getResource(cpRef);
  }
}
