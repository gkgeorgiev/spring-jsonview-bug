

package com.demo.dto;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComponentDto {

  @JsonView(Views.Basic.class)
  private Long id;


  @JsonView(Views.Component.class)
  private List<FunctionalAreaDto> functionalAreas;

}
