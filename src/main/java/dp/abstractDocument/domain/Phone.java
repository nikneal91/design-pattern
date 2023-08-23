package dp.abstractDocument.domain;

import dp.abstractDocument.*;

import java.util.Map;

/**
 * Car entity.
 */
public class Phone extends AbstractDocument implements HasNetwork,HasParts {

  public Phone(Map<String, Object> properties) {
    super(properties);
  }

}