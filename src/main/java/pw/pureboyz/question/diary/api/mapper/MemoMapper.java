package pw.pureboyz.question.diary.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import pw.pureboyz.question.diary.api.dto.MemoDTO;

@Mapper
public interface MemoMapper
{

	int create(MemoDTO memoDTO);

	List<MemoDTO> SelectMemoList(MemoDTO memoDTO);

	MemoDTO SelectMemo(MemoDTO memoDTO);

	int UpdateMemo(MemoDTO memoDTO);

	int DeleteMemo(MemoDTO memoDTO);

}
