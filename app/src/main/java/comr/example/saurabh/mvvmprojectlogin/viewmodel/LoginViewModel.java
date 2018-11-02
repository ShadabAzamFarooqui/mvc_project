package comr.example.saurabh.mvvmprojectlogin.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import comr.example.saurabh.mvvmprojectlogin.interfaces.LoginResultCallBack;
import comr.example.saurabh.mvvmprojectlogin.model.User;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginResultCallBack loginResultCallBack;

    public LoginViewModel(User user, LoginResultCallBack loginResultCallBack) {
        this.user = new User();
        this.loginResultCallBack = loginResultCallBack;
    }
    // get email from text field and set user class
    public TextWatcher getEmailTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setEmail(s.toString());
            }
        };
    }
    // get password from text field and set user class
    public TextWatcher getPasswordTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
             user.setPassword(s.toString());
            }
        };
    }
    // WRITE A METHOD FOR LOGIN PROCESS
    public void onLoginClicked(View view){
        if (user.isValidData()){
           loginResultCallBack.onSuccess("login success");
        }else {
          loginResultCallBack.onError("login failed");
        }
    }
}
