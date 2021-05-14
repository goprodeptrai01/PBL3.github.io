package PBL3_DA.GUI;

import java.awt.EventQueue; 
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import PBL3_DA.BLL.*;
import PBL3_DA.DTO.BANG_CAP;
import PBL3_DA.DTO.DIA_CHI;
import PBL3_DA.DTO.HO_SO;
import PBL3_DA.DTO.KI_NANG;
import PBL3_DA.DTO.NN_TH;
import PBL3_DA.DTO.TAI_KHOAN;

public class FileFrame {
	public static String city[] = { "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre",
			"Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Cần Thơ", "Đà Nẵng",
			"Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội",
			"Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang",
			"Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình",
			"Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị",
			"Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế",
			"Tiền Giang", "Trà Vinh", "Tuyên Quang", "TP Hồ Chí Minh", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái" };
	private static FileFrame Obj = null;
	private JFrame frameHS;
	
	public JFrame getFrameHS() {
		return frameHS;
	}

	public void setFrameHS(JFrame frameHS) {
		this.frameHS = frameHS;
	}

	private JTextField txtHoten;
	private JTextField txtSdt;
	private JTextField txtDiachi;
	private JTextField txtMucluong;
	private JTextField txtSotien;
	private JTextField txtDoanhnghiep;
	private JTextField txtTrinhdo;
	private JTextField txtDonvidaotao;
	private JTextField txtChuyennganh;

	private int IDHS;

	public int getIDHS() {
		return IDHS;
	}

	public void setIDHS(int iDHS) {
		IDHS = iDHS;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileFrame window = new FileFrame(0);
					window.frameHS.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
//	public FileFrame(int id) {
//		idhs = id;
//		initialize();
//	}
	/**
	 * @wbp.parser.entryPoint
	 */
	private FileFrame(int ID) {
		IDHS = ID;
		initialize();
	}

	public static FileFrame getObj(int id) {
		if(Obj == null)
		{
			Obj = new FileFrame(id);
			Obj.getFrameHS().setVisible(true);
		} return Obj;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {

		frameHS = new JFrame();
		frameHS.setTitle("H\u1ED2 S\u01A0");
		frameHS.setResizable(false);
		frameHS.setBounds(0, 0, 630, 498);
		frameHS.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 180, 461);
		frameHS.getContentPane().add(panel);
		panel.setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(179, 0, 435, 461);
		frameHS.getContentPane().add(layeredPane);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_1);

		JLabel lb1_panel1 = new JLabel("Th\u00F4ng tin t\u00E0i kho\u1EA3n");
		lb1_panel1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb1_panel1.setBounds(145, 11, 142, 35);
		panel_1.add(lb1_panel1);

		JLabel lb2_panel1 = new JLabel("H\u1ECD t\u00EAn");
		lb2_panel1.setHorizontalAlignment(SwingConstants.RIGHT);
		lb2_panel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb2_panel1.setBounds(10, 80, 100, 25);
		panel_1.add(lb2_panel1);

		JLabel lb3_panel1 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lb3_panel1.setHorizontalAlignment(SwingConstants.RIGHT);
		lb3_panel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb3_panel1.setBounds(10, 130, 100, 25);
		panel_1.add(lb3_panel1);

		JLabel lb4_panel1 = new JLabel("Ng\u00E0y sinh");
		lb4_panel1.setHorizontalAlignment(SwingConstants.RIGHT);
		lb4_panel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb4_panel1.setBounds(10, 180, 100, 25);
		panel_1.add(lb4_panel1);

		JLabel lb6_panel1 = new JLabel("Gi\u1EDBi t\u00EDnh");
		lb6_panel1.setHorizontalAlignment(SwingConstants.RIGHT);
		lb6_panel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb6_panel1.setBounds(10, 230, 100, 25);
		panel_1.add(lb6_panel1);

		JLabel lb7_panel1 = new JLabel("T\u1EC9nh/Th\u00E0nh ph\u1ED1");
		lb7_panel1.setHorizontalAlignment(SwingConstants.RIGHT);
		lb7_panel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb7_panel1.setBounds(10, 280, 100, 25);
		panel_1.add(lb7_panel1);

		JLabel lb8_panel1 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lb8_panel1.setHorizontalAlignment(SwingConstants.RIGHT);
		lb8_panel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb8_panel1.setBounds(10, 330, 100, 25);
		panel_1.add(lb8_panel1);

		txtHoten = new JTextField();
		txtHoten.setColumns(10);
		txtHoten.setBorder(null);
		txtHoten.setBounds(145, 83, 250, 20);
		panel_1.add(txtHoten);

		txtSdt = new JTextField();
		txtSdt.setColumns(10);
		txtSdt.setBorder(null);
		txtSdt.setBounds(145, 133, 250, 20);
		panel_1.add(txtSdt);

		JDateChooser datechooserNS = new JDateChooser();
		datechooserNS.setBounds(145, 180, 250, 20);
		panel_1.add(datechooserNS);

		JComboBox cbbThanhpho = new JComboBox(city);
		cbbThanhpho.setBounds(145, 282, 250, 22);
		panel_1.add(cbbThanhpho);

		txtDiachi = new JTextField();
		txtDiachi.setColumns(10);
		txtDiachi.setBorder(null);
		txtDiachi.setBounds(145, 333, 250, 20);
		panel_1.add(txtDiachi);

		ButtonGroup bg = new ButtonGroup();
		JRadioButton rdbtn_male = new JRadioButton("Male");
		rdbtn_male.setBounds(145, 232, 109, 23);
		panel_1.add(rdbtn_male);

		JRadioButton rdbtn_female = new JRadioButton("Female");
		rdbtn_female.setBounds(286, 232, 109, 23);
		panel_1.add(rdbtn_female);
		bg.add(rdbtn_female);
		bg.add(rdbtn_male);

		JButton btnLuu_panel1 = new JButton("L\u01B0u");
		btnLuu_panel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLuu_panel1.setBorder(null);
		btnLuu_panel1.setBackground(new Color(220, 20, 60));
		btnLuu_panel1.setBounds(145, 389, 89, 35);
		panel_1.add(btnLuu_panel1);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_2);

		JLabel lblThngTinChung = new JLabel("Th\u00F4ng tin chung");
		lblThngTinChung.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThngTinChung.setBounds(145, 11, 142, 35);
		panel_2.add(lblThngTinChung);

		JLabel lb1_panel2 = new JLabel("Kinh nghi\u1EC7m");
		lb1_panel2.setHorizontalAlignment(SwingConstants.RIGHT);
		lb1_panel2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb1_panel2.setBounds(10, 80, 140, 25);
		panel_2.add(lb1_panel2);

		JLabel lb2_panel2 = new JLabel("V\u1ECB tr\u00ED hi\u1EC7n t\u1EA1i");
		lb2_panel2.setHorizontalAlignment(SwingConstants.RIGHT);
		lb2_panel2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb2_panel2.setBounds(10, 130, 140, 25);
		panel_2.add(lb2_panel2);

		JLabel lb3_panel2 = new JLabel("V\u1ECB tr\u00ED mong mu\u1ED1n");
		lb3_panel2.setHorizontalAlignment(SwingConstants.RIGHT);
		lb3_panel2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb3_panel2.setBounds(10, 180, 140, 25);
		panel_2.add(lb3_panel2);

		JLabel lb4_panel2 = new JLabel("M\u1EE9c l\u01B0\u01A1ng mong mu\u1ED1n");
		lb4_panel2.setHorizontalAlignment(SwingConstants.RIGHT);
		lb4_panel2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb4_panel2.setBounds(0, 230, 150, 25);
		panel_2.add(lb4_panel2);

		JLabel lb5_panel2 = new JLabel("N\u01A1i l\u00E0m vi\u1EC7c");
		lb5_panel2.setHorizontalAlignment(SwingConstants.RIGHT);
		lb5_panel2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb5_panel2.setBounds(10, 280, 140, 25);
		panel_2.add(lb5_panel2);

		JLabel lb6_panel2 = new JLabel("M\u1EE5c ti\u00EAu c\u00F4ng vi\u1EC7c");
		lb6_panel2.setHorizontalAlignment(SwingConstants.RIGHT);
		lb6_panel2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb6_panel2.setBounds(10, 330, 140, 25);
		panel_2.add(lb6_panel2);
		
		String exp[] = {
				"1 thang","3 thang","6 thang",
				"1 nam","2 nam","4 nam","8 nam"
		};
		JComboBox cbbKinhnghiem = new JComboBox(exp);
		cbbKinhnghiem.setBounds(160, 82, 250, 22);
		panel_2.add(cbbKinhnghiem);

		String role[] = {
				"Nhân viên",
				"Cộng tác viên",
				"Trưởng nhóm/Trưởng phòng",
				"Chuyên gia",
				"Quản lý cấp cao",
		};
		JComboBox cbbVitrihientai = new JComboBox(role);
		cbbVitrihientai.setBounds(160, 132, 250, 22);
		panel_2.add(cbbVitrihientai);

		JComboBox cbbVitrimongmuon = new JComboBox(role);
		cbbVitrimongmuon.setBounds(160, 182, 250, 22);
		panel_2.add(cbbVitrimongmuon);

		txtMucluong = new JTextField();
		txtMucluong.setColumns(10);
		txtMucluong.setBounds(160, 233, 250, 20);
		panel_2.add(txtMucluong);

		JComboBox cbbNoilamviec = new JComboBox(city);
		cbbNoilamviec.setBounds(160, 282, 250, 22);
		panel_2.add(cbbNoilamviec);

		JScrollPane scrollPane_panel2 = new JScrollPane();
		scrollPane_panel2.setBounds(160, 330, 250, 49);
		panel_2.add(scrollPane_panel2);

		JTextArea txareaMuctieu = new JTextArea();
		scrollPane_panel2.setViewportView(txareaMuctieu);

		JButton btnLuu_panel2 = new JButton("L\u01B0u");
		btnLuu_panel2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLuu_panel2.setBorder(null);
		btnLuu_panel2.setBackground(new Color(220, 20, 60));
		btnLuu_panel2.setBounds(160, 399, 90, 35);
		panel_2.add(btnLuu_panel2);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_3);

		JLabel lb_panel3 = new JLabel("Kinh nghi\u1EC7m");
		lb_panel3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb_panel3.setBounds(145, 11, 148, 35);
		panel_3.add(lb_panel3);

		JLabel lb1_panel3 = new JLabel("Doanh nghi\u1EC7p");
		lb1_panel3.setHorizontalAlignment(SwingConstants.RIGHT);
		lb1_panel3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb1_panel3.setBounds(10, 80, 100, 25);
		panel_3.add(lb1_panel3);

		JLabel lb2_panel3 = new JLabel("N\u01A1i l\u00E0m vi\u1EC7c");
		lb2_panel3.setHorizontalAlignment(SwingConstants.RIGHT);
		lb2_panel3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb2_panel3.setBounds(10, 130, 100, 25);
		panel_3.add(lb2_panel3);

		JLabel lb3_panel3 = new JLabel("Th\u1EDDi gian l\u00E0m vi\u1EC7c");
		lb3_panel3.setHorizontalAlignment(SwingConstants.RIGHT);
		lb3_panel3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb3_panel3.setBounds(0, 180, 110, 25);
		panel_3.add(lb3_panel3);

		JLabel lb4_panel3 = new JLabel("M\u1EE9c l\u01B0\u01A1ng");
		lb4_panel3.setHorizontalAlignment(SwingConstants.RIGHT);
		lb4_panel3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb4_panel3.setBounds(10, 230, 100, 25);
		panel_3.add(lb4_panel3);

		JLabel lb5_panel3 = new JLabel("M\u00F4 t\u1EA3 c\u00F4ng vi\u1EC7c");
		lb5_panel3.setHorizontalAlignment(SwingConstants.RIGHT);
		lb5_panel3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb5_panel3.setBounds(10, 280, 100, 25);
		panel_3.add(lb5_panel3);

		JLabel lb6_panel3 = new JLabel("T\u1EEB");
		lb6_panel3.setBounds(145, 186, 22, 14);
		panel_3.add(lb6_panel3);
		
		String time[] = {
				"2021-05-09"
		};
		JComboBox cbbTu_panel3 = new JComboBox(time);
		cbbTu_panel3.setBounds(166, 182, 68, 22);
		panel_3.add(cbbTu_panel3);
		
		JLabel lb7_panel3 = new JLabel("\u0110\u1EBFn");
		lb7_panel3.setBounds(271, 186, 25, 14);
		panel_3.add(lb7_panel3);

		JComboBox cbbDen_panel3 = new JComboBox(time);
		cbbDen_panel3.setBounds(300, 182, 68, 22);
		panel_3.add(cbbDen_panel3);

		JLabel lb8_panel3 = new JLabel(
				"M\u00F4 t\u1EA3 nh\u1EEFng c\u00F4ng vi\u1EC7c, nhi\u1EC7m v\u1EE5 b\u1EA1n t\u1EEBng l\u00E0m");
		lb8_panel3.setBounds(82, 57, 231, 14);
		panel_3.add(lb8_panel3);

		JScrollPane scrollPane_panel3 = new JScrollPane();
		scrollPane_panel3.setBounds(145, 280, 250, 43);
		panel_3.add(scrollPane_panel3);

		JTextArea txtareaMotaCV = new JTextArea();
		scrollPane_panel3.setViewportView(txtareaMotaCV);

		String dvi[] = {
				"VND",
				"$",
		};
		JComboBox cbbDonvitien = new JComboBox(dvi);
		cbbDonvitien.setBounds(145, 232, 68, 22);
		panel_3.add(cbbDonvitien);

		txtSotien = new JTextField();
		txtSotien.setColumns(10);
		txtSotien.setBorder(null);
		txtSotien.setBounds(223, 233, 172, 20);
		panel_3.add(txtSotien);

		txtDoanhnghiep = new JTextField();
		txtDoanhnghiep.setColumns(10);
		txtDoanhnghiep.setBorder(null);
		txtDoanhnghiep.setBounds(145, 83, 250, 20);
		panel_3.add(txtDoanhnghiep);

		JComboBox cbbNoilamviec_panel3 = new JComboBox(city);
		cbbNoilamviec_panel3.setBounds(145, 132, 250, 22);
		panel_3.add(cbbNoilamviec_panel3);

		JButton btnLuu_panel3 = new JButton("L\u01B0u");
		btnLuu_panel3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLuu_panel3.setBorder(null);
		btnLuu_panel3.setBackground(new Color(220, 20, 60));
		btnLuu_panel3.setBounds(145, 377, 89, 35);
		panel_3.add(btnLuu_panel3);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_4);

		JLabel lb_panel4 = new JLabel("Tr\u00ECnh \u0111\u1ED9 & B\u1EB1ng c\u1EA5p");
		lb_panel4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb_panel4.setBounds(145, 11, 148, 35);
		panel_4.add(lb_panel4);

		JLabel lb1_panel4 = new JLabel("Tr\u00ECnh \u0111\u1ED9");
		lb1_panel4.setHorizontalAlignment(SwingConstants.RIGHT);
		lb1_panel4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb1_panel4.setBounds(10, 80, 100, 25);
		panel_4.add(lb1_panel4);

		JLabel lb2_panel4 = new JLabel("\u0110\u01A1n v\u1ECB \u0111\u00E0o t\u1EA1o");
		lb2_panel4.setHorizontalAlignment(SwingConstants.RIGHT);
		lb2_panel4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb2_panel4.setBounds(10, 130, 100, 25);
		panel_4.add(lb2_panel4);

		JLabel lb3_panel4 = new JLabel("Th\u1EDDi gian");
		lb3_panel4.setHorizontalAlignment(SwingConstants.RIGHT);
		lb3_panel4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb3_panel4.setBounds(10, 180, 100, 25);
		panel_4.add(lb3_panel4);

		JLabel lb4_panel4 = new JLabel("Chuy\u00EAn ng\u00E0nh");
		lb4_panel4.setHorizontalAlignment(SwingConstants.RIGHT);
		lb4_panel4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb4_panel4.setBounds(10, 230, 100, 25);
		panel_4.add(lb4_panel4);

		JLabel lb5_panel4 = new JLabel("Lo\u1EA1i t\u1ED1t nghi\u1EC7p");
		lb5_panel4.setHorizontalAlignment(SwingConstants.RIGHT);
		lb5_panel4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb5_panel4.setBounds(10, 280, 100, 25);
		panel_4.add(lb5_panel4);

		txtTrinhdo = new JTextField();
		txtTrinhdo.setColumns(10);
		txtTrinhdo.setBorder(null);
		txtTrinhdo.setBounds(145, 83, 250, 20);
		panel_4.add(txtTrinhdo);

		txtDonvidaotao = new JTextField();
		txtDonvidaotao.setColumns(10);
		txtDonvidaotao.setBorder(null);
		txtDonvidaotao.setBounds(145, 133, 250, 20);
		panel_4.add(txtDonvidaotao);

		JButton btnLuu_panel4 = new JButton("L\u01B0u");
		btnLuu_panel4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLuu_panel4.setBorder(null);
		btnLuu_panel4.setBackground(new Color(220, 20, 60));
		btnLuu_panel4.setBounds(145, 358, 89, 35);
		panel_4.add(btnLuu_panel4);

		JLabel lb6_panel4 = new JLabel("T\u1EEB");
		lb6_panel4.setBounds(145, 186, 22, 14);
		panel_4.add(lb6_panel4);

		JComboBox cbbTu_panel4 = new JComboBox(time);
		cbbTu_panel4.setBounds(166, 182, 68, 22);
		panel_4.add(cbbTu_panel4);

		JLabel lb7_panel4 = new JLabel("\u0110\u1EBFn");
		lb7_panel4.setBounds(271, 186, 25, 14);
		panel_4.add(lb7_panel4);

		JComboBox cbbDen_panel4 = new JComboBox(time);
		cbbDen_panel4.setBounds(300, 182, 68, 22);
		panel_4.add(cbbDen_panel4);

		txtChuyennganh = new JTextField();
		txtChuyennganh.setColumns(10);
		txtChuyennganh.setBorder(null);
		txtChuyennganh.setBounds(145, 233, 250, 20);
		panel_4.add(txtChuyennganh);
		
		String Trinhdo[] = {
				"Gioi",
				"Kha",
				"Trung Binh",
				"Yeu"
		};
		JComboBox cbbLoaitotnghiep = new JComboBox(Trinhdo);
		cbbLoaitotnghiep.setBounds(145, 282, 250, 22);
		panel_4.add(cbbLoaitotnghiep);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_5);

		JLabel lb1_panel5 = new JLabel("Ngo\u1EA1i ng\u1EEF & Tin h\u1ECDc");
		lb1_panel5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb1_panel5.setBounds(145, 11, 149, 35);
		panel_5.add(lb1_panel5);

		JLabel lb2_panel5 = new JLabel("Ngo\u1EA1i ng\u1EEF");
		lb2_panel5.setHorizontalAlignment(SwingConstants.RIGHT);
		lb2_panel5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb2_panel5.setBounds(10, 80, 100, 25);
		panel_5.add(lb2_panel5);

		JLabel lb3_panel5 = new JLabel("Tr\u00ECnh \u0111\u1ED9");
		lb3_panel5.setHorizontalAlignment(SwingConstants.RIGHT);
		lb3_panel5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb3_panel5.setBounds(10, 130, 100, 25);
		panel_5.add(lb3_panel5);

		JButton btnLuu_panel5 = new JButton("L\u01B0u");
		btnLuu_panel5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLuu_panel5.setBorder(null);
		btnLuu_panel5.setBackground(new Color(220, 20, 60));
		btnLuu_panel5.setBounds(145, 414, 89, 35);
		panel_5.add(btnLuu_panel5);

		JLabel lb4_panel5 = new JLabel("B\u1EB1ng c\u1EA5p");
		lb4_panel5.setHorizontalAlignment(SwingConstants.RIGHT);
		lb4_panel5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb4_panel5.setBounds(10, 180, 100, 25);
		panel_5.add(lb4_panel5);
		
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
		JComboBox cbbBangcap = new JComboBox(Bangcap);
		cbbBangcap.setBounds(145, 182, 250, 22);
		panel_5.add(cbbBangcap);

		JLabel lbNgngu = new JLabel("Ngo\u1EA1i ng\u1EEF");
		lbNgngu.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lbNgngu.setBounds(20, 55, 90, 14);
		panel_5.add(lbNgngu);

		JLabel lblTinHc = new JLabel("Tin h\u1ECDc");
		lblTinHc.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblTinHc.setBounds(20, 231, 90, 14);
		panel_5.add(lblTinHc);

		JLabel lb6_panel5 = new JLabel("Tin h\u1ECDc v\u0103n ph\u00F2ng");
		lb6_panel5.setBounds(10, 256, 120, 14);
		panel_5.add(lb6_panel5);

		JLabel lb7_panel5 = new JLabel("Ph\u1EA7n m\u1EC1m kh\u00E1c");
		lb7_panel5.setHorizontalAlignment(SwingConstants.RIGHT);
		lb7_panel5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb7_panel5.setBounds(10, 357, 100, 25);
		panel_5.add(lb7_panel5);

		JScrollPane scrollPane_Panel5 = new JScrollPane();
		scrollPane_Panel5.setBounds(145, 357, 250, 47);
		panel_5.add(scrollPane_Panel5);

		JTextArea txtareaPhanmemkhac = new JTextArea();
		scrollPane_Panel5.setViewportView(txtareaPhanmemkhac);

		JCheckBox chckboxMsWord = new JCheckBox("MS Word");
		chckboxMsWord.setBounds(20, 286, 120, 23);
		panel_5.add(chckboxMsWord);

		JCheckBox chckbxMsExcel = new JCheckBox("MS Excel");
		chckbxMsExcel.setBounds(160, 286, 120, 23);
		panel_5.add(chckbxMsExcel);

		JCheckBox chckbxMsPowerPoint = new JCheckBox("MS Power Point");
		chckbxMsPowerPoint.setBounds(20, 312, 120, 23);
		panel_5.add(chckbxMsPowerPoint);

		JCheckBox chckbxMsOutlook = new JCheckBox("MS Outlook");
		chckbxMsOutlook.setBounds(160, 312, 120, 23);
		panel_5.add(chckbxMsOutlook);

		String Ngoaingu[] = {
				"Anh",
				"Nhat",
				"Phap",
				"Y"
		};
		JComboBox cbbNgoaingu = new JComboBox(Ngoaingu);
		cbbNgoaingu.setBounds(145, 82, 250, 22);
		panel_5.add(cbbNgoaingu);

		JComboBox cbbTrinhdo = new JComboBox(Trinhdo);
		cbbTrinhdo.setBounds(145, 132, 250, 22);
		panel_5.add(cbbTrinhdo);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 434, 460);
		layeredPane.add(panel_6);

		JLabel lb_panel6 = new JLabel("K\u1EF9 n\u0103ng c\u00E1 nh\u00E2n");
		lb_panel6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb_panel6.setBounds(145, 11, 149, 35);
		panel_6.add(lb_panel6);

		JLabel lb1_panel6 = new JLabel("K\u1EF9 n\u0103ng/S\u1EDF tr\u01B0\u1EDDng");
		lb1_panel6.setHorizontalAlignment(SwingConstants.RIGHT);
		lb1_panel6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb1_panel6.setBounds(0, 80, 130, 25);
		panel_6.add(lb1_panel6);

		JButton btnLuu_panel6 = new JButton("L\u01B0u");
		btnLuu_panel6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLuu_panel6.setBorder(null);
		btnLuu_panel6.setBackground(new Color(220, 20, 60));
		btnLuu_panel6.setBounds(145, 414, 89, 35);
		panel_6.add(btnLuu_panel6);

		JLabel lb2_panel6 = new JLabel("S\u1EDF th\u00EDch");
		lb2_panel6.setHorizontalAlignment(SwingConstants.RIGHT);
		lb2_panel6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb2_panel6.setBounds(10, 212, 100, 25);
		panel_6.add(lb2_panel6);

		JCheckBox chckbxLanhdao = new JCheckBox("L\u00E3nh \u0111\u1EA1o");
		chckbxLanhdao.setBounds(33, 112, 120, 23);
		panel_6.add(chckbxLanhdao);

		JCheckBox chckbxGiaiquyetvande = new JCheckBox("Gi\u1EA3i quy\u1EBFt v\u1EA5n \u0111\u1EC1");
		chckbxGiaiquyetvande.setBounds(33, 138, 120, 23);
		panel_6.add(chckbxGiaiquyetvande);

		JCheckBox chckbxQuanlythoigian = new JCheckBox("Qu\u1EA3n l\u00FD th\u1EDDi gian");
		chckbxQuanlythoigian.setBounds(33, 164, 120, 23);
		panel_6.add(chckbxQuanlythoigian);

		JCheckBox chckbxLamviecnhom = new JCheckBox("L\u00E0m vi\u1EC7c nh\u00F3m");
		chckbxLamviecnhom.setBounds(165, 112, 120, 23);
		panel_6.add(chckbxLamviecnhom);

		JCheckBox chckbxQuanlynhanluc = new JCheckBox("Qu\u1EA3n l\u00FD nh\u00E2n l\u1EF1c");
		chckbxQuanlynhanluc.setBounds(165, 138, 120, 23);
		panel_6.add(chckbxQuanlynhanluc);

		JCheckBox chckbxQuanlyduan = new JCheckBox("Qu\u1EA3n l\u00FD d\u1EF1 \u00E1n");
		chckbxQuanlyduan.setBounds(165, 164, 120, 23);
		panel_6.add(chckbxQuanlyduan);

		JCheckBox chckbxChienluoc = new JCheckBox("Ra chi\u1EBFn l\u01B0\u1EE3c");
		chckbxChienluoc.setBounds(295, 112, 120, 23);
		panel_6.add(chckbxChienluoc);

		JCheckBox chckbxGiaotiep = new JCheckBox("Giao ti\u1EBFp");
		chckbxGiaotiep.setBounds(295, 138, 120, 23);
		panel_6.add(chckbxGiaotiep);

		JCheckBox chckbxSangtao = new JCheckBox("S\u00E1ng t\u1EA1o");
		chckbxSangtao.setBounds(295, 164, 120, 23);
		panel_6.add(chckbxSangtao);

		JScrollPane scrollPane_panel6 = new JScrollPane();
		scrollPane_panel6.setBounds(145, 212, 240, 59);
		panel_6.add(scrollPane_panel6);

		JTextArea txtareaSothich = new JTextArea();
		scrollPane_panel6.setViewportView(txtareaSothich);

		JLabel panel3_panel6 = new JLabel("K\u1EF9 n\u0103ng kh\u00E1c");
		panel3_panel6.setHorizontalAlignment(SwingConstants.RIGHT);
		panel3_panel6.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel3_panel6.setBounds(10, 306, 100, 25);
		panel_6.add(panel3_panel6);

		JScrollPane scrollPane1_panel6 = new JScrollPane();
		scrollPane1_panel6.setBounds(145, 306, 240, 59);
		panel_6.add(scrollPane1_panel6);

		JTextArea txtareaKynang = new JTextArea();
		scrollPane1_panel6.setViewportView(txtareaKynang);
		
		panel_1.setVisible(true);
		panel_2.setVisible(false);
		panel_3.setVisible(false);
		panel_4.setVisible(false);
		panel_5.setVisible(false);
		panel_6.setVisible(false);
		
		if (IDHS == 0) {
			txtHoten.setText("");
			txtSdt.setText("");
			txtDiachi.setText("");
			txtMucluong.setText("");
			txtSotien.setText("");
			txareaMuctieu.setText("");
			txtDoanhnghiep.setText("");
			txtareaMotaCV.setText("");
			txtTrinhdo.setText("");
			txtDonvidaotao.setText("");
			txtChuyennganh.setText("");
			txtareaPhanmemkhac.setText("");
			txtareaSothich.setText("");
			txtareaKynang.setText("");
			Date date = null;
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse("1/1/2001");
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			datechooserNS.setDate(date);
			cbbThanhpho.setSelectedIndex(-1);
			cbbKinhnghiem.setSelectedIndex(-1);
			cbbVitrihientai.setSelectedIndex(-1);
			cbbVitrimongmuon.setSelectedIndex(-1);
			cbbNoilamviec_panel3.setSelectedIndex(-1);
			cbbNoilamviec.setSelectedIndex(-1);
			cbbTu_panel3.setSelectedIndex(-1);
			cbbDen_panel3.setSelectedIndex(-1);
			cbbTu_panel4.setSelectedIndex(-1);
			cbbDen_panel4.setSelectedIndex(-1);
			cbbDonvitien.setSelectedIndex(-1);
			cbbLoaitotnghiep.setSelectedIndex(-1);
			cbbNgoaingu.setSelectedIndex(-1);
			cbbTrinhdo.setSelectedIndex(-1);
			cbbBangcap.setSelectedIndex(-1);
			rdbtn_male.isSelected();
		} else {
			HO_SO hs = BLL_Timviec.Instance().GetHSbyIDHS(IDHS);
			TAI_KHOAN tk = BLL_Timviec.Instance().GetTKbyID(hs.getId());
			DIA_CHI dc = BLL_Timviec.Instance().GetDCbyID(hs.getId_DC());
			BANG_CAP bc = BLL_Timviec.Instance().GetBCbyID(hs.getId_BC());
			KI_NANG kn = BLL_Timviec.Instance().GetKNbyID(hs.getId_KN());
			NN_TH nt = BLL_Timviec.Instance().GetNTbyID(hs.getIdNN_TH());
			txtHoten.setText(hs.getFullname());
			txtSdt.setText(Integer.toString(tk.getSdt()));
			txtDiachi.setText(dc.getDiaChiChiTiet());
			txtMucluong.setText(Integer.toString(hs.getMucLuongMongMuon()));
			txtSotien.setText(Integer.toString(hs.getMucLuong()));
			txareaMuctieu.setText(hs.getMucTieuCV());
			txtDoanhnghiep.setText(hs.getTenCongTyDangLam());
			txtareaMotaCV.setText(hs.getMoTaCV());
			txtTrinhdo.setText(bc.getTrinhDo());
			txtDonvidaotao.setText(bc.getDonViDaoTao());
			txtChuyennganh.setText(bc.getChuyenNganh());
			txtareaPhanmemkhac.setText(nt.getPhanMemKhac());
			txtareaSothich.setText(kn.getSoThich());
			txtareaKynang.setText(kn.getKyNangKhac());
			Date date = new java.sql.Date(hs.getNgaySinh().getTime());
			datechooserNS.setDate(date);
			
			cbbThanhpho.setSelectedItem(dc.getTinh());
			cbbKinhnghiem.setSelectedItem(hs.getKinhNghiem());
			cbbVitrihientai.setSelectedItem(hs.getViTriHienTai());
			cbbVitrimongmuon.setSelectedItem(hs.getViTriMongMuon());
			cbbNoilamviec_panel3.setSelectedIndex(-1);
			cbbNoilamviec.setSelectedIndex(-1);
			cbbTu_panel3.setSelectedItem(hs.getThoiGianBatDauLam());
			cbbDen_panel3.setSelectedItem(hs.getThoiGianKetThucLam());
			cbbTu_panel4.setSelectedItem(bc.getThoiGianBatDau());
			cbbDen_panel4.setSelectedItem(bc.getThoiGianKetThuc());
			cbbDonvitien.setSelectedIndex(0);
			cbbLoaitotnghiep.setSelectedItem(bc.getLoaiTotNghiep());
			cbbNgoaingu.setSelectedItem(nt.getLoaiNgonNgu());
			cbbTrinhdo.setSelectedItem(nt.getTrinhDo());
			cbbBangcap.setSelectedItem(nt.getBangCap());
			if(hs.getGioiTinh() == true) {
				rdbtn_male.isSelected();
			} else {
				rdbtn_female.isSelected();
			}
		}
		
		JButton btnThongtinTaikhoan = new JButton("Th\u00F4ng tin t\u00E0i kho\u1EA3n");
		btnThongtinTaikhoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
			}
		});
		btnThongtinTaikhoan.setBackground(new Color(30, 144, 255));
		btnThongtinTaikhoan.setBorder(null);
		btnThongtinTaikhoan.setForeground(new Color(255, 255, 255));
		btnThongtinTaikhoan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThongtinTaikhoan.setBounds(0, 0, 180, 76);
		panel.add(btnThongtinTaikhoan);

		JButton btnThongtinchung = new JButton("Th\u00F4ng tin chung");
		btnThongtinchung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
			}
		});
		btnThongtinchung.setForeground(Color.WHITE);
		btnThongtinchung.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThongtinchung.setBorder(null);
		btnThongtinchung.setBackground(new Color(30, 144, 255));
		btnThongtinchung.setBounds(0, 76, 180, 76);
		panel.add(btnThongtinchung);

		JButton btnKinhnghiem = new JButton("Kinh nghi\u1EC7m");
		btnKinhnghiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
			}
		});
		btnKinhnghiem.setForeground(Color.WHITE);
		btnKinhnghiem.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnKinhnghiem.setBorder(null);
		btnKinhnghiem.setBackground(new Color(30, 144, 255));
		btnKinhnghiem.setBounds(0, 152, 180, 76);
		panel.add(btnKinhnghiem);

		JButton btnTrinhdoBangcap = new JButton("Tr\u00ECnh \u0111\u1ED9 & B\u1EB1ng c\u1EA5p");
		btnTrinhdoBangcap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(true);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
			}
		});
		btnTrinhdoBangcap.setForeground(Color.WHITE);
		btnTrinhdoBangcap.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTrinhdoBangcap.setBorder(null);
		btnTrinhdoBangcap.setBackground(new Color(30, 144, 255));
		btnTrinhdoBangcap.setBounds(0, 228, 180, 76);
		panel.add(btnTrinhdoBangcap);

		JButton btnNgoainguTinhoc = new JButton("Ngo\u1EA1i ng\u1EEF & Tin h\u1ECDc");
		btnNgoainguTinhoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(true);
				panel_6.setVisible(false);
			}
		});
		btnNgoainguTinhoc.setForeground(Color.WHITE);
		btnNgoainguTinhoc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNgoainguTinhoc.setBorder(null);
		btnNgoainguTinhoc.setBackground(new Color(30, 144, 255));
		btnNgoainguTinhoc.setBounds(0, 304, 180, 76);
		panel.add(btnNgoainguTinhoc);

		JButton btnKynangcanhan = new JButton("K\u1EF9 n\u0103ng c\u00E1 nh\u00E2n");
		btnKynangcanhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(true);
			}
		});
		btnKynangcanhan.setForeground(Color.WHITE);
		btnKynangcanhan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnKynangcanhan.setBorder(null);
		btnKynangcanhan.setBackground(new Color(30, 144, 255));
		btnKynangcanhan.setBounds(0, 380, 180, 76);
		panel.add(btnKynangcanhan);

		btnLuu_panel1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = false;
				do {
					if (cbbNgoaingu.getSelectedIndex() == -1 || cbbTrinhdo.getSelectedIndex() == -1
							|| cbbBangcap.getSelectedIndex() == -1 || txtHoten.getText() == null
							|| datechooserNS == null || cbbKinhnghiem.getSelectedIndex() == -1
							|| cbbVitrihientai.getSelectedIndex() == -1 || cbbVitrimongmuon.getSelectedIndex() == -1
							|| cbbNoilamviec.getSelectedIndex() == -1) {
						System.out.println("nhap lai");
						check = true;
						break;
					} else {
						check = false;
					}

					HO_SO hs = new HO_SO();
					hs.setId(IDHS);
					// panel1 thong tin tai khoan
					hs.setFullname(txtHoten.getText());
					TAI_KHOAN tk = new TAI_KHOAN();
					tk.setSdt(Integer.parseInt(txtSdt.getText()));
					hs.setNgaySinh(new java.sql.Date(datechooserNS.getDate().getTime()));
					if (rdbtn_female.isSelected()) {
						hs.setGioiTinh(true);
					} else {
						hs.setGioiTinh(false);
					}
					DIA_CHI dc = new DIA_CHI();
					dc.setTinh((String) cbbThanhpho.getSelectedItem());
					dc.setDiaChiChiTiet(txtDiachi.getText());
					hs.setId_DC(dc.getId());
					// panel2 thong tin chung
					hs.setKinhNghiem((String) cbbKinhnghiem.getSelectedItem());
					hs.setViTriHienTai((String) cbbVitrihientai.getSelectedItem());
					hs.setViTriMongMuon((String) cbbVitrimongmuon.getSelectedItem());
					hs.setMucLuongMongMuon(Integer.parseInt(txtMucluong.getText()));
					hs.setNoiLamViec((String) cbbNoilamviec.getSelectedItem());
					hs.setMucTieuCV(txareaMuctieu.getText());
					// panel3 kinh nghiem
					hs.setTenCongTyDangLam(txtDoanhnghiep.getText());
					hs.setNoiLamViec((String) cbbNoilamviec_panel3.getSelectedItem());
					try {
						hs.setThoiGianBatDauLam(new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy")
								.parse((String) cbbTu_panel3.getSelectedItem()).getTime()));
						hs.setThoiGianKetThucLam(new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy")
								.parse((String) cbbDen_panel3.getSelectedItem()).getTime()));
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
						if(cbbDonvitien.getSelectedIndex() == 0) {
							hs.setMucLuong(Integer.parseInt(txtSotien.getText())*23061);
						}
					hs.setMoTaCV(txtareaMotaCV.getText());
					// panel4 Trinh do va bang cap
					BANG_CAP bc = new BANG_CAP();
					bc.setTrinhDo(txtTrinhdo.getText());
					bc.setDonViDaoTao(txtDonvidaotao.getText());
					try {
						bc.setThoiGianBatDau(new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy")
								.parse((String) cbbTu_panel4.getSelectedItem()).getTime()));
						bc.setThoiGianKetThuc(new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy")
								.parse((String) cbbDen_panel4.getSelectedItem()).getTime()));
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					bc.setLoaiTotNghiep((String) cbbLoaitotnghiep.getSelectedItem());
					bc.setChuyenNganh(txtChuyennganh.getText());
					hs.setId_BC(bc.getId());
					// panel5 Ngoai ngu va tin hoc
					NN_TH nt = new NN_TH();
					nt.setTrinhDo((String) cbbTrinhdo.getSelectedItem());
					nt.setLoaiNgonNgu((String) cbbNgoaingu.getSelectedItem());
					nt.setBangCap((String) cbbBangcap.getSelectedItem());
					if (chckboxMsWord.isSelected()) {
						nt.setWord(true);
					} else {
						nt.setWord(false);
					}
					if (chckbxMsExcel.isSelected()) {
						nt.setExcel(true);
					} else {
						nt.setExcel(false);
					}

					if (chckbxMsOutlook.isSelected()) {
						nt.setOutLook(true);
					} else {
						nt.setOutLook(false);
					}
					if (chckbxMsPowerPoint.isSelected()) {
						nt.setPowerPoint(true);
					} else {
						nt.setPowerPoint(false);
					}
					nt.setPhanMemKhac(txtareaPhanmemkhac.getText());
					hs.setIdNN_TH(nt.getId());
					// panel6 Ky nang ca nhan
					KI_NANG kn = new KI_NANG();
					if (chckbxGiaotiep.isSelected()) {
						kn.setGiaoTiep(true);
					} else {
						kn.setGiaoTiep(false);
					}
					if (chckbxGiaiquyetvande.isSelected()) {
						kn.setGiaiQuyetVD(true);
					} else {
						kn.setGiaiQuyetVD(false);
					}
					if (chckbxLanhdao.isSelected()) {
						kn.setLanhDao(true);
					} else {
						kn.setLanhDao(false);
					}
					if (chckbxLamviecnhom.isSelected()) {
						kn.setLamViecNhom(true);
					} else {
						kn.setLamViecNhom(false);
					}
					if (chckbxChienluoc.isSelected()) {
						kn.setRaChienLuoc(true);
					} else {
						kn.setRaChienLuoc(false);
					}
					if (chckbxQuanlynhanluc.isSelected()) {
						kn.setQuanLyNhanLuc(true);
					} else {
						kn.setQuanLyNhanLuc(false);
					}
					if (chckbxQuanlyduan.isSelected()) {
						kn.setQuanLyDuAn(true);
					} else {
						kn.setQuanLyDuAn(false);
					}
					if (chckbxQuanlythoigian.isSelected()) {
						kn.setQuanLyThoiGian(true);
					} else {
						kn.setQuanLyThoiGian(false);
					}
					if (chckbxSangtao.isSelected()) {
						kn.setSangTao(true);
					} else {
						kn.setSangTao(false);
					}
					kn.setSoThich(txtareaSothich.getText());
					kn.setKyNangKhac(txtareaKynang.getText());
					hs.setId_KN(kn.getId());
					BLL_Timviec.Instance().ExecuteDB(hs, bc, dc, kn, nt, tk);
//						System.exit(0);

				} while (check == true);
			}
		});
	}
}
