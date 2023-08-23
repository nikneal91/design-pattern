package dp.abstractDocument;

import dp.abstractDocument.domain.Part;

import java.util.stream.Stream;

public interface HasParts extends Document {

    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
}
