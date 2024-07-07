package az.ingress.demo.mapper;


import az.ingress.demo.dto.UserDto;
import az.ingress.demo.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface UserMapper {

    @Mapping(target = "surname", source = "lastname")
    UserDto entityToDto(User user);
}
