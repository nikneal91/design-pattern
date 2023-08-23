package dp.stratergy;

public class Main {
    public static void main(String[] args) {
        Compressor comp = new JpegCompressor();
        Filter filter = new BlackWhiteFilter();
        Filter highfilter = new HighContrastFilter();
        ImageStore store = new ImageStore(comp,filter);
        store.store("image",highfilter,comp);
    }
}
