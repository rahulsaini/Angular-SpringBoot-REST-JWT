package com.app.model.product;

import io.swagger.annotations.*;
import lombok.*;
import java.util.*;
import com.app.model.response.*;

@EqualsAndHashCode(callSuper=false)
public class ProductResponse extends PageResponse {
  @ApiModelProperty(required = true, value = "")
  private List<Product> items;

    public void setItems(List<Product> items) {
        this.items = items;
    }
}
