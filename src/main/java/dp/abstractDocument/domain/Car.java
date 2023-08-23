package dp.abstractDocument.domain;

import dp.abstractDocument.*;
import java.util.Map;

/**
 * Car entity.
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {

  public Car(Map<String, Object> properties) {
    super(properties);
  }

}