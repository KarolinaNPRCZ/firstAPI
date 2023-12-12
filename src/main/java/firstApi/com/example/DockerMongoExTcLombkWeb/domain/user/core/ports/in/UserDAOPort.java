package firstApi.com.example.DockerMongoExTcLombkWeb.domain.user.core.ports.in;

import firstApi.com.example.DockerMongoExTcLombkWeb.domain.user.core.model.User;
import firstApi.com.example.DockerMongoExTcLombkWeb.domain.user.core.model.UserDTO;
import firstApi.com.example.DockerMongoExTcLombkWeb.domain.user.core.model.UserId;

import java.util.List;

public interface UserDAOPort {
    UserDTO getUserByEmail(String email);
    UserId save(UserDTO userDTO);
    //
}
