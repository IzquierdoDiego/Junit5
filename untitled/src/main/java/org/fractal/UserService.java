package org.fractal;

import java.util.HashMap;

public class UserService {
    private final HashMap<Long, UserDto> users = new HashMap<>();

    public UserDto createUser(Long id, String name){
        users.put(id, new UserDto(id, name));
        return users.get(id);
    }

    public UserDto getUser(Long id){
        return users.get(id);
    }

    public UserDto updateUser(Long id, String name){
        return users.put(id, new UserDto(id, name));
    }
}
