
package com.vivelibre.vivlibre.api.mybatis.mapper;

import com.vivelibre.vivlibre.api.Dto.UserDto;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.*;
/**
 *
 * @author Vazgen Smbatyan
 */
@Repository
@Mapper
public interface DataMapper {
    
    @Insert("INSERT INTO \"user\" (\"user\", password, token, creation_date) " +
            "VALUES (#{username}, #{password}, #{token}, now())")
    void insertToken(UserDto user);
    
    @Select("SELECT creation_date, token FROM token ORDER BY id desc")
    UserDto getToken();
        
    
}
