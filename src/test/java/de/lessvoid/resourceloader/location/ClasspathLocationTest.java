package de.lessvoid.resourceloader.location;

import java.io.IOException;

import org.junit.Test;

public class ClasspathLocationTest {
  private LocationAssert locationAssert = new LocationAssert();
  private ClasspathLocation location = new ClasspathLocation();

  @Test
  public void testGetResourceAsStream() throws IOException {
    locationAssert.assertInputStream(location.getResourceAsStream("test.txt"), "huhu");
  }

  @Test
  public void testGetResource() {
    locationAssert.assertURL(location.getResource("test.txt"), "test.txt");
  }
}
