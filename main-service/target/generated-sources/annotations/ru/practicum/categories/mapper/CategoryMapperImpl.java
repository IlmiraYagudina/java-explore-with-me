package ru.practicum.categories.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.practicum.categories.dto.CategoryDto;
import ru.practicum.categories.dto.NewCategoryDto;
import ru.practicum.categories.entity.Category;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-07T23:43:57+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.21 (Amazon.com Inc.)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDto categoryToCategoryDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto.CategoryDtoBuilder<?, ?> categoryDto = CategoryDto.builder();

        categoryDto.name( category.getName() );
        categoryDto.id( category.getId() );

        return categoryDto.build();
    }

    @Override
    public Category newCategoryDtoToCategory(NewCategoryDto newCategoryDto) {
        if ( newCategoryDto == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( newCategoryDto.getName() );

        return category;
    }

    @Override
    public Category categoryDtoToCategory(CategoryDto categoryDto) {
        if ( categoryDto == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryDto.getId() );
        category.setName( categoryDto.getName() );

        return category;
    }
}
