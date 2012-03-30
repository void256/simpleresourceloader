package de.lessvoid.resourceloader.location;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class LocationAssert {

  public void assertInputStream(final InputStream in, final String expected) throws IOException {
    byte[] buffer = new byte[4];

    assertEquals(4, in.read(buffer));
    assertEquals("huhu", new String(buffer, "ISO-8859-1"));
  }

  public void assertURL(final URL url, final String expected) {
    // kinda silly but we can't really test much more since the url will change
    // where we compile it but it should always end with "test.txt"¯
    assertTrue(url.toExternalForm().endsWith(expected));
  }
}
