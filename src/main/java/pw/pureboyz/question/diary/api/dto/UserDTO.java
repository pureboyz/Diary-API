package pw.pureboyz.question.diary.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO
{
	int 	seqUser;
	String 	id;
	String 	name;
	String 	givenName;
	String 	familyName;
	String 	email;
	String 	photoUrl;
	String 	createDate;
	String 	updateDate;
	String 	deleteDate;
}