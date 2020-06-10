package br.fasam.androidn1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonSave;
    private Button buttonLimpar;
    private EditText corCabelo;
    private EditText genero;
    private EditText corOlhos;
    private EditText dtNascimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSave = (Button) findViewById(R.id.buttonSave);
        corCabelo = (EditText) findViewById(R.id.corCabelo);
        genero = (EditText) findViewById(R.id.genero);
        corOlhos = (EditText) findViewById(R.id.corOlhos);
        dtNascimento = (EditText) findViewById(R.id.dtNascimento);

        Object[] pessoa = new String[10];
        for (int i = 0; i < 10; i++){
            pessoa[i] = "Pessoa 1"+(i+1);
        }

        ArrayAdapter<Object> adapter = new ArrayAdapter<Object>(this, android.R.layout.simple_list_item_1, pessoa);

        ListView lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adapter);

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                corCabelo.setText("");
                genero.setText("");
                corOlhos.setText("");
                dtNascimento.setText("");
            }
        });

    }
        public void confirmar(View view){
            corCabelo.setText(corCabelo.getText());
            genero.setText(genero.getText());
            corOlhos.setText(corOlhos.getText());
            dtNascimento.setText(dtNascimento.getText());
    }
}