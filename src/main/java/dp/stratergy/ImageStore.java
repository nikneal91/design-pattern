package dp.stratergy;

public class ImageStore {

    private Compressor compressor;
    private Filter filter;

    public ImageStore(Compressor comp, Filter filter) {
        this.compressor =comp;
        this.filter =filter;
    }

    public void store(String image,Filter filter, Compressor compressor) {
        // image compression
        //B&W filter , high contrast filter
        compressor.compress(image);
        filter.apply(image);
    }

    public void store(String image) {
        // image compression
        //B&W filter , high contrast filter
        compressor.compress(image);
        filter.apply(image);
    }
}
