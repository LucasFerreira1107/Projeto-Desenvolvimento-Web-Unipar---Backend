package com.cadastroproduto.demo.mapper;

import com.cadastroproduto.demo.dto.CreateProductDTO;
import com.cadastroproduto.demo.entity.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-07T18:32:44-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class CreateProductMapperImpl implements CreateProductMapper {

    @Override
    public CreateProductDTO toDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        Long id = null;
        String nome = null;
        String descricao = null;
        Double preco = null;

        id = product.getId();
        nome = product.getNome();
        descricao = product.getDescricao();
        preco = product.getPreco();

        CreateProductDTO createProductDTO = new CreateProductDTO( id, nome, descricao, preco );

        return createProductDTO;
    }

    @Override
    public Product toEntity(CreateProductDTO product) {
        if ( product == null ) {
            return null;
        }

        Product product1 = new Product();

        product1.setId( product.id() );
        product1.setNome( product.nome() );
        product1.setDescricao( product.descricao() );
        product1.setPreco( product.preco() );

        return product1;
    }
}
