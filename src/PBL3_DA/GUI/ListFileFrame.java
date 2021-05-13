package PBL3_DA.GUI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import PBL3_DA.BLL.BLL_Timviec;
import PBL3_DA.DTO.HO_SO_VIEW;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Struct;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

@SuppressWarnings("serial")
public class ListFileFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtHotenHS;
	private JTable tbDshs;
	private DefaultTableModel tableModel = new DefaultTableModel();
	private TableColumnModel tableColumnModel;
	private Boolean gender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListFileFrame frame = new ListFileFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListFileFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 863);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1064, 115);
		panel.setBackground(new Color(51, 51, 204));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lbTitle = new JLabel("VN FIND JOB\r\n");
		lbTitle.setToolTipText("VN Find Job\r\nFor goodlife");
		lbTitle.setForeground(Color.WHITE);
		lbTitle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lbTitle.setBounds(187, 34, 125, 70);
		panel.add(lbTitle);

		JLabel lbHotLine = new JLabel("Hotline:", (Icon) null, SwingConstants.LEFT);
		lbHotLine.setForeground(Color.WHITE);
		lbHotLine.setFont(new Font("Calibri", Font.BOLD, 15));
		lbHotLine.setBounds(826, 11, 228, 20);
		panel.add(lbHotLine);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 114, 1064, 45);
		panel_1.setBackground(new Color(30, 144, 255));
		contentPane.add(panel_1);

		JLabel lbKinhdoanh = new JLabel("Kinh doanh");
		lbKinhdoanh.setForeground(Color.WHITE);
		lbKinhdoanh.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		JLabel lbIcon1_1 = new JLabel(">>");
		lbIcon1_1.setForeground(Color.WHITE);
		lbIcon1_1.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lbBanhang = new JLabel("B\u00E1n h\u00E0ng");
		lbBanhang.setForeground(Color.WHITE);
		lbBanhang.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		JLabel lbIcon1_2 = new JLabel(">>");
		lbIcon1_2.setForeground(Color.WHITE);
		lbIcon1_2.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lbLaodong = new JLabel("Lao \u0111\u1ED9ng ");
		lbLaodong.setForeground(Color.WHITE);
		lbLaodong.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		JLabel lbIcon1_3 = new JLabel(">>");
		lbIcon1_3.setForeground(Color.WHITE);
		lbIcon1_3.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lbTaichinhNH = new JLabel("T\u00E0i ch\u00EDnh/Ng\u00E2n h\u00E0ng");
		lbTaichinhNH.setForeground(Color.WHITE);
		lbTaichinhNH.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		JLabel lbIcon1_4 = new JLabel(">>");
		lbIcon1_4.setForeground(Color.WHITE);
		lbIcon1_4.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lbCNTT = new JLabel("C\u00F4ng ngh\u1EC7 th\u00F4ng tin");
		lbCNTT.setForeground(Color.WHITE);
		lbCNTT.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		JLabel lbIcon1_5 = new JLabel(">>");
		lbIcon1_5.setForeground(Color.WHITE);
		lbIcon1_5.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lbCoKhiKT = new JLabel("C\u01A1 kh\u00ED/K\u1EF9 thu\u1EADt");
		lbCoKhiKT.setForeground(Color.WHITE);
		lbCoKhiKT.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		JLabel lbIcon1_6 = new JLabel(">>");
		lbIcon1_6.setForeground(Color.WHITE);
		lbIcon1_6.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lbAllNganhnghe = new JLabel("T\u1EA5t c\u1EA3 ng\u00E0nh ngh\u1EC1 kh\u00E1c");
		lbAllNganhnghe.setForeground(Color.WHITE);
		lbAllNganhnghe.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGap(0, 1064, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(35)
						.addComponent(lbKinhdoanh, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE).addGap(10)
						.addComponent(lbIcon1_1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE).addGap(6)
						.addComponent(lbBanhang, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE).addGap(10)
						.addComponent(lbIcon1_2, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE).addGap(10)
						.addComponent(lbLaodong, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE).addGap(10)
						.addComponent(lbIcon1_3, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE).addGap(10)
						.addComponent(lbTaichinhNH, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE).addGap(13)
						.addComponent(lbIcon1_4, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE).addGap(6)
						.addComponent(lbCNTT, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE).addGap(10)
						.addComponent(lbIcon1_5, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE).addGap(10)
						.addComponent(lbCoKhiKT, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE).addGap(8)
						.addComponent(lbIcon1_6, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE).addGap(6)
						.addComponent(lbAllNganhnghe, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGap(41)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGap(0, 45, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(5).addComponent(lbKinhdoanh,
						GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(12).addComponent(lbIcon1_1))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(5).addComponent(lbBanhang,
						GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(12).addComponent(lbIcon1_2))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(5).addComponent(lbLaodong,
						GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(12).addComponent(lbIcon1_3))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(5).addComponent(lbTaichinhNH,
						GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(12).addComponent(lbIcon1_4))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(5).addComponent(lbCNTT, GroupLayout.PREFERRED_SIZE,
						29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(12).addComponent(lbIcon1_5))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(5).addComponent(lbCoKhiKT,
						GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(12).addComponent(lbIcon1_6))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(5).addComponent(lbAllNganhnghe,
						GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)));
		panel_1.setLayout(gl_panel_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 159, 1064, 665);
		contentPane.add(scrollPane);

		JPanel panel_5 = new JPanel();
		scrollPane.setColumnHeaderView(panel_5);
		panel_5.setBackground(new Color(230, 230, 250));
		panel_5.setAlignmentY(1.0f);
		panel_5.setAlignmentX(1.0f);

		JScrollPane scrollPane_1 = new JScrollPane();

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(70, 130, 180));

		JComboBox cbbTinhthanhHS = new JComboBox(FileFrame.city);
		cbbTinhthanhHS.setSelectedIndex(-1);
		cbbTinhthanhHS.setBounds(46, 123, 266, 32);
		panel_3_1.add(cbbTinhthanhHS);

		String money[] = {
				"0",
				"1000000",
				"2000000",
				"3000000"
		};
		JComboBox cbbMucluongHS = new JComboBox(money);
		cbbMucluongHS.setSelectedIndex(-1);
		cbbMucluongHS.setBounds(46, 166, 266, 32);
		panel_3_1.add(cbbMucluongHS);

		String Trinhdo[] = {
				"Gioi",
				"Kha",
				"Trung Binh",
				"Yeu"
		};
		JComboBox cbbTrinhdoHS = new JComboBox(Trinhdo);
		cbbTrinhdoHS.setSelectedIndex(-1);
		cbbTrinhdoHS.setBounds(46, 209, 266, 32);
		panel_3_1.add(cbbTrinhdoHS);

		String Ngoaingu[] = {
				"Anh",
				"Nhat",
				"Phap",
				"Y"
		};
		
		String Bangcap[] = {
				"Toeic 650",
				"Toeic 525",
				"Ielts 6.0",
				"Ielts 7.0",
				"N0",
				"N1",
				"N2",
				"N3",
				"N4",
				"N5",
				"Delf a1",
				"Delf a2",
				"Delf b1",
				"Delf b2"
		};
		JComboBox cbbBangCapHS = new JComboBox(Bangcap);
		cbbBangCapHS.setSelectedIndex(-1);
		cbbBangCapHS.setBounds(46, 295, 266, 32);
		panel_3_1.add(cbbBangCapHS);
		
		JComboBox cbbNgoaiNguHS = new JComboBox(Ngoaingu);
		cbbNgoaiNguHS.setSelectedIndex(-1);
		cbbNgoaiNguHS.setBounds(46, 252, 266, 32);
		panel_3_1.add(cbbNgoaiNguHS);

		txtHotenHS = new JTextField();
		txtHotenHS.setColumns(10);
		txtHotenHS.setBounds(46, 54, 266, 32);
		panel_3_1.add(txtHotenHS);

		JLabel lbLocHS = new JLabel("L\u1ECCC H\u1ED2 S\u01A0");
		lbLocHS.setFont(new Font("Calibri", Font.BOLD, 21));
		lbLocHS.setBounds(124, 11, 109, 32);
		panel_3_1.add(lbLocHS);

		ButtonGroup bg = new ButtonGroup();
		JRadioButton rdbtn_male = new JRadioButton("Male");
		rdbtn_male.setBounds(46, 93, 109, 23);
		rdbtn_male.setBackground(new Color(70, 130, 180));
		panel_3_1.add(rdbtn_male);

		JRadioButton rdbtn_female = new JRadioButton("Female");
		rdbtn_female.setBounds(203, 93, 109, 23);
		rdbtn_female.setBackground(new Color(70, 130, 180));
		panel_3_1.add(rdbtn_female);
		bg.add(rdbtn_female);
		bg.add(rdbtn_male);

		JButton btnLoc = new JButton("Lọc/Tìm Kiếm");
		btnLoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn_male.isSelected()) {
					gender = true;
				}
				if (rdbtn_female.isSelected()) {
					gender = false;
				}
				if (txtHotenHS.getText().equals("") && gender == null && cbbTinhthanhHS.getSelectedIndex() == -1
						&& cbbMucluongHS.getSelectedIndex() == -1
						&& cbbTrinhdoHS.getSelectedIndex() == -1
						&& cbbNgoaiNguHS.getSelectedIndex() == -1
						&& cbbBangCapHS.getSelectedIndex() == -1) {
					tableModel.setRowCount(0);
					setView();
				} else {
					tableModel.setRowCount(0);
					setViewinCondition(txtHotenHS.getText(), gender, (String) cbbTinhthanhHS.getSelectedItem(),
							(String) cbbMucluongHS.getSelectedItem(), (String) cbbTrinhdoHS.getSelectedItem(),
							(String) cbbNgoaiNguHS.getSelectedItem(), (String) cbbBangCapHS.getSelectedItem());
				}
			}
		});
		btnLoc.setForeground(Color.WHITE);
		btnLoc.setFont(new Font("Calibri", Font.BOLD, 19));
		btnLoc.setBorder(null);
		btnLoc.setBackground(Color.RED);
		btnLoc.setBounds(103, 383, 167, 40);
		panel_3_1.add(btnLoc);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(135, 206, 250));

		JButton btnTuhs = new JButton("T\u1EE7 h\u1ED3 s\u01A1", null);
		btnTuhs.setFont(new Font("Calibri", Font.BOLD, 15));
		btnTuhs.setBorder(null);
		btnTuhs.setBackground(new Color(135, 206, 250));
		btnTuhs.setBounds(0, 0, 121, 45);
		panel_2.add(btnTuhs);

		JButton btnVLDaluu = new JButton("Vi\u1EC7c l\u00E0m \u0111\u00E3 l\u01B0u", null);
		btnVLDaluu.setFont(new Font("Calibri", Font.BOLD, 15));
		btnVLDaluu.setBorder(null);
		btnVLDaluu.setBackground(new Color(135, 206, 250));
		btnVLDaluu.setBounds(396, 0, 170, 45);
		panel_2.add(btnVLDaluu);

		JButton btnVLUngtuyen = new JButton("Vi\u1EC7c l\u00E0m \u0111\u00E3 \u1EE9ng tuy\u1EC3n", null);
		btnVLUngtuyen.setFont(new Font("Calibri", Font.BOLD, 15));
		btnVLUngtuyen.setBorder(null);
		btnVLUngtuyen.setBackground(new Color(135, 206, 250));
		btnVLUngtuyen.setBounds(576, 0, 190, 45);
		panel_2.add(btnVLUngtuyen);

		JButton btnTaikhoan = new JButton("T\u00E0i kho\u1EA3n", null);
		btnTaikhoan.setFont(new Font("Calibri", Font.BOLD, 15));
		btnTaikhoan.setBorder(null);
		btnTaikhoan.setBackground(new Color(135, 206, 250));
		btnTaikhoan.setBounds(265, 0, 121, 45);
		panel_2.add(btnTaikhoan);

		JButton btnTimkiemhs = new JButton("T\u00ECm h\u1ED3 s\u01A1", null);
		btnTimkiemhs.setFont(new Font("Calibri", Font.BOLD, 15));
		btnTimkiemhs.setBorder(null);
		btnTimkiemhs.setBackground(new Color(135, 206, 250));
		btnTimkiemhs.setBounds(131, 0, 121, 45);
		panel_2.add(btnTimkiemhs);

		JButton btnTaohs = new JButton("T\u1EA1o h\u1ED3 s\u01A1", null);
		btnTaohs.setForeground(Color.WHITE);
		btnTaohs.setFont(new Font("Calibri", Font.BOLD, 21));
		btnTaohs.setBorder(null);
		btnTaohs.setBackground(new Color(51, 102, 204));

		JButton btnDangTin = new JButton("\u0110\u0103ng tin \r\ntuy\u1EC3n d\u1EE5ng", null);
		btnDangTin.setForeground(Color.WHITE);
		btnDangTin.setFont(new Font("Calibri", Font.BOLD, 21));
		btnDangTin.setBorder(null);
		btnDangTin.setBackground(new Color(51, 102, 204));

		JButton btnTaikhoancn = new JButton("T\u00E0i kho\u1EA3n", null);
		btnTaikhoancn.setForeground(Color.WHITE);
		btnTaikhoancn.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTaikhoancn.setBorder(null);
		btnTaikhoancn.setBackground(new Color(51, 102, 204));

		JButton btnDangXuat = new JButton("\u0110\u0103ng xu\u1EA5t", null);
		btnDangXuat.setForeground(Color.WHITE);
		btnDangXuat.setFont(new Font("Calibri", Font.BOLD, 18));
		btnDangXuat.setBorder(null);
		btnDangXuat.setBackground(new Color(51, 102, 204));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup().addGap(37).addGroup(gl_panel_5
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_panel_5.createSequentialGroup()
										.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
										.addGap(33)
										.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 359,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel_5.createSequentialGroup().addGroup(gl_panel_5
								.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 849,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_5.createSequentialGroup()
										.addComponent(btnTaohs, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
										.addGap(10)
										.addComponent(btnDangTin, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
										.addGap(19)
										.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_5.createSequentialGroup().addGap(152).addComponent(
														btnTaikhoancn, GroupLayout.PREFERRED_SIZE, 156,
														GroupLayout.PREFERRED_SIZE))
												.addComponent(btnDangXuat, GroupLayout.PREFERRED_SIZE, 156,
														GroupLayout.PREFERRED_SIZE))))
								.addGap(133)))
						.addGap(26)));
		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup().addGap(11)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addComponent(btnTaohs, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDangTin, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTaikhoancn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDangXuat, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGap(11).addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGap(56)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
						.addContainerGap()));

		tbDshs = new JTable();
		tbDshs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileFrame.getObj((int) tbDshs.getModel().getValueAt(0, tbDshs.getSelectedColumn()));
			}
		});
		String ColsName[] = { "ID", "Họ Và Tên", "Số Điện Thoại", "Ngày Sinh", "Giới Tính", "Tỉnh/Thành phố" };
		tableModel.setColumnIdentifiers(ColsName);
		
		JComboBox cbbLoaiTotNghiep = new JComboBox(Trinhdo);
		cbbLoaiTotNghiep.setSelectedIndex(-1);
		cbbLoaiTotNghiep.setBounds(46, 338, 266, 32);
		panel_3_1.add(cbbLoaiTotNghiep);

		panel_5.setLayout(gl_panel_5);

		setView();
		scrollPane_1.setViewportView(tbDshs);
		tableColumnModel = tbDshs.getColumnModel();
		tableColumnModel.getColumn(0).setPreferredWidth(5);
		tableColumnModel.getColumn(1).setPreferredWidth(110);
		tableColumnModel.getColumn(2).setPreferredWidth(50);
		tableColumnModel.getColumn(3).setPreferredWidth(50);
		tableColumnModel.getColumn(4).setPreferredWidth(30);
		tableColumnModel.getColumn(5).setWidth(10);
	}

	public void setViewinCondition(String HoTen, Boolean gender, String TinhThanh, String MucLuong, String TrinhDo,
			String NgoaiNgu, String BangCap) {
		tbDshs.setModel(tableModel);
		ArrayList<HO_SO_VIEW> hsvArrayList = BLL_Timviec.Instance().GetConditionListHStoView_BLL(HoTen, gender,
				TinhThanh, MucLuong, TrinhDo, NgoaiNgu, BangCap);
		int i = 0;
		for (i = 0; i <= hsvArrayList.size() - 1; i++) {
			Object[] obj = { hsvArrayList.get(i).getId(), hsvArrayList.get(i).getHoTen(), hsvArrayList.get(i).getSdt(),
					hsvArrayList.get(i).getNgaySinh(), hsvArrayList.get(i).getGioiTinh(),
					hsvArrayList.get(i).getTinh() };
			tableModel.addRow(obj);
		}
	}

	public void setView() {
		tbDshs.setModel(tableModel);
		ArrayList<HO_SO_VIEW> hsvArrayList = BLL_Timviec.Instance().GetAllListHStoView_BLL();
		int i = 0;
		for (i = 0; i <= hsvArrayList.size() - 1; i++) {
			Object[] obj = { hsvArrayList.get(i).getId(), hsvArrayList.get(i).getHoTen(), hsvArrayList.get(i).getSdt(),
					hsvArrayList.get(i).getNgaySinh(), hsvArrayList.get(i).getGioiTinh(),
					hsvArrayList.get(i).getTinh() };
			tableModel.addRow(obj);
		}
	}

	private void initialize() {

	}
}
