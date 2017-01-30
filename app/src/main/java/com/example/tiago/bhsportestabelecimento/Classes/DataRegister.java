package com.example.tiago.bhsportestabelecimento.Classes;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by tiago on 24/01/17.
 */

public class DataRegister implements Parcelable {

    public String NomeFantasia;
    public String RazaoSocial;
    public String CNPJ;
    public String Responsavel;
    public String Email;
    public String Fone;
    public String Contato;
    public String Cep;
    public String Cidade;
    public String Endereco;
    public String Numero;
    public String Complemento;
    public String Bairro;

    public DataRegister(
            String NomeFantasia,
            String RazaoSocial,
            String CNPJ,
            String Responsavel,
            String Email,
            String Fone,
            String Contato,
            String Cep,
            String Cidade,
            String Endereco,
            String Numero,
            String Complemento,
            String Bairro
    )
    {
        this.NomeFantasia = NomeFantasia;
        this.RazaoSocial = RazaoSocial;
        this.CNPJ = CNPJ;
        this.Responsavel = Responsavel;
        this.Email = Email;
        this.Fone = Fone;
        this.Contato = Contato;
        this.Cep = Cep;
        this.Cidade = Cidade;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Complemento = Complemento;
        this.Bairro = Bairro;
    }

    private DataRegister(Parcel from){
        NomeFantasia = from.readString();
        RazaoSocial = from.readString();
        CNPJ = from.readString();
        Responsavel = from.readString();
        Email = from.readString();
        Fone = from.readString();
        Contato = from.readString();
        Cep = from.readString();
        Cidade = from.readString();
        Endereco = from.readString();
        Numero = from.readString();
        Complemento = from.readString();
        Bairro = from.readString();
    }

    public static final Parcelable.Creator<DataRegister>
            CREATOR = new Parcelable.Creator<DataRegister>(){

        @Override
        public DataRegister createFromParcel(Parcel in) {
            return new DataRegister(in);
        }

        @Override
        public DataRegister[] newArray(int size) {
            return new DataRegister[size];
        }
    };

    public int describeContents() {
        return this.hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(NomeFantasia);
        dest.writeString(RazaoSocial);
        dest.writeString(CNPJ);
        dest.writeString(Responsavel);
        dest.writeString(Email);
        dest.writeString(Fone);
        dest.writeString(Contato);
        dest.writeString(Cep);
        dest.writeString(Cidade);
        dest.writeString(Endereco);
        dest.writeString(Numero);
        dest.writeString(Complemento);
        dest.writeString(Bairro);
    }
}
