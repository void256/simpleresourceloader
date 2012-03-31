ResourceLoader
==============

Original code was part of Slick2d done by Kevin Glass (http://www.cokeandcode.com)

The [ResourceLoader](src/main/java/de/lessvoid/resourceloader/ResourceLoader.java) allows reading of resources from different locations. By default it uses a [ClasspathLocation](src/main/java/de/lessvoid/resourceloader/location/ClasspathLocation.java) and a [FileSystemLocation](src/main/java/de/lessvoid/resourceloader/location/FileSystemLocation.java). Other Locations are easily possible by implementing the simple [ResourceLocation](src/main/java/de/lessvoid/resourceloader/location/ResourceLocation.java) interface.

The ResourceLoader was used in several projects which made it suitable for a standalone project.

### Example Usage

    ResourceLoader loader = new ResourceLoader();
    InputStream in = loader.getResourceAsStream("test.stuff");
