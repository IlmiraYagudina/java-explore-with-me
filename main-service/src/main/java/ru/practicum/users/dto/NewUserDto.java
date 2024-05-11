package ru.practicum.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewUserDto {
    @Positive
    private Long id;

    @NotBlank
    @Length(min = 2, max = 250)
    private String name;

    @NotNull
    @NotBlank
    @Email
    @Length(min = 6, max = 254)
    private String email;
}
