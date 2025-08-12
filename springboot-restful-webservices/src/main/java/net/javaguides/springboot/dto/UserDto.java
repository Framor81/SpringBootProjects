package net.javaguides.springboot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    
    // User first name should not be null or empty
    @NotEmpty(message = "User first name should not be Null or Empty.")
    private String firstName;
    
    // User last name should not be null or empty
    @NotEmpty(message = "User last name should not be Null or Empty.")
    private String lastName;
    
    // User email should not be null or empty 
    // email should be valid
    @NotEmpty(message = "User email should not be Null or Empty.")
    @Email(message = "User email should be valid.")
    private String email;


}
