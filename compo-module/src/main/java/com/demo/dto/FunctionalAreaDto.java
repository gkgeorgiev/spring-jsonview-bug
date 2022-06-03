
package com.demo.dto;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIdentityReference(alwaysAsId = true)
public class FunctionalAreaDto {
  @JsonView(Views.Basic.class)
  private Long id;

  @JsonView(Views.FunctionalArea.class)
  private List<ComponentDto> components;


}
