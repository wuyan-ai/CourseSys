package view;

import DAO.MySQLDAO;
import model.Account;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {

    private static final String FRAME_NAME = "登录";
    private static final String BUTTON_TEXT_LOGIN = "登录";
    private static final String LABEL_TEXT_USERNAME = "用户名";
    private static final String LABEL_TEXT_PASSWORD = "密    码";
    private static final int LOCATION_X = 600;
    private static final int LOCATION_Y = 300;
    private static final int FRAME_X = 400;
    private static final int FRAME_Y = 200;

    private JLabel mUsernameLabel;
    private JLabel mPasswordLabel;
    private JButton mLoginButton;
    private JTextField mUsernameTextField;
    private JPasswordField mPasswordTextField;

    public LoginView() {


        mUsernameLabel = new JLabel(LABEL_TEXT_USERNAME);
        mPasswordLabel = new JLabel(LABEL_TEXT_PASSWORD);
        mUsernameTextField = new JTextField(10);
        mPasswordTextField = new JPasswordField(10);
        mLoginButton = new JButton(BUTTON_TEXT_LOGIN);

        JPanel usernamePanel = new JPanel();
        usernamePanel.add(mUsernameLabel);
        usernamePanel.add(mUsernameTextField);

        JPanel passwordPanel = new JPanel();
        passwordPanel.add(mPasswordLabel);
        passwordPanel.add(mPasswordTextField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(mLoginButton);

        this.setLayout(new GridLayout(3, 1));

        this.getContentPane().add(usernamePanel);
        this.getContentPane().add(passwordPanel);
        this.getContentPane().add(buttonPanel);

        this.setLocation(LOCATION_X, LOCATION_Y);
        this.setSize(FRAME_X, FRAME_Y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Account a = MySQLDAO.getInstance().getAccountByUsername("jlu01");
    }
}
