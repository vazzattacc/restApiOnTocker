package com.vivelibre.vivlibre.api.Service;

import com.vivelibre.vivlibre.api.Dto.UserDto;
import com.vivelibre.vivlibre.api.mybatis.mapper.DataMapper;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PRINCIPAL
 */
@Service
public class TokenService {
    
    @Autowired
    JwtGenerator jwtGenerator;
    
    @Autowired
    private DataMapper dataMapper;
    
    
    public String createToken(UserDto user){
        
        if (StringUtils.isNotBlank(user.getUsername()) && StringUtils.isNotBlank(user.getPassword())){
            user.setToken(jwtGenerator.generarTokenJWT(user.getUsername(), user.getPassword()));
            dataMapper.insertToken(user);
            return user.getToken();
        }else{
           return "ERROR";
        }
    }
    
    
    
}
