package pw.pureboyz.question.diary.api.mapper;

import org.apache.ibatis.annotations.Mapper;

import pw.pureboyz.question.diary.api.dto.UserDTO;

@Mapper
public interface UserMapper
{

	int create(UserDTO userDTO);

}
