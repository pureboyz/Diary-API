package pw.pureboyz.question.diary.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pw.pureboyz.question.diary.api.dto.UserDTO;
import pw.pureboyz.question.diary.api.mapper.UserMapper;
import pw.pureboyz.question.diary.api.util.ResultCode;
import pw.pureboyz.question.diary.api.util.ResultMap;

@Service
public class UserService
{
	@Autowired UserMapper userMapper;

	public ResultMap create(UserDTO userDTO)
	{
		ResultMap resultMap = new ResultMap();
		
		int result = userMapper.create(userDTO);
		if(0 < result)
		{
			resultMap.setCode(ResultCode.OK.getCode());
			resultMap.setMessage(ResultCode.OK.getMessage());
			resultMap.setData(userDTO);
		}
		else
		{
			resultMap.setCode(ResultCode.INSERT_FAIL.getCode());
			resultMap.setMessage(ResultCode.INSERT_FAIL.getMessage());
		}
		
		return resultMap;
	}

}
