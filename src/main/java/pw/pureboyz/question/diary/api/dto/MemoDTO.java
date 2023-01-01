package pw.pureboyz.question.diary.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemoDTO
{
	int 	seq;
	String 	contents;
	String 	createDate;
	String 	updateDate;
	String 	deleteDate;
	
	// page
	int 	begin;
}
