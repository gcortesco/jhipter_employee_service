package como.riu.hr.web.rest.converters;

import como.riu.hr.domain.User;
import como.riu.hr.service.dto.UserDTO;

import org.mapstruct.Mapper;



@Mapper
public interface UserConverter {
    User convertCourseRequest(UserDTO userRequest);
}
