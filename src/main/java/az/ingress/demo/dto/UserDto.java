package az.ingress.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    Integer id;

    String name;

    String surname;

    Integer age;

    String phone;

    String email;

    Double balance;
}
