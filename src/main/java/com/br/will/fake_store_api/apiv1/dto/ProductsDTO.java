package com.br.will.fake_store_api.apiv1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductsDTO {

    @JsonProperty(value = "id")
    private Long id;
    @JsonProperty(value = "title")
    private String nome;
    @JsonProperty(value = "price")
    private BigDecimal preco;
    @JsonProperty(value = "category")
    private String categoria;
    @JsonProperty(value = "description")
    private String descricao;
    @JsonProperty(value = "image")
    private String imagem;

}
