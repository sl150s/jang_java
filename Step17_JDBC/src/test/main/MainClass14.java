package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		
		//추가할 회원의 정보라고 가정
		String name = "원숭이";
		String addr="동물원";
		/*
		 * 회원의 정보를 DB에 저장하는 기능을 가지고 있는
		 * MemberDao 객체를 생성해서 참조값을 dao라는 지역변수에 담기
		 */
		
		MemberDao dao = new MemberDao();
		
		//insert() 메소드에 전달할 MemberDto 객체 생성해서
		MemberDto dto = new MemberDto();
		// 추가할 회원의 정보를 담고
		dto.setName(name);
		dto.setAddr(addr);
		//MemberDao 객체를 이용해서 회원 정보를 추가하고 성공여부를 리턴받는다. 
		boolean isSuccess=dao.insert(dto);
		
		//저장하고 말거면, 성공하든말든 상관 없다면 dao.insert(dto); 라고 해야함. 
		//리턴하는 값을 받아서 쓸려고 boolean isSuccess 변수에 담아서 사용한다. 
		
		//1. 왜  boolean 타입으로 받는지 : 
		// insert 메소드의 리턴타입이 boolean 이기 때문에 boolean으로 받는다. 
		
		//2. 
		
		
		//성공 여부에 따라 다른 동작을 한다.
		if(isSuccess) {
			System.out.println(name+"의 정보를 추가 했습니다.");
		}else {
			System.out.println("회원정보 추가 실패!");
		}
	}
}
