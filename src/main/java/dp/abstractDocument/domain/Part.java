package dp.abstractDocument.domain;

import dp.abstractDocument.AbstractDocument;
import dp.abstractDocument.HasModel;
import dp.abstractDocument.HasPrice;
import dp.abstractDocument.HasType;

import java.util.Map;

/**
 * Part entity.
 */
public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {

  public Part(Map<String, Object> properties) {
    super(properties);
  }

}