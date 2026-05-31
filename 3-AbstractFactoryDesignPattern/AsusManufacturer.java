public class AsusManufacturer extends Company{

    @Override
    AsusGpu createGpu() {

        AsusGpu asus = new AsusGpu();
        asus.assemble();
        return asus;
    }

    @Override
    AsusMonitor createMonitor() {

        AsusMonitor asus = new AsusMonitor();
        asus.assemble();
        return asus;
    }

}
