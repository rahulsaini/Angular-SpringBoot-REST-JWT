package com.app.model.order;

import io.swagger.annotations.*;
import lombok.*;
import java.util.*;
import com.app.model.response.*;

@EqualsAndHashCode(callSuper=false)
public class OrderDetailResponse extends PageResponse {
  @ApiModelProperty(required = true, value = "")
  //private List<OrderExtended> items;
  private List<OrderDetail> items;

    public List<OrderDetail> getItems() {
        return items;
    }

    public void setItems(List<OrderDetail> items) {
        this.items = items;
    }
}
