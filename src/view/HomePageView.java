package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePageView extends JFrame {
    private static final String FRAME_NAME = "主页";
    private static final String BUTTON_NAME_LOGIN = "登录";
    private static final String BUTTON_NAME_REGISTER = "注册";
    private static final int LOCATION_X = 600;
    private static final int LOCATION_Y = 300;
    private static final int FRAME_X = 800;
    private static final int FRAME_Y = 600;

    private JButton mLoginButton;
    private JButton mRegButton;

    public HomePageView() {
        super(FRAME_NAME);

        mLoginButton = new JButton(BUTTON_NAME_LOGIN);
        mRegButton = new JButton(BUTTON_NAME_REGISTER);

        mLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginView();
            }
        });

        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.getContentPane().add(mLoginButton);
        this.getContentPane().add(mRegButton);

        this.setLocation(LOCATION_X, LOCATION_Y);
        this.setSize(FRAME_X, FRAME_Y);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
