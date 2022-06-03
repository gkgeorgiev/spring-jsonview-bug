
package com.demo;

import com.demo.AppURLs;
import com.demo.dto.ComponentDto;
import com.demo.dto.FunctionalAreaDto;
import com.demo.dto.Views;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = AppURLs.API_FUNCTIONAL_AREAS)
@JsonView({Views.FunctionalArea.class})
public class FunctionalAreaController {

  
    @GetMapping
//    @JsonView({Views.FunctionalArea.class})
    public List<FunctionalAreaDto> getAllFunctionalAreas() {
        FunctionalAreaDto fa = FunctionalAreaDto.builder().id(1l).build();
        ComponentDto compo = ComponentDto.builder().id(1l).functionalAreas(Arrays.asList(fa)).build();
        fa.setComponents(Arrays.asList(compo));
        return List.of(fa);
    }

}
