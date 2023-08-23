package dp.abstractDocument;


import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import dp.abstractDocument.domain.*;

@Slf4j
public class App {

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    log.info("App is started!");

    var wheelProperties = Map.of(
        Property.TYPE.toString(), "wheel",
        Property.MODEL.toString(), "15C",
        Property.PRICE.toString(), 100L);

    var doorProperties = Map.of(
        Property.TYPE.toString(), "door",
        Property.MODEL.toString(), "Lambo",
        Property.PRICE.toString(), 300L);

    var carProperties = Map.of(
        Property.MODEL.toString(), "300SL",
        Property.PRICE.toString(), 10000L,
        Property.PARTS.toString(), List.of(wheelProperties, doorProperties));

    var car = new Car(carProperties);

    var phoneType =
            Map.of(
            Property.TYPE.toString(), "GSM",
            Property.MODEL.toString(), "1.1",
            Property.PRICE.toString(), 233);


    var launchType =
            Map.of(
                    Property.TYPE.toString(), "Display",
                    Property.MODEL.toString(), "1.1",
                    Property.PRICE.toString(), 233);

    var phoneProperties = Map.of(
      PhoneProperties.NETWORK.toString(), ("NETWORK"),
            Property.PARTS.toString(), List.of(phoneType, launchType));


    var phone = new Phone(phoneProperties);

    log.info("Here is our car:");
    log.info("-> model: {}", car.getModel().orElseThrow());
    log.info("-> price: {}", car.getPrice().orElseThrow());
    log.info("-> parts: ");
    car.getParts().forEach(p -> log.info("\t{}/{}/{}",
        p.getType().orElse(null),
        p.getModel().orElse(null),
        p.getPrice().orElse(null))
    );

    log.info("Here is our phone");
    log.info(phone.getTechnology().orElseThrow());
    phone.getParts().forEach(p -> log.info("\t{}/{}/{}",
            p.getType().orElse(null),
            p.getModel().orElse(null),
            p.getPrice().orElse(null))
    );
  }
}