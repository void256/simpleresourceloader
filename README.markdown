ResourceLoader
==============

Original code was part of Slick2d done by Kevin Glass (http://www.cokeandcode.com)

The ResourceLoader allows reading of resources from different locations. By default it uses a ClasspathLocation and a FileSystemLocation. Other Locations are easily possible by implementing a simple ResourceLocation interface.

The ResourceLoader was used in several projects which made it suitable for a standalone project.

### Example Usage

    ResourceLoader loader = new ResourceLoader();
    InputStream in = loader.getResourceAsStream("test.stuff");