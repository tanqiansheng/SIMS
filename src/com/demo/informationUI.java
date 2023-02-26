/*
 * informationUI.java
 *
 * Created on __DATE__, __TIME__
 */

package com.demo;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import util.ObjUtil;

import com.demo.db.DbUtil;

import domain.User;
import domain.Userinfo;

/**
 *
 * @author  __USER__
 */

public class informationUI extends javax.swing.JFrame {

	/** Creates new form informationUI */
	public informationUI() {
		initComponents();
		this.setLocationRelativeTo(null);
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.put("RootPane.setupButtonVisible", false);
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.osLookAndFeelDecorated;

		} catch (Exception e) {
			// TODO: handle exception
		}
		Font font = new Font("Dialog", Font.PLAIN, 12);
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource)
				;
			UIManager.put(font, value);
		}
		flushtable();
		//写填充内容，从数据库中查询类容
		/*Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "select * from userinfo";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			//school  academy uname sex  sid  
			//personid    classid classcode major lang
			ArrayList<Userinfo> users = new ArrayList<Userinfo>();
			while (rs.next()) {
				String school = rs.getString("school");
				String academy = rs.getString("academy");
				String uname = rs.getString("uname");
				String sex = rs.getString("sex");
				String sid = rs.getString("sid");
				String personid = rs.getString("personid");
				String classid = rs.getString("classid");
				String classcode = rs.getString("classcode");
				String major = rs.getString("major");
				String lang = rs.getString("lang");
				Userinfo userInfo = new Userinfo(school, academy, uname, sex,
						sid, personid, classid, classcode, major, lang);
				users.add(userInfo);

			}
			//将查询出来的语句,填充到table中
			//获得的table对象
			DefaultTableModel dtm = (DefaultTableModel) this.stuTable
					.getModel();
			dtm.setRowCount(0);
			if (users.size() > 0)
				for (Userinfo userinfo : users) {
					Vector vector = new Vector();
					vector.add(userinfo.getSchool());
					vector.add(userinfo.getAcademy());
					vector.add(userinfo.getUname());
					vector.add(userinfo.getSex());
					vector.add(userinfo.getSid());
					vector.add(userinfo.getPersonid());
					vector.add(userinfo.getClassid());
					vector.add(userinfo.getClasscode());
					vector.add(userinfo.getMajor());
					vector.add(userinfo.getLang());
					dtm.addRow(vector);

				}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DbUtil.release(conn, ps, rs);

		}*/

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		button1 = new java.awt.Button();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		cxTxt = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		stuTable = new javax.swing.JTable();
		jLabel6 = new javax.swing.JLabel();
		sexTxt = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		sidTxt = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		personidTxt = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		schoolTxt = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		accademyTxt = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		unameTxt = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		langTxt = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		classidTxt = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		classcodeTxt = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jLabel11 = new javax.swing.JLabel();
		majorTxt = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		label1 = new java.awt.Label();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		xc = new javax.swing.JComboBox();
		xbc = new javax.swing.JComboBox();
		xxc = new javax.swing.JComboBox();
		njc = new javax.swing.JComboBox();
		zyc = new javax.swing.JComboBox();
		bjc = new javax.swing.JComboBox();
		bk = new javax.swing.JComboBox();

		button1.setLabel("button1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				formMousePressed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("华文行楷", 3, 48));
		jLabel2.setForeground(new java.awt.Color(51, 51, 255));
		jLabel2.setText("\u6821\u5bf9\u540d\u518c\u754c\u9762");

		jLabel1.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel1
				.setText("\u6839\u636e\u5b66\u751f\u59d3\u540d\u67e5\u627e\u4fe1\u606f\uff1a");

		cxTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cxTxtActionPerformed(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("华文行楷", 3, 15));
		jButton1.setForeground(new java.awt.Color(51, 51, 0));
		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		stuTable.setFont(new java.awt.Font("隶书", 0, 15));
		stuTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "学校", "院系", "姓名", "性别", "学号", "身份证", "年级",
						"班级代码", "专业", "报考语种" }) {
			Class[] types = new Class[] { java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.Object.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		stuTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				stuTableMousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(stuTable);

		jLabel6.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel6.setText("\u6027\u522b");

		sexTxt.setFont(new java.awt.Font("隶书", 0, 18));
		sexTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sexTxtActionPerformed(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel7.setText("\u5b66\u53f7");

		sidTxt.setFont(new java.awt.Font("隶书", 0, 18));
		sidTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sidTxtActionPerformed(evt);
			}
		});

		jLabel8.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel8.setText("\u8eab\u4efd\u8bc1");

		personidTxt.setFont(new java.awt.Font("隶书", 0, 18));
		personidTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel3.setText("\u5b66\u6821");

		schoolTxt.setFont(new java.awt.Font("隶书", 0, 18));
		schoolTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				schoolTxtActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel4.setText("\u9662\u7cfb");

		accademyTxt.setFont(new java.awt.Font("隶书", 0, 18));
		accademyTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				accademyTxtActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel5.setText("\u59d3\u540d");

		unameTxt.setFont(new java.awt.Font("隶书", 0, 18));
		unameTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				unameTxtActionPerformed(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel12.setText("\u62a5\u8003\u8bed\u79cd");

		langTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				langTxtActionPerformed(evt);
			}
		});

		jLabel9.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel9.setText("\u5e74\u7ea7");

		classidTxt.setFont(new java.awt.Font("隶书", 0, 18));
		classidTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				classidTxtActionPerformed(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel10.setText("\u73ed\u7ea7\u4ee3\u7801");

		classcodeTxt.setFont(new java.awt.Font("隶书", 0, 18));
		classcodeTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("华文行楷", 3, 15));
		jButton2.setText("\u4fee\u6539");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("隶书", 0, 18));
		jLabel11.setText("\u4e13\u4e1a");

		majorTxt.setFont(new java.awt.Font("隶书", 0, 18));
		majorTxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				majorTxtActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("华文行楷", 3, 15));
		jButton3.setText("\u5220\u9664");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setFont(new java.awt.Font("华文行楷", 3, 15));
		jButton4.setText("\u589e\u52a0");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		label1.setFont(new java.awt.Font("方正粗黑宋简体", 3, 12));
		label1.setText("\u5f00\u53d1\u8005\uff1a\u8c2d\u831c\u5347");

		jButton5.setFont(new java.awt.Font("华文行楷", 3, 15));
		jButton5.setText("\u8fd4\u56de");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setFont(new java.awt.Font("华文行楷", 3, 15));
		jButton6.setForeground(new java.awt.Color(51, 51, 0));
		jButton6.setText("\u8fd4\u56de\u67e5\u8be2");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		xc.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"请选择学院", "计算机学院", "数学学院", "电子学院", "人文学院" }));
		xc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xcActionPerformed(evt);
			}
		});

		xbc.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"请选择性别", "男", "女" }));
		xbc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xbcActionPerformed(evt);
			}
		});

		xxc.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"请选择学校", "重庆城市管理职业学院", "重庆科技大学", "重庆大学", "重庆医科大学", "重庆电子工程学院",
				"四川美术学院", "重庆邮电大学", "西南政法大学" }));
		xxc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xxcActionPerformed(evt);
			}
		});

		njc.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"请选择年级", "19级", "18级", "17级", "16级", "15级", "14级" }));
		njc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				njcActionPerformed(evt);
			}
		});

		zyc
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"请选择专业", "软件技术", "物联网", "大数据", "会记", "护理", "医药", "社体",
						"社会工作" }));
		zyc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				zycActionPerformed(evt);
			}
		});

		bjc.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"请选择班级代码", "100", "101", "102", "1003", "1004" }));
		bjc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bjcActionPerformed(evt);
			}
		});

		bk.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"请选择报考语种", "英语", "汉语", "德语", "法语", "日语", "西班牙语" }));
		bk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bkActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(96, 96, 96)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												cxTxt,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(135, 135, 135).addComponent(
												jButton1).addGap(102, 102, 102)
										.addComponent(jButton6)
										.addContainerGap(333, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										530, Short.MAX_VALUE).addComponent(
										jLabel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										320,
										javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(332, 332, 332))
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(27, 27, 27)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel12)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				langTxt,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				117,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				26,
																				26,
																				26)
																		.addComponent(
																				bk,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				141,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel9)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jLabel3))
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								classidTxt)
																						.addComponent(
																								schoolTxt,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								93,
																								Short.MAX_VALUE)
																						.addComponent(
																								sexTxt,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								123,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				26,
																				26,
																				26)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								njc,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								141,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																										.addComponent(
																												xbc,
																												javax.swing.GroupLayout.Alignment.LEADING,
																												0,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												xxc,
																												javax.swing.GroupLayout.Alignment.LEADING,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												139,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addGap(49, 49, 49)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel4)
																						.addGap(
																								28,
																								28,
																								28))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				layout
																						.createSequentialGroup()
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jButton4)
																										.addComponent(
																												jLabel10))
																						.addGap(
																								19,
																								19,
																								19)))
														.addComponent(jLabel11))
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												majorTxt)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																						.addComponent(
																								accademyTxt,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								125,
																								Short.MAX_VALUE)
																						.addComponent(
																								classcodeTxt,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								126,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				49,
																				49,
																				49)
																		.addComponent(
																				jButton2)))
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				39,
																				39,
																				39)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								bjc,
																								0,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								zyc,
																								0,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								xc,
																								0,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				95,
																				95,
																				95)
																		.addComponent(
																				jButton3)))
										.addGap(93, 93, 93)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton5)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jLabel5)
																										.addComponent(
																												jLabel7))
																						.addComponent(
																								jLabel8))
																		.addGap(
																				54,
																				54,
																				54)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								unameTxt)
																						.addComponent(
																								personidTxt)
																						.addComponent(
																								sidTxt,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								101,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGap(50, 50, 50)).addGroup(
								layout.createSequentialGroup().addGap(115, 115,
										115).addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										969,
										javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(98, Short.MAX_VALUE))
						.addGroup(
								layout.createSequentialGroup().addComponent(
										label1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										169, Short.MAX_VALUE).addGap(1013,
										1013, 1013)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel1)
																		.addComponent(
																				cxTxt,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jButton1)
																		.addComponent(
																				jButton6)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												213,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				layout
																						.createSequentialGroup()
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addGap(
																																62,
																																62,
																																62)
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.BASELINE)
																																		.addComponent(
																																				jLabel4)
																																		.addComponent(
																																				accademyTxt,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addComponent(
																																				xc,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																														.addComponent(
																																zyc,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGap(
																																3,
																																3,
																																3)
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.BASELINE)
																																		.addComponent(
																																				jLabel10)
																																		.addComponent(
																																				classcodeTxt,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addComponent(
																																				bjc,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addGap(
																																37,
																																37,
																																37))
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												layout
																														.createSequentialGroup()
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.BASELINE)
																																		.addComponent(
																																				jLabel11)
																																		.addComponent(
																																				majorTxt,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addGap(
																																69,
																																69,
																																69))))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				layout
																						.createSequentialGroup()
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																								6,
																								Short.MAX_VALUE)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(
																												jLabel5)
																										.addComponent(
																												unameTxt,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addComponent(
																																personidTxt,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																sidTxt,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel8)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel7)))
																						.addGap(
																								35,
																								35,
																								35)))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												schoolTxt,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												sexTxt,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												classidTxt,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												3,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												xxc,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												xbc,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												njc,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addGap(
																																66,
																																66,
																																66)
																														.addComponent(
																																jLabel9))
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel3)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jLabel6)
																														.addGap(
																																27,
																																27,
																																27))))
																		.addGap(
																				41,
																				41,
																				41)))
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel12)
														.addComponent(jButton4)
														.addComponent(
																bk,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton2)
														.addComponent(jButton5)
														.addComponent(jButton3)
														.addComponent(
																langTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(30, 30, 30)
										.addComponent(
												label1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												28,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(29, 29, 29)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void bkActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String item = (String) bk.getSelectedItem();
		if ("请选择报考语种".equals(item)) {
			langTxt.setText("");
		} else {
			langTxt.setText(item);
		}
	}

	private void bjcActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String item = (String) bjc.getSelectedItem();
		if ("请选择班级代码".equals(item)) {
			classcodeTxt.setText("");
		} else {
			classcodeTxt.setText(item);
		}

	}

	private void zycActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String item = (String) zyc.getSelectedItem();
		if ("请选择专业".equals(item)) {
			majorTxt.setText("");
		} else {
			majorTxt.setText(item);
		}
	}

	private void njcActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String item = (String) njc.getSelectedItem();
		if ("请选择年级".equals(item)) {
			classidTxt.setText("");
		} else {
			classidTxt.setText(item);
		}

	}

	void xxcActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String item = (String) xxc.getSelectedItem();
		if ("请选择学校".equals(item)) {
			schoolTxt.setText("");
		} else {
			schoolTxt.setText(item);
		}
	}

	private void xbcActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String item = (String) xbc.getSelectedItem();
		if ("请选择性别".equals(item)) {
			sexTxt.setText("");
		} else {
			sexTxt.setText(item);
		}
	}

	//下拉菜单

	private void xcActionPerformed(java.awt.event.ActionEvent evt) {
		String item = (String) xc.getSelectedItem();
		if ("请选择学院".equals(item)) {
			accademyTxt.setText("");
		} else {
			accademyTxt.setText(item);
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		flushtable();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		turn tu = new turn();
		tu.setVisible(true);
		// TODO add your handling code here:
	}

	private void formMousePressed(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	//删除

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String school = schoolTxt.getText().trim();
		String academy = accademyTxt.getText().trim();
		String uname = new String(unameTxt.getText()).trim();
		String sex = new String(sexTxt.getText()).trim();
		String sid = new String(sidTxt.getText()).trim();
		String personid = new String(personidTxt.getText()).trim();
		String classid = new String(classidTxt.getText()).trim();
		String classcode = new String(classcodeTxt.getText()).trim();
		String major = new String(majorTxt.getText()).trim();
		String lang = new String(langTxt.getText()).trim();
		if (ObjUtil.isEmpty(sid)) {
			JOptionPane.showMessageDialog(null, "注意sid输入框不能为空");

			return;
		}
		Userinfo userInfo = new Userinfo(null, school, academy, uname, sex,
				sid, personid, classid, classcode, major, lang);
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "delete  from userinfo where sid=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, userInfo.getSid());

			int success = ps.executeUpdate();
			if (success > 0)
				JOptionPane.showMessageDialog(null, "删除成功");
			//System.out.print("增加成功");
			else
				JOptionPane.showMessageDialog(null, "删除失败");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DbUtil.release(conn, ps, null);
		}
		flushtable();
	}

	//修改
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String school = schoolTxt.getText().trim();
		String academy = accademyTxt.getText().trim();
		String uname = new String(unameTxt.getText()).trim();
		String sex = new String(sexTxt.getText()).trim();
		String sid = new String(sidTxt.getText()).trim();
		String personid = new String(personidTxt.getText()).trim();
		String classid = new String(classidTxt.getText()).trim();
		String classcode = new String(classcodeTxt.getText()).trim();
		String major = new String(majorTxt.getText()).trim();
		String lang = new String(langTxt.getText()).trim();
		if (ObjUtil.isEmpty(school) || ObjUtil.isEmpty(academy)
				|| ObjUtil.isEmpty(uname) || ObjUtil.isEmpty(sex)
				|| ObjUtil.isEmpty(sid) || ObjUtil.isEmpty(personid)
				|| ObjUtil.isEmpty(classid) || ObjUtil.isEmpty(classcode)
				|| ObjUtil.isEmpty(major) || ObjUtil.isEmpty(lang)) {
			JOptionPane.showMessageDialog(null, "注意输入框不能为空");

			return;
		}
		Userinfo userInfo = new Userinfo(null, school, academy, uname, sex,
				sid, personid, classid, classcode, major, lang);
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "update userinfo set school=?, academy=?, uname=?, sex=?, personid=?, classid=?, classcode=?, major=?, lang=? where sid=?";

			ps = conn.prepareStatement(sql);
			ps.setString(1, userInfo.getSchool());
			ps.setString(2, userInfo.getAcademy());
			ps.setString(3, userInfo.getUname());
			ps.setString(4, userInfo.getSex());
			ps.setString(5, userInfo.getPersonid());
			ps.setString(6, userInfo.getClassid());
			ps.setString(7, userInfo.getClasscode());
			ps.setString(8, userInfo.getMajor());
			ps.setString(9, userInfo.getLang());
			ps.setString(10, userInfo.getSid());
			int success = ps.executeUpdate();
			if (success > 0)
				JOptionPane.showMessageDialog(null, "修改成功");
			//System.out.print("增加成功");
			else
				JOptionPane.showMessageDialog(null, "修改失败");

		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "修改失败,不允许修改学号");
		} finally {
			DbUtil.release(conn, ps, null);
		}
		flushtable();
	}

	//添加
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String school = schoolTxt.getText().trim();
		String academy = accademyTxt.getText().trim();
		String uname = new String(unameTxt.getText()).trim();
		String sex = new String(sexTxt.getText()).trim();
		String sid = new String(sidTxt.getText()).trim();
		String personid = new String(personidTxt.getText()).trim();
		String classid = new String(classidTxt.getText()).trim();
		String classcode = new String(classcodeTxt.getText()).trim();
		String major = new String(majorTxt.getText()).trim();
		String lang = new String(langTxt.getText()).trim();
		if (ObjUtil.isEmpty(school) || ObjUtil.isEmpty(academy)
				|| ObjUtil.isEmpty(uname) || ObjUtil.isEmpty(sex)
				|| ObjUtil.isEmpty(sid) || ObjUtil.isEmpty(personid)
				|| ObjUtil.isEmpty(classid) || ObjUtil.isEmpty(classcode)
				|| ObjUtil.isEmpty(major) || ObjUtil.isEmpty(lang)) {

			return;
		}
		Userinfo userInfo = new Userinfo(null, school, academy, uname, sex,
				sid, personid, classid, classcode, major, lang);
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "insert into userinfo(school, academy, uname, sex,sid, personid, classid, classcode, major, lang) values (?,?,?,?,?,?,?,?,?,?)";

			ps = conn.prepareStatement(sql);
			ps.setString(1, userInfo.getSchool());
			ps.setString(2, userInfo.getAcademy());
			ps.setString(3, userInfo.getUname());
			ps.setString(4, userInfo.getSex());
			ps.setString(5, userInfo.getSid());
			ps.setString(6, userInfo.getPersonid());
			ps.setString(7, userInfo.getClassid());
			ps.setString(8, userInfo.getClasscode());
			ps.setString(9, userInfo.getMajor());
			ps.setString(10, userInfo.getLang());

			int success = ps.executeUpdate();
			if (success > 0) {
				JOptionPane.showMessageDialog(null, "添加成功");
				System.out.print("增加成功");
			} else
				JOptionPane.showMessageDialog(null, "添加失败");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DbUtil.release(conn, ps, null);
		}
		flushtable();
	}

	private void stuTableMousePressed(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int school = 0;
		int academy = 1;
		int uname = 2;
		int sex = 3;
		int sid = 4;
		int personid = 5;
		int classid = 6;
		int classcode = 7;
		int major = 8;
		int lang = 9;
		//选中在哪行
		int row = this.stuTable.getSelectedRow();
		//一个多少列
		int cols = this.stuTable.getColumnCount();
		String[] strs = new String[10];
		for (int i = 0; i < cols; i++) {
			strs[i] = (String) this.stuTable.getValueAt(row, i);
		}

		Userinfo userInfo = new Userinfo(null, strs[school], strs[academy],
				strs[uname], strs[sex], strs[sid], strs[personid],
				strs[classid], strs[classcode], strs[major], strs[lang]);
		schoolTxt.setText(userInfo.getSchool());
		accademyTxt.setText(userInfo.getAcademy());
		unameTxt.setText(userInfo.getUname());
		sexTxt.setText(userInfo.getSex());
		sidTxt.setText(userInfo.getSid());
		personidTxt.setText(userInfo.getPersonid());
		classcodeTxt.setText(userInfo.getClasscode());
		majorTxt.setText(userInfo.getMajor());
		langTxt.setText(userInfo.getLang());
		classidTxt.setText(userInfo.getClassid());

	}

	//查询
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String cxnm = this.cxTxt.getText();
		if (!ObjUtil.isEmpty(cxnm)) {
			flushtablecx(cxnm);
		} else {
			JOptionPane.showMessageDialog(null, "查询失败");
		}
	}

	private void flushtablecx(String cxnm) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "select * from userinfo where uname like ? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + cxnm + "%");
			rs = ps.executeQuery();
			//school  academy uname sex  sid  
			//personid    classid classcode major lang
			ArrayList<Userinfo> users = new ArrayList<Userinfo>();
			while (rs.next()) {
				String school = rs.getString("school");
				String academy = rs.getString("academy");
				String uname = rs.getString("uname");
				String sex = rs.getString("sex");
				String sid = rs.getString("sid");
				String personid = rs.getString("personid");
				String classid = rs.getString("classid");
				String classcode = rs.getString("classcode");
				String major = rs.getString("major");
				String lang = rs.getString("lang");
				Userinfo userInfo = new Userinfo(null, school, academy, uname,
						sex, sid, personid, classid, classcode, major, lang);
				users.add(userInfo);

			}
			//将查询出来的语句,填充到table中
			//获得的table对象
			DefaultTableModel dtm = (DefaultTableModel) this.stuTable
					.getModel();
			dtm.setRowCount(0);
			if (users.size() > 0)
				for (Userinfo userinfo : users) {
					Vector vector = new Vector();
					vector.add(userinfo.getSchool());
					vector.add(userinfo.getAcademy());
					vector.add(userinfo.getUname());
					vector.add(userinfo.getSex());
					vector.add(userinfo.getSid());
					vector.add(userinfo.getPersonid());
					vector.add(userinfo.getClassid());
					vector.add(userinfo.getClasscode());
					vector.add(userinfo.getMajor());
					vector.add(userinfo.getLang());
					dtm.addRow(vector);

				}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DbUtil.release(conn, ps, rs);

		}

	}

	//{strs[school],strs[academy],strs[uname],strs[sex],strs[sid],strs[personid],strs[classid],strs[classcode],strs[major],strs[lang]};
	//刷新方法
	private void flushtable() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "select * from userinfo ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ArrayList<Userinfo> users = new ArrayList<Userinfo>();
			while (rs.next()) {
				String school = rs.getString("school");
				String academy = rs.getString("academy");
				String uname = rs.getString("uname");
				String sex = rs.getString("sex");
				String sid = rs.getString("sid");
				String personid = rs.getString("personid");
				String classid = rs.getString("classid");
				String classcode = rs.getString("classcode");
				String major = rs.getString("major");
				String lang = rs.getString("lang");
				Userinfo userInfo = new Userinfo(null, school, academy, uname,
						sex, sid, personid, classid, classcode, major, lang);
				users.add(userInfo);

			}
			//将查询出来的语句,填充到table中
			//获得的table对象
			DefaultTableModel dtm = (DefaultTableModel) this.stuTable
					.getModel();
			dtm.setRowCount(0);
			if (users.size() > 0)
				for (Userinfo userinfo : users) {
					Vector vector = new Vector();
					vector.add(userinfo.getSchool());
					vector.add(userinfo.getAcademy());
					vector.add(userinfo.getUname());
					vector.add(userinfo.getSex());
					vector.add(userinfo.getSid());
					vector.add(userinfo.getPersonid());
					vector.add(userinfo.getClassid());
					vector.add(userinfo.getClasscode());
					vector.add(userinfo.getMajor());
					vector.add(userinfo.getLang());
					dtm.addRow(vector);

				}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DbUtil.release(conn, ps, rs);

		}

	}

	private void majorTxtActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling cod
	}

	void classcodeActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void classidTxtActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void langTxtActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void unameTxtActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void accademyTxtActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void schoolTxtActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void personldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void sidTxtActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void sexTxtActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void cxTxtActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new informationUI().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTextField accademyTxt;
	private javax.swing.JComboBox bjc;
	private javax.swing.JComboBox bk;
	private java.awt.Button button1;
	private javax.swing.JTextField classcodeTxt;
	private javax.swing.JTextField classidTxt;
	private javax.swing.JTextField cxTxt;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JScrollPane jScrollPane1;
	private java.awt.Label label1;
	private javax.swing.JTextField langTxt;
	private javax.swing.JTextField majorTxt;
	private javax.swing.JComboBox njc;
	private javax.swing.JTextField personidTxt;
	private javax.swing.JTextField schoolTxt;
	private javax.swing.JTextField sexTxt;
	private javax.swing.JTextField sidTxt;
	private javax.swing.JTable stuTable;
	private javax.swing.JTextField unameTxt;
	private javax.swing.JComboBox xbc;
	private javax.swing.JComboBox xc;
	private javax.swing.JComboBox xxc;
	private javax.swing.JComboBox zyc;
	// End of variables declaration//GEN-END:variables

}