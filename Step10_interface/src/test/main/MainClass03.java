package test.main;

import test.mypac.Remocon;

public interface MainClass03 {
	// anonymous inner class를 이용해서 interface type의 참조값을 얻어내기 
	// static 메소드 안에서 사용해야 되기 때문에 static 필드로 만들어 준다.
	static Remocon r1 = new Remocon() {
		@Override
		public void up() {
			
		}
		
		@Override
		public void down() {
			
		}
	};
	
	public static void main(String[] args) {
		useRemocon(r1);
		
		//anonymous local inner class를 이용해서 interface type의 참조값을 얻어내기
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("속도를 올려요");
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("속도를 내려요");
			}
		}); 
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
