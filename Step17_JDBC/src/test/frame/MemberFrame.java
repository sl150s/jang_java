package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener, PropertyChangeListener {
	// 필드
	JTextField inputName, inputAddr;
	DefaultTableModel model;
	JTable table;

	// 생성자
	public MemberFrame() {
		// 레이아웃 메니저 설정
		setLayout(new BorderLayout());

		JLabel label1 = new JLabel("이름");
		inputName = new JTextField(10);

		JLabel label2 = new JLabel("주소");
		inputAddr = new JTextField(10);

		JButton saveBtn = new JButton("저장");
		saveBtn.setActionCommand("save");
		
		JButton deleteBtn = new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		
		// 페널에 UI 를 배치하고
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(saveBtn);
		panel.add(deleteBtn);
		// 페널째로 프레임의 북쪽에 배치
		add(panel, BorderLayout.NORTH);

		// 표형식으로 정보를 출력하기 위한 JTable
		table = new JTable();
		// 칼럼명을 String[] 에 순서대로 준비
		String[] colNames = { "번호", "이름", "주소"};
		// 테이블에 연결할 모델객체(테이블에 출력할 데이터를 가지고 있는 객체)
		model = new DefaultTableModel(colNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				//0번째 칼럼은 수정 불가능하도록 false를 리턴하고 
				if(column == 0) {
					return false;
				}else {//나머지 칼럼은 수정 가능하도록 true를 리턴한다. 
					return true;
				}
			}
		};
		// 모델을 테이블에 연결한다.
		table.setModel(model);
		// 스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
		JScrollPane scroll = new JScrollPane(table);
		// JScrollPane 을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);

		// 버튼에 리스너 등록
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		//4. 새로고침하기 
		displayMember();
		
		table.addPropertyChangeListener(this);
		//클래스에 PropertyChangeListener을 implements 했기때문에 
		//테이블의 메소드 addPropertyChangeListener를 사용할수있다. 
	}

	// 테이블에 회원 목록을 출력하는 메소드
	public void displayMember() {
		/*
		 * //sample 데이터 
		 * Object[] row1= {1, "김구라", "노량진"};  
		 * Object[] row2= {2, "해골","행신동"};  
		 * Object[] row3= {3, "원숭이", "동물원"}; 
		 * //sample 데이터를 DefaultTableModel 객체에 추가 하기 
		 * model.addRow(row1); 
		 * model.addRow(row2); 
		 * model.addRow(row3);
		 */

		model.setRowCount(0); // 테이블에 출력된 데이터 reset
		
		// MemberDao 객체의 .getList() 메소드가 리턴해주는 데이터를 활용해서 회원목록을 출력해 보세요.
		List<MemberDto> list = new MemberDao().getList();

		// 반복문 돌면서 순서대로 MemberDto 객체를 참조해서
		for (MemberDto tmp : list) {
			// Object 배열로 만든 다음
			Object[] row = { tmp.getNum(), tmp.getName(), tmp.getAddr() };
			// 모델에 추가
			model.addRow(row);
		}
	}

	public static void main(String[] args) {
		MemberFrame f = new MemberFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	// 저장 + 삭제 버튼 클릭시 =======================
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("save")) {
			// 입력한 이름과 주소를 읽어와서
			String name = inputName.getText();
			String addr = inputAddr.getText();
			// MemberDto 객체에 담고
			MemberDto dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			// MemberDao 객체를 이용해서 DB 에 저장하기
			boolean isSuccess = new MemberDao().insert(dto);
			if (isSuccess) {
				JOptionPane.showMessageDialog(this, name + " 의 정보를 추가 했습니다.");
				displayMember();
			} else {
				JOptionPane.showMessageDialog(this, "Oops! 실패 했습니다");
			}
		} else if (command.equals("delete")) {
			// 1. JTable 의 선택된 row 의 인덱스를 읽어와서 (table 활용)
			int rowIndex = table.getSelectedRow();
			if (rowIndex == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row 를 선택하세요!");
				return;
			}
			
			//취소하기전에 '취소해도될까요'라고 한번 더 확인하게 하는 알림창 
			int result = JOptionPane.showConfirmDialog(this, "선택된 row 값을 삭제 하시겠습니까?");
			//만일 예를 눌렀다면
			if(result == JOptionPane.YES_OPTION) {
				// 2. DefaultTableModel 에서 해당 인덱스의 table row 에서 삭제할 회원의 번호를 읽어와서(model 활용)
				int num = (int)model.getValueAt(rowIndex, 0);
				// 3. MemberDao 객체를 이용해서 DB 에서 삭제하고
				new MemberDao().delete(num);
				// 4. 새로 고침하기
				displayMember();
			}
		}
	}

	//테이블에 특정 이벤트가 발생했을 때 호출되는 메소드======= 
	//수정 후 마우스커서가 떠나가거나 엔터를 눌렀을때 수정이 DB에도 적용됨 
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("property change!");
		System.out.println("property name:"+evt.getPropertyName());//최초의 프레임이 만들어질때 
		
		System.out.println("isEditing:"+table.isEditing());
		
		//만일 테이블의 수정사항을 DB에 수정반영할 적당한 시점이 되면
		if(evt.getPropertyName().equals("tableCellEditor") && !table.isEditing()) {
			//현재 선택된 row의 정보를 DB에 반영한다.
			//변화된 값을 읽어와서 DB에 반영한다.
			// 수정된 칼럼에 있는 row 전체의 값을 읽어온다.
			int selectedIndex = table.getSelectedRow();
			int num = (int)model.getValueAt(selectedIndex, 0);
			String name = (String)model.getValueAt(selectedIndex, 1);
			String addr = (String)model.getValueAt(selectedIndex, 2);
			//수정할 회원의 정보를 MemberDto 객체에 담고
			MemberDto dto = new MemberDto(num, name, addr);
			//DB에 저장하기
			new MemberDao().update(dto);
			//선택된 row clear
			table.clearSelection();
		}
		
	}
}
