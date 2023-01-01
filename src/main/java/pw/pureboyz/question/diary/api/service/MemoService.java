package pw.pureboyz.question.diary.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pw.pureboyz.question.diary.api.dto.MemoDTO;
import pw.pureboyz.question.diary.api.mapper.MemoMapper;
import pw.pureboyz.question.diary.api.util.ResultCode;
import pw.pureboyz.question.diary.api.util.ResultMap;

@Service
public class MemoService
{
	@Autowired MemoMapper memoMapper;

	public ResultMap create(MemoDTO memoDTO)
	{
		ResultMap resultMap = new ResultMap();
		
		int result = memoMapper.create(memoDTO);
		if(0 < result)
		{
			resultMap.setCode(ResultCode.OK.getCode());
			resultMap.setMessage(ResultCode.OK.getMessage());
			resultMap.setData(memoDTO);
		}
		else
		{
			resultMap.setCode(ResultCode.INSERT_FAIL.getCode());
			resultMap.setMessage(ResultCode.INSERT_FAIL.getMessage());
		}
		
		return resultMap;
	}

	public ResultMap SelectMemoList(MemoDTO memoDTO)
	{
		ResultMap resultMap = new ResultMap();
		
		List<MemoDTO> memoList = memoMapper.SelectMemoList(memoDTO);
		if(0 < memoList.size())
		{
			resultMap.setCode(ResultCode.OK.getCode());
			resultMap.setMessage(ResultCode.OK.getMessage());
			resultMap.setData(memoList);
		}
		else
		{
			resultMap.setCode(ResultCode.SELECT_NO_DATA.getCode());
			resultMap.setMessage(ResultCode.SELECT_NO_DATA.getMessage());
			
		}
		
		return resultMap;
	}

	public ResultMap SelectMemo(MemoDTO memoDTO)
	{
		ResultMap resultMap = new ResultMap();
		
		MemoDTO memoInfo = memoMapper.SelectMemo(memoDTO);
		if(memoInfo != null)
		{
			resultMap.setCode(ResultCode.OK.getCode());
			resultMap.setMessage(ResultCode.OK.getMessage());
			resultMap.setData(memoInfo);
		}
		else
		{
			resultMap.setCode(ResultCode.SELECT_NO_DATA.getCode());
			resultMap.setMessage(ResultCode.SELECT_NO_DATA.getMessage());
			
		}
		
		return resultMap;
	}

	public ResultMap UpdateMemo(MemoDTO memoDTO)
	{
		ResultMap resultMap = new ResultMap();
		
		int result = memoMapper.UpdateMemo(memoDTO);
		if(0 < result)
		{
			resultMap.setCode(ResultCode.OK.getCode());
			resultMap.setMessage(ResultCode.OK.getMessage());
			resultMap.setData(memoDTO);
		}
		else
		{
			resultMap.setCode(ResultCode.UPDATE_FAIL.getCode());
			resultMap.setMessage(ResultCode.UPDATE_FAIL.getMessage());
			
		}
		
		return resultMap;
	}

	public ResultMap DeleteMemo(MemoDTO memoDTO)
	{
		ResultMap resultMap = new ResultMap();
		
		int result = memoMapper.DeleteMemo(memoDTO);
		if(0 < result)
		{
			resultMap.setCode(ResultCode.OK.getCode());
			resultMap.setMessage(ResultCode.OK.getMessage());
			resultMap.setData(memoDTO);
		}
		else
		{
			resultMap.setCode(ResultCode.UPDATE_FAIL.getCode());
			resultMap.setMessage(ResultCode.UPDATE_FAIL.getMessage());
			
		}
		
		return resultMap;
	}

}
