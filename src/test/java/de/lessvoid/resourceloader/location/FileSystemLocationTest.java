package de.lessvoid.resourceloader.location;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileSystemLocationTest {
  private LocationAssert locationAssert = new LocationAssert();
  private FileSystemLocation location = new FileSystemLocation(new File("src/test/resources"));

  @Test
  public void testGetResourceAsStream() throws IOException {
    locationAssert.assertInputStream(location.getResourceAsStream("test.txt"), "huhu");
  }

  @Test
  public void testGetResource() {
    locationAssert.assertURL(location.getResource("test.txt"), "test.txt");
  }
}
