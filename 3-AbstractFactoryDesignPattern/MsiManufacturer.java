public class MsiManufacturer extends Company {


    @Override
    MsiGpu createGpu() {

        MsiGpu msi = new MsiGpu();
        msi.assemble();
        return msi;
    }

    @Override
    MsiMonitor createMonitor() {

        MsiMonitor monitor = new MsiMonitor();
        monitor.assemble();
        return monitor;
    }
}
