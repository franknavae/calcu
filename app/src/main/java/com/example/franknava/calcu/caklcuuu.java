package com.franknavae.appcalculadora;






import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Viewiew;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    private EditText AlturaIn;

    private EditText PesoIn;

    private Button btnCalcBMI;

    private TextView BmiOut;

    private TextView bmistatus

    private double peso = 0;

    private double altura= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeApp ();
    }


    private void initializeApp (){
        pesoIn=(EditText)findViewById(R.id.peso);
        alturaIn=(EditText)findViewById(R.id.altura);

        btnCalcBMI=(Button)findViewById(R.id.calculate);

        BmiOut = (TextView) findViewById(R.id.BmiOut)

        bmistatus=(TextView)findViewById(R.id.bmistatus);
//        btnCalcBMI.setOnClickListener(new View.OnClickListener()
//        @Override
//        public void onClick (View v)
//        calculateBMI();
    }
    public void calculateBMI(){
//        Log.i("CalculateBMI","Button was pressed");

        peso= Double.parseDouble(pesoIn.getText().tostring() );

        altura= Double.parseDouble(alturaIn.getText().tostring() );

        double bmi= (peso/(altura*altura))
        String result= String.format("%2f",bmi);

        Log.d("MyActivity",String.format("%.2f",bmi));
        BmiOut.setText(result,TextView.BufferType.NORMAL);



        //<20-40    bajo
        //41-70 normal
        //71-100 sobrepes
        // Set status
        if(bmi<40-49){
            bmistatus ="bajo"
            else if(bmi>50.0,, bmi<80){
                bmistatus= "normal"
            }
            else {
                bmistatus= "sobrepeso"
            }
            bmistatus.setText( status );
        }

    }