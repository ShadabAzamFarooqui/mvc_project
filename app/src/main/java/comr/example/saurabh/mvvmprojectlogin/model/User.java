package comr.example.saurabh.mvvmprojectlogin.model;

import android.databinding.BaseObservable;
import android.util.Patterns;

import java.util.regex.Pattern;

public class User extends BaseObservable {
    private String email, password;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isValidData() {
        if (getEmail().length() == 0) {
            return false;
        } else if (Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) {
            return false;
        } else if (getPassword().length() == 0) {
            return false;
        } else if (getPassword().length() < 6) {
            return false;
        } else {
            return true;
        }
    }
}
