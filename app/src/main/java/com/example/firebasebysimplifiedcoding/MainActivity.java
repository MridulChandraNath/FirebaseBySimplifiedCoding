 package com.example.firebasebysimplifiedcoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;

 public class MainActivity extends AppCompatActivity {
     DatabaseReference myRef;
     EditText mNameET,mAgeET;
     Button mOkBtn;
     String[] name={"Mridul","Chandra","Nath","Prionty","Bhowmik","Farhan","Sadiq","Galib"};

     ArrayList<DataList> arrayList;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRef=FirebaseDatabase.getInstance().getReference().child("User");
        arrayList=new ArrayList<DataList>();

        mOkBtn=findViewById(R.id.okBtn);

        int i;
        for (i=0; i<name.length; i++){
            DataList dataList=new DataList(name[i]);
            arrayList.add(dataList);
        }

        myRef.child("List").setValue(arrayList);







        //Widget are make initialize in below
       /* mNameET=findViewById(R.id.nameET);
        mAgeET=findViewById(R.id.ageET);
        mOkBtn=findViewById(R.id.okBtn);*/





        // Write a message to the database
/*

       myRef=FirebaseDatabase.getInstance().getReference().child("Info");
*/




       mOkBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //Below code are done by HashMap
               /* String name=mNameET.getText().toString();
                HashMap<String,String> hashMap=new HashMap<>();

                hashMap.put("Name",name);
                myRef.setValue(hashMap);*/
               //Below code are done by using Object
             /*  String name=mNameET.getText().toString();
               int age= Integer.parseInt(mAgeET.getText().toString());
                UserData userData=new UserData(name,age);
                myRef.setValue(userData);*/





           }
       });



    }
}

