import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.PrintStream;

public class JFrameTest {
    public static void main(String[] args) {
        //创建窗口
        JFrame jFrame=new JFrame("登录界面");
        jFrame.setBounds(650,400,550,300);
        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
        //界面
        JLabel label1=new JLabel("账号:");
        JTextField username=new JTextField("",20);
        JLabel label2=new JLabel("密码:");
        JTextField userpassword=new JTextField("",20);
        JButton jButton3=new JButton("登录");
        //按钮点击事件
        jButton3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("admin".equals(username.getText())&&"password".equals(userpassword.getText())){
                    System.out.println("登录成功");
                    JOptionPane.showMessageDialog(null,"登录成功","登录状态",JOptionPane.INFORMATION_MESSAGE);
                    jFrame.setVisible(false);
                    conservator();
                }else{
                    System.out.println("账号名或密码错误");
                    JOptionPane.showMessageDialog(null,"登录失败，账号名或密码错误","登录状态",JOptionPane.ERROR_MESSAGE);
                }
                username.setText("");
                userpassword.setText("");
            }
        });
        jFrame.add(label1);
        jFrame.add(username);
        jFrame.add(label2);
        jFrame.add(userpassword);
        jFrame.add(jButton3);
        //设置显示与关闭方式
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void conservator(){
        //创建窗口
        JFrame jFrame=new JFrame("后台管理界面");
        jFrame.setBounds(650,400,300,300);
        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
        //界面
        JLabel label1=new JLabel("学 号");
        JTextField id=new JTextField("",20);
        JLabel label2=new JLabel("班 级");
        JTextField studentClass=new JTextField("",20);
        JLabel label3=new JLabel("姓 名");
        JTextField name=new JTextField("",20);
        JLabel label4=new JLabel("数据结构");
        JTextField score_1=new JTextField("",18);
        JLabel label5=new JLabel("java程序设计");
        JTextField score_2=new JTextField("",16);
        JLabel label6=new JLabel("大学英语");
        JTextField score_3=new JTextField("",18);
        JButton jButton=new JButton("保存");
        //按钮点击事件
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(id.getText());
                System.out.println(studentClass.getText());
                System.out.println(name.getText());
                System.out.println(score_1.getText());
                System.out.println(score_2.getText());
                System.out.println(score_3.getText());
                //保存

                try {
                    PrintStream printStream=new PrintStream("D:\\"+name.getText()+"成绩信息"+".txt");
                    printStream.println("学号："+id.getText());
                    printStream.println("班级："+studentClass.getText());
                    printStream.println("姓名："+name.getText());
                    printStream.println("数据结构："+score_1.getText());
                    printStream.println("程序设计："+score_2.getText());
                    printStream.println("大学英语："+score_3.getText());
                    printStream.close();
                    JOptionPane.showMessageDialog(null,"保存成功","保存状态",JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        jFrame.add(label1);
        jFrame.add(id);
        jFrame.add(label2);
        jFrame.add(studentClass);
        jFrame.add(label3);
        jFrame.add(name);
        jFrame.add(label4);
        jFrame.add(score_1);
        jFrame.add(label5);
        jFrame.add(score_2);
        jFrame.add(label6);
        jFrame.add(score_3);
        jFrame.add(jButton);

        //设置显示与关闭方式
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
