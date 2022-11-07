package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 추가할 회원의 이름과 주소를 각각 입력받아서 MemberDto 객체에 담고 MemberDao 객체를 이용해서
		 * DB에 저장하는 프로그래밍을 해보세요.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력:");
		String name = scan.nextLine();

		System.out.println("조수 입력:");
		String addr = scan.nextLine();

		// 입력받은 이름을 MemberDto 객체에에 담고
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);

		// MemberDao 객체를 생성해서
		MemberDao dao = new MemberDao();
		// DB에 저장하고 성공여부를 리턴 받는다.
		boolean isSuccess = dao.insert(dto);

		// 저장하고 말거면, 성공하든말든 상관 없다면 dao.insert(dto); 라고 해야함.
		// 리턴하는 값을 받아서 쓸려고 boolean isSuccess 변수에 담아서 사용한다.

		// 1. 왜 boolean 타입으로 받는지 :
		// insert 메소드의 리턴타입이 boolean 이기 때문에 boolean으로 받는다.

		// 성공 여부에 따라 다른 동작을 한다.
		if (isSuccess) {
			System.out.println(name + "의 정보를 추가 했습니다.");
		} else {
			System.out.println("회원정보 추가 실패!");
		}

		// 내가 한 내용
//		Scanner scan = new Scanner(System.in);
//		MemberDto dto = new MemberDto();
//		String name = scan.nextLine();
//		String addr = scan.nextLine();
//		System.out.println("이름: "+name + " 주소: "+addr );
//		
//		dto.getName();
//		dto.getAddr();
	}
}
