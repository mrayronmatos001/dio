package br.com.dio.mapper;

import br.com.dio.dto.UserDTO;
import br.com.dio.model.UserModel;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-16T15:27:34-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserModel toModel(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setCode( dto.getId() );
        userModel.setUserName( dto.getName() );

        return userModel;
    }

    @Override
    public UserDTO toDTO(UserModel model) {
        if ( model == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( model.getCode() );
        userDTO.setName( model.getUserName() );

        return userDTO;
    }
}
