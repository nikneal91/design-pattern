package dp.abstractDocument;

import java.util.Optional;

public interface HasNetwork extends Document {

    default Optional<String> getTechnology() {
        return Optional.ofNullable((String) get(PhoneProperties.NETWORK.toString()));
    }
}
