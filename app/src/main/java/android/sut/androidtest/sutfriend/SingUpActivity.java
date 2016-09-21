package android.sut.androidtest.sutfriend;

import android.content.Intent;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class SingUpActivity extends AppCompatActivity {

    // explicit ประกาศตัวแปร
    private EditText nameEditText, addressEditText, phoneEditText, userEditText, passwordEditText;
    private String nameString, addressString, phoneString, userString, passwordString, genderString,
    imageString;
    private RadioButton maleRadioButton, femaleRadioButton;
    private ImageView imageView;

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
        maleRadioButton = (RadioButton) findViewById(R.id.radioButton);
        femaleRadioButton = (RadioButton) findViewById(R.id.radioButton2);
        imageView = (ImageView) findViewById(R.id.imageView);

        //imageView c0ntroller
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("imge/*");
                startActivityForResult(Intent.createChooser(intent, "โปรดเลือกรูปภาพ"), 1);

            }// onClick
        });


    } //main method

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((requestCode == 1) && (resultCode == RESULT_OK)) {

            Log.d("SutfrienV1", "Resul ==> success");

        }
    } // onActivityResult

    public void clickSignupSign(View view) {
      // get value from edit text
        nameString = nameEditText.getText().toString().trim();
        addressString = addressEditText.getText().toString().trim();
        phoneString = phoneEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //check space
        if (nameString.equals("") || addressString.equals("") ||
                phoneString.equals("") || userString.equals("") || passwordString.equals("")) {
            //Have space
            MyAlert myAlert = new MyAlert(this,R.drawable.doremon48,
                    "มีช่องว่าง","กรุณากรอกทุกช่อง");
            myAlert.myDialog();

        } else if (!(maleRadioButton.isChecked() || femaleRadioButton.isChecked())) {
            //Non check
            MyAlert myAlert = new MyAlert(this, R.drawable.nobita48,
                    "ยังไม่เลือก Gender", "กรุณาเลือก Gender");
            myAlert.myDialog();

        }

    } // clickSign

}// main class

