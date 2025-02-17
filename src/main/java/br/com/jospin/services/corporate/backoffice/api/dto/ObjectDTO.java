package br.com.jospin.services.corporate.backoffice.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjectDTO {

    @JsonProperty("uuid")
    public String uuid;
}
