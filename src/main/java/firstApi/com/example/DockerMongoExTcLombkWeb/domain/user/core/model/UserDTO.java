package firstApi.com.example.DockerMongoExTcLombkWeb.domain.user.core.model;
import lombok.Builder;
@Builder(toBuilder = true)
public record UserDTO(String email, String password){}

//long id,



