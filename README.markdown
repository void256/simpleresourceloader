ResourceLoader
==============

Original code was part of Slick2d done by Kevin Glass (http://www.cokeandcode.com)

The [ResourceLoader](blob/master/src/main/java/de/lessvoid/resourceloader/ResourceLoader.java) allows reading of resources from different locations. By default it uses a [ClasspathLocation](blob/master/src/main/java/de/lessvoid/resourceloader/location/ClasspathLocation.java) and a [FileSystemLocation](blob/master/src/main/java/de/lessvoid/resourceloader/location/FileSystemLocation.java). It will first check the ClasspathLocation and if the resource could not be found it will check the FileSystemLocation next.

Other Locations are easily possible by implementing the simple [ResourceLocation](blob/master/src/main/java/de/lessvoid/resourceloader/location/ResourceLocation.java) interface. The order of the locations can be changed easily as well.

The ResourceLoader was used in several projects which made it suitable for a standalone project.

### Example Usage

    ResourceLoader loader = new ResourceLoader();
    InputStream in = loader.getResourceAsStream("test.stuff");
