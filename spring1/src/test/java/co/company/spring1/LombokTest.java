package co.company.spring1;

import co.company.spring1.controller.MemberVO;

public class LombokTest {

	MemberVO member = MemberVO.builder().id("id").pw("pw").build();
	
}
