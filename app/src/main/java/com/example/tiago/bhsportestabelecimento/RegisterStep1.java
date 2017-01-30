package com.example.tiago.bhsportestabelecimento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.tiago.bhsportestabelecimento.Classes.DataRegister;

public class RegisterStep1 extends AppCompatActivity {

    EditText nome_fantasia, razao_social, cnpj, responsavel, email, fone, contato, cep, cidade, endereco;
    EditText numero, complemento, bairro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step1);

        nome_fantasia = (EditText) findViewById(R.id.txtNomeFantasia);
        razao_social = (EditText) findViewById(R.id.txtRazaoSocial);
        cnpj = (EditText) findViewById(R.id.txtCNPJ);
        responsavel = (EditText) findViewById(R.id.txtResponsavel);
        email = (EditText) findViewById(R.id.txtEmail);
        fone = (EditText) findViewById(R.id.txtFone);
        contato = (EditText) findViewById(R.id.txtContato);
        cep = (EditText) findViewById(R.id.txtCEP);
        cidade = (EditText) findViewById(R.id.txtCidade);
        endereco = (EditText) findViewById(R.id.txtEndereco);
        numero = (EditText) findViewById(R.id.txtNumero);
        complemento = (EditText) findViewById(R.id.txtComplemento);
        bairro = (EditText) findViewById(R.id.txtBairro);

        Intent intent = getIntent();
        DataRegister dataRegister = intent.getParcelableExtra("dataRegister");
        if (dataRegister != null){
            nome_fantasia.setText(dataRegister.NomeFantasia);
            razao_social.setText(dataRegister.RazaoSocial);
            cnpj.setText(dataRegister.CNPJ);
            responsavel.setText(dataRegister.Responsavel);
            email.setText(dataRegister.Email);
            fone.setText(dataRegister.Fone);
            contato.setText(dataRegister.Contato);
            cep.setText(dataRegister.Cep);
            cidade.setText(dataRegister.Cidade);
            endereco.setText(dataRegister.Endereco);
            numero.setText(dataRegister.Numero);
            complemento.setText(dataRegister.Complemento);
            bairro.setText(dataRegister.Bairro);
        }
    }

    protected void btnRegisterStep1(View view)
    {
        Intent intent = new Intent(RegisterStep1.this, RegisterStep2.class);

        DataRegister dataRegister = new DataRegister(
                nome_fantasia.getText().toString(),
                razao_social.getText().toString(),
                cnpj.getText().toString(),
                responsavel.getText().toString(),
                email.getText().toString(),
                fone.getText().toString(),
                contato.getText().toString(),
                cep.getText().toString(),
                cidade.getText().toString(),
                endereco.getText().toString(),
                numero.getText().toString(),
                complemento.getText().toString(),
                bairro.getText().toString()
        );

        intent.putExtra("dataRegister", dataRegister);
        startActivity(intent);
    }


}
