package 自己编写;
import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.SwingConstants;

public class Caculator extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	Result result = new Result(); // 定义text面板
	Number_Key number_key = new Number_Key(); // 定义按钮面板
// 点击按钮+、-、*、/com = true
	boolean com = false;
// i=0说明我第输入字符串text累加
	int i = 0;
// 存放text内容
	String text = "";
// 存放点击按钮+、-、*、/前数值
	double defbutton = 0;
// +、-、*、/代号别1234
	int symbol = 0;
// 构造函数
Caculator() {
	super("WangJiao"); // 设定标题
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设定关闭窗体退程序
	JPanel pane = new JPanel(); // 定义主面板
	pane.setLayout(new BorderLayout());
	setBounds(380, 220, 30, 80); // 前两参数屏幕显示坐标两
// 替换图标
	ImageIcon icon = new ImageIcon("F:1.GIF");
	Caculator.class.getResource("APPLE.GIF");
	setIconImage(icon.getImage());
	pane.add(result, BorderLayout.NORTH);
	pane.add(number_key, BorderLayout.CENTER);
	pane.add(number_key.equal, BorderLayout.SOUTH);
	number_key.one.addActionListener(this); // 1按钮添加监听事件
	number_key.two.addActionListener(this); // 2按钮添加监听事件
	number_key.three.addActionListener(this); // 3按钮添加监听事件
	number_key.four.addActionListener(this); // 4按钮添加监听事件
	number_key.five.addActionListener(this); // 5按钮添加监听事件
	number_key.six.addActionListener(this); // 6按钮添加监听事件
	number_key.seven.addActionListener(this); // 7按钮添加监听事件
	number_key.eight.addActionListener(this); // 8按钮添加监听事件
	number_key.nine.addActionListener(this); // 9按钮添加监听事件
	number_key.zero.addActionListener(this); // 0按钮添加监听事件
	number_key.ce.addActionListener(this); // 置零按钮添加监听事件
	number_key.plus.addActionListener(this); // +按钮添加监听事件
	number_key.equal.addActionListener(this); // =按钮添加监听事件
	number_key.sub.addActionListener(this); // -按钮添加监听事件
	number_key.div.addActionListener(this); // /按钮添加监听事件
	number_key.point.addActionListener(this); // .按钮添加监听事件
	setContentPane(pane);
	pack(); // 初始化窗体盛放所按钮搜索
}
// 各按钮触发事件
public void actionPerformed(ActionEvent e) {

/*

 * 点击数字按钮先要判断否前点击+、-、*、/、=com=true 没com=

 * false;或者否点击数字键i = 1,没 i = 0;

 */

	if (e.getSource() == number_key.one) {
		if (com || i == 0) {
			result.text.setText("1");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			result.text.setText(text + "1");
		}
	} else if (e.getSource() == number_key.two) {
		if (com || i == 0) {
			result.text.setText("2");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			result.text.setText(text + "2");
		}
	} else if (e.getSource() == number_key.three) {
		if (com || i == 0) {
			result.text.setText("3");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			result.text.setText(text + "3");
		}
	} else if (e.getSource() == number_key.four) {
		if (com || i == 0) {
			result.text.setText("4");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			result.text.setText(text + "4");
		}
	} else if (e.getSource() == number_key.five) {
		if (com || i == 0) {
			result.text.setText("5");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			result.text.setText(text + "5");
		}
	} else if (e.getSource() == number_key.six) {
		if (com || i == 0) {
			result.text.setText("6");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			result.text.setText(text + "6");
		}
	} else if (e.getSource() == number_key.seven) {
		if (com || i == 0) {
			result.text.setText("7");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			result.text.setText(text + "7");
		}
	} else if (e.getSource() == number_key.eight) {
		if (com || i == 0) {
			result.text.setText("8");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			result.text.setText(text + "8");
		}
	} else if (e.getSource() == number_key.nine) {
		if (com || i == 0) {
			result.text.setText("9");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			result.text.setText(text + "9");
		}
	}
/*
 * 于0按钮定说我程序现00000情况我加判断条件
 * text数值=0要判断数值否.存?原数值基础添 加0;否则保持原数值变
 */
	else if (e.getSource() == number_key.zero) { // result.text.getText()text内容意思
		if (com || i == 0) {
			result.text.setText("0");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			if (Float.parseFloat(text) > 0 || Float.parseFloat(text) < 0) { // Float.parseFloat(text)类型转换面都
				result.text.setText(text + "0");
			} else {
				if (text.trim().indexOf(".") == -1) {
					result.text.setText(text);
				} else {
					result.text.setText(text + "0");
				}
			}
		}
	} else if (e.getSource() == number_key.ce) {
		result.text.setText("0");
		i = 0;
		com = true;
// text = "";
		defbutton = 0;
}
/*
 * 本程序让数值现2数点.具体做:判断否已经存.存添加, 存添加.
 */
	else if (e.getSource() == number_key.point) {
		if (com || i == 0) {
			result.text.setText("0.");
			com = false;
			i = 1;
		} else {
			text = result.text.getText();
			if (text.trim().indexOf(".") == -1) {
				result.text.setText(text + ".");
			} else {
				result.text.setText(text);
			}
		}
} // 获点击+前数值
	else if (e.getSource() == number_key.plus) {
		com = true;
		i = 0;
		defbutton = Double.parseDouble(result.text.getText());
		symbol = 1;
} // 获点击-前数值
	else if (e.getSource() == number_key.sub) {
		com = true;
		i = 0;
		defbutton = Double.parseDouble(result.text.getText());
		symbol = 2;
} // 获点击*前数值
	else if (e.getSource() == number_key.mul) {
		com = true;
		i = 0;
		defbutton = Double.parseDouble(result.text.getText());
		System.out.println(defbutton);
		symbol = 3;
} // 获点击/前数值
	else if (e.getSource() == number_key.div) {
		com = true;
		i = 0;
		defbutton = Double.parseDouble(result.text.getText());
		symbol = 4;
	} else if (e.getSource() == number_key.equal) {
		switch (symbol) {
		case 1: { // 计算加
			double ad = defbutton
					+ Double.parseDouble(result.text.getText());
			result.text.setText(ad + "");
			i = 0;
			text = "";
			break;
}
		case 2: { // 计算减
			double ad = defbutton
					- Double.parseDouble(result.text.getText());
			result.text.setText(String.valueOf(ad));
			i = 0;
			text = "";
			break;
		}
		case 3: { // 计算乘
			double ad = defbutton
					* Double.parseDouble(result.text.getText());
			result.text.setText(ad + "");
			i = 0;
			text = "";
			break;
}
		case 4: { // 计算除
			double ad = defbutton
					/ Double.parseDouble(result.text.getText());
			result.text.setText(ad + "");
			i = 0;
			text = "";
			break;
		}
}
		System.out.println(com);
	}
	System.out.println(result.text.getText());
}
	@SuppressWarnings("deprecation")
public static void main(String[] args) {
		Caculator loveyou = new Caculator();
		loveyou.show();
	}
}
// 计算器数字按钮定义面板
	class Number_Key extends JPanel {
private static final long serialVersionUID = 1L;
	JButton zero = new JButton("0"); // 数字键0
	JButton one = new JButton("1"); // 数字键1
	JButton two = new JButton("2"); // 数字键2
	JButton three = new JButton("3"); // 数字键3
	JButton four = new JButton("4"); // 数字键4
	JButton five = new JButton("5"); // 数字键5
	JButton six = new JButton("6"); // 数字键6
	JButton seven = new JButton("7"); // 数字键7
	JButton eight = new JButton("8"); // 数字键8
	JButton nine = new JButton("9"); // 数字键9
	JButton plus = new JButton("+");
	JButton sub = new JButton("-");
	JButton mul = new JButton("*");
	JButton div = new JButton("/");
	JButton equal = new JButton("=");
	JButton ce = new JButton("清零"); // 置零键
	JButton point = new JButton(".");
Number_Key() {
	setLayout(new GridLayout(4, 4)); // 定义布局管理器网格布局
	setBackground(Color.blue); // 设置背景颜色
// 添加按钮
	add(one);
	add(two);
	add(three);
	add(four);
	add(five);
	add(six);
	add(seven);
	add(eight);
	add(nine);
	add(zero);
	add(plus);
	add(sub);
	add(mul);
	add(div);
	add(point);
	add(equal);
	add(ce);
	}
}
// 计算器显示结窗体
class Result extends JPanel {
	private static final long serialVersionUID = 1L;
// text先输入结
	JTextField text = new JTextField("0");
	Result() { // 讲输入数字或结text右边显示
		text.setHorizontalAlignment(SwingConstants.RIGHT);
		text.enable(false); // 文本框能编辑
		setLayout(new BorderLayout()); // 设定布局管理器边框布局
		add(text, BorderLayout.CENTER); // text放置窗体间
	}
}
