package pw.pureboyz.question.diary.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pw.pureboyz.question.diary.api.dto.UserDTO;
import pw.pureboyz.question.diary.api.service.UserService;
import pw.pureboyz.question.diary.api.util.ResultMap;

@RestController
@RequestMapping("/user")
public class UserController
{
	@Autowired UserService userService;
	
	@PostMapping("/create")
	public ResultMap create(UserDTO userDTO)
	{
		return userService.create(userDTO);
	}
	
	@PostMapping("/selectUser")
	public ResultMap selectUser(UserDTO userDTO)
	{
		return userService.selectUser(userDTO);
	}
	
	@PostMapping("/update")
	public ResultMap update(UserDTO userDTO)
	{
		return userService.update(userDTO);
	}
}
