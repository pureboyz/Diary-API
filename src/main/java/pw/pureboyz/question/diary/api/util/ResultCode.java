package pw.pureboyz.question.diary.api.util;

import lombok.Getter;

@Getter
public enum ResultCode
{
	 OK(00, "OK")
	
	// SQL
	,SELECT_NO_DATA(611, "SELECT_NO_DATA")
	,INSERT_FAIL(621, "INSERT_FAIL")
	,UPDATE_FAIL(631, "UPDATE_FAIL")
	,DELETE_FAIL(641, "DELETE_FAIL")
	
	// ETC.
	,ETC(99, "ETC.")
	;

	ResultCode(int code, String message)
	{
		this.code 		= code;
		this.message 	= message;
	}
	
    private int 	code;
    private String 	message;
	
}
