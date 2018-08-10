package com.lectopia.persistence;

import com.lectopia.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	public void insertMember(MemberVO vo);
}
