package android.sut.androidtest.sutfriend;

import android.graphics.drawable.RippleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SingUpActivity extends AppCompatActivity {

    // explicit ประกาศตัวแปร
    private EditText nameEditText, addressEditText, phoneEditText, userEditText, passwordEditText;
    private String nameString, addressString, phoneString, userString, passwordString, genderString,
    imageString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

       //bind widget ผูกตัวแปร
        nameEditText = (EditText) findViewById(R.id.editText );
        addressEditText = (EditText) findViewById(R.id.editText3);
        phoneEditText = (EditText) findViewById(R.id.editText4);
        userEditText = (EditText) findViewById(R.id.editText5);
        passwordEditText = (EditText) findViewById(R.id.editText6);

    } //main method

    public void clickSignupSign(View view) {
      // get value from edit text
        nameString = nameEditText.getText().toString().trim();
        addressString = addressEditText.getText().toString().trim();
        phoneString = phoneEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();


    } // clickSign
}// main class

