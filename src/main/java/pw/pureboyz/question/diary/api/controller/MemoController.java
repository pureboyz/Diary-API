package pw.pureboyz.question.diary.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pw.pureboyz.question.diary.api.dto.MemoDTO;
import pw.pureboyz.question.diary.api.service.MemoService;
import pw.pureboyz.question.diary.api.util.ResultMap;

@RestController
@RequestMapping("/memo")
public class MemoController 
{
	@Autowired MemoService memoService;
	
	@PostMapping("/Create")
	public ResultMap create(MemoDTO memoDTO)
	{
		return memoService.create(memoDTO);
	}

	@PostMapping("/SelectList")
	public ResultMap SelectMemoList(MemoDTO memoDTO)
	{
		return memoService.SelectMemoList(memoDTO);
	}
	
	@PostMapping("/Select")
	public ResultMap SelectMemo(MemoDTO memoDTO)
	{
		return memoService.SelectMemo(memoDTO);
	}
	
	@PostMapping("/Update")
	public ResultMap UpdateMemo(MemoDTO memoDTO)
	{
		return memoService.UpdateMemo(memoDTO);
	}
	
	@PostMapping("/Delete")
	public ResultMap DeleteMemo(MemoDTO memoDTO)
	{
		return memoService.DeleteMemo(memoDTO);
	}

}