package comr.example.saurabh.mvvmprojectlogin.viewmodel;

import android.arch.lifecycle.ViewModelProvider;

import comr.example.saurabh.mvvmprojectlogin.interfaces.LoginResultCallBack;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private LoginResultCallBack loginResultCallBack;

    public LoginViewModelFactory(LoginResultCallBack loginResultCallBack) {
        this.loginResultCallBack = loginResultCallBack;
    }

     
}
