package com.app.model.customer;

import io.swagger.annotations.*;
import lombok.*;
import java.util.*;
import com.app.model.response.*;

@EqualsAndHashCode(callSuper=false)
public class CustomerResponse extends PageResponse {
  @ApiModelProperty(required = true, value = "")
  private List<Customer> items;

    public void setItems(List<Customer> items) {
        this.items = items;
    }
}
