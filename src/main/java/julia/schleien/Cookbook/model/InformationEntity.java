package julia.schleien.Cookbook.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Julia Schleien
 * @version 1.0
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "INFORMATION")
public class InformationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CUSTOMER")
    private Long id;

    @Column(name = "NAME")
    @NotBlank(message = "Name must not be null or empty")
    private String name;

    @Column(name = "PHONE")
    @NotNull(message = "Phone must not be null")
    private int phone;

    @Column(name = "EMAIL")
    @NotBlank(message = "Email must not be null or empty")
    private String email;

    @Column(name = "NAMERECIPE")
    @NotBlank(message = "Name Recipe must not be null or empty")
    private String nameRecipe;

    @Column(name = "INGREDIENTS", length = 1000000)
    @NotBlank(message = "Ingredients must not be null or empty")
    private String ingredients;

    @Column(name = "RECIPE", length = 1000000)
    @NotBlank(message = "Recipe must not be null or empty")
    private String recipe;

    @Column(name = "TIME")
    @NotBlank(message = "Time must not be null or empty")
    private String time;

    @Column(name = "QUANTITY")
    @NotBlank(message = "Quantity must not be null or empty")
    private String quantity;
}