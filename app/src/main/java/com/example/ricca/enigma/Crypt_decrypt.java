package com.example.ricca.enigma;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class Crypt_decrypt extends AppCompatActivity {

    public static boolean first_access=false;
    private Switch cr_decr_switch;
    private static final char[] letters=new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static byte[] selected_rotor_1=new byte[53];
    public static byte[] selected_rotor_2=new byte[53];
    public static byte[] selected_rotor_3=new byte[53];
    public static byte[] selected_reflector_1=new byte[26];
    public static byte selected_letter_1;
    public static byte selected_letter_2;
    public static byte selected_letter_3;
    public static byte selected_letter_4;
    private static int offset1;
    private static int offset2;
    private static int offset3;
    private static int offset4;

    public static String CRYPTPREFERENCES="cryptprefs";
    public static String original_text2="original_text_key";
    public static String crypted_text1="crypted_text1_key";
    public static String crypted_text2="crypted_text2_key";
    public static String decrypted_text1="decrypted_text1_key";
    public static String decrypted_text2="decrypted_text2_key";
    public static String first_pair1="first_pair1_key";
    public static String first_pair2="first_pair2_key";
    public static String second_pair1="second_pair1_key";
    public static String second_pair2="second_pair2_key";

    public static SharedPreferences crypt_preferences;

    byte i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypt);
        cr_decr_switch=findViewById(R.id.cr_decr_sw);
        offset1=selected_letter_1;
        offset2=selected_letter_2;
        offset3=selected_letter_3;
        offset4=selected_letter_4;
    }

    //Per andare alla home
    public void openHome(View view){
        crypt_preferences=getSharedPreferences(CRYPTPREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=crypt_preferences.edit();
        editor.putString("original_text_key","");
        editor.putString("crypted_text2_key","");
        editor.putString("decrypted_text2_key","");
        editor.putInt("first_pair1_key",26);
        editor.putInt("first_pair2_key",26);
        editor.putInt("second_pair1_key",26);
        editor.putInt("second_pair2_key",26);
        editor.apply();
        i=0;
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    //Per selezionare i rotori
    public void openRotors(View view){
        crypt_preferences=getSharedPreferences(CRYPTPREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=crypt_preferences.edit();
        editor.putString("original_text_key","");
        editor.putString("crypted_text2_key","");
        editor.putString("decrypted_text2_key","");
        editor.apply();
        i=0;
        Intent intent=new Intent(this,Rotors.class);
        startActivity(intent);
    }
    //Per selezionare le spine
    public void openPlugboard(View view){
        crypt_preferences=getSharedPreferences(CRYPTPREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=crypt_preferences.edit();
        editor.putString("original_text_key","");
        editor.putString("crypted_text2_key","");
        editor.putString("decrypted_text2_key","");
        editor.putInt("first_pair1_key",26);
        editor.putInt("first_pair2_key",26);
        editor.putInt("second_pair1_key",26);
        editor.putInt("second_pair2_key",26);
        editor.apply();
        i=0;
        Intent intent=new Intent(this,Plugboard.class);
        startActivity(intent);
    }
    //Per usare la tastiera
    public void openEnigma(View view){
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.suono_pulsante);
        switch (view.getId()){
            case R.id.bttA: {
                Enigma_heart(1);
                mp.start();
                break;
            }//chiama funzione per cifrare
            case R.id.bttB: {
                Enigma_heart(2);
                mp.start();
                break;
            }
            case R.id.bttC: {
                Enigma_heart(3);
                mp.start();
                break;
            }
            case R.id.bttD: {
                Enigma_heart(4);
                mp.start();
                break;
            }
            case R.id.bttE: {
                Enigma_heart(5);
                mp.start();
                break;
            }
            case R.id.bttF: {
                Enigma_heart(6);
                mp.start();
                break;
            }
            case R.id.bttG: {
                Enigma_heart(7);
                mp.start();
                break;
            }
            case R.id.bttH: {
                Enigma_heart(8);
                mp.start();
                break;
            }
            case R.id.bttI: {
                Enigma_heart(9);
                mp.start();
                break;
            }
            case R.id.bttJ: {
                Enigma_heart(10);
                mp.start();
                break;
            }
            case R.id.bttK: {
                Enigma_heart(11);
                mp.start();
                break;
            }
            case R.id.bttL: {
                Enigma_heart(12);
                mp.start();
                break;
            }
            case R.id.bttM: {
                Enigma_heart(13);
                mp.start();
                break;
            }
            case R.id.bttN: {
                Enigma_heart(14);
                mp.start();
                break;
            }
            case R.id.bttO: {
                Enigma_heart(15);
                mp.start();
                break;
            }
            case R.id.bttP: {
                Enigma_heart(16);
                mp.start();
                break;
            }
            case R.id.bttQ: {
                Enigma_heart(17);
                mp.start();
                break;
            }
            case R.id.bttR: {
                Enigma_heart(18);
                mp.start();
                break;
            }
            case R.id.bttS: {
                Enigma_heart(19);
                mp.start();
                break;
            }
            case R.id.bttT: {
                Enigma_heart(20);
                mp.start();
                break;
            }
            case R.id.bttU: {
                Enigma_heart(21);
                mp.start();
                break;
            }
            case R.id.bttV: {
                Enigma_heart(22);
                mp.start();
                break;
            }
            case R.id.bttW: {
                Enigma_heart(23);
                mp.start();
                break;
            }
            case R.id.bttX: {
                Enigma_heart(24);
                mp.start();
                break;
            }
            case R.id.bttY: {
                Enigma_heart(25);
                mp.start();
                break;
            }
            case R.id.bttZ: {
                Enigma_heart(26);
                mp.start();
                break;
            }
        }
    }

    public void Enigma_heart(int index) {
        crypt_preferences=getSharedPreferences(CRYPTPREFERENCES,Context.MODE_PRIVATE);
        ImageView A= findViewById(R.id.A);
        ImageView B =findViewById(R.id.B);
        ImageView C =findViewById(R.id.C);
        ImageView D =findViewById(R.id.D);
        ImageView E =findViewById(R.id.E);
        ImageView F =findViewById(R.id.F);
        ImageView G = findViewById(R.id.G);
        ImageView H =findViewById(R.id.H);
        ImageView I =findViewById(R.id.I);
        ImageView J =findViewById(R.id.J);
        ImageView K =findViewById(R.id.K);
        ImageView L =findViewById(R.id.L);
        ImageView M =findViewById(R.id.M);
        ImageView N =findViewById(R.id.N);
        ImageView O =findViewById(R.id.O);
        ImageView P =findViewById(R.id.P);
        ImageView Q =findViewById(R.id.Q);
        ImageView r =findViewById(R.id.R);
        ImageView S =findViewById(R.id.S);
        ImageView T =findViewById(R.id.T);
        ImageView U =findViewById(R.id.U);
        ImageView V =findViewById(R.id.V);
        ImageView W =findViewById(R.id.W);
        ImageView X =findViewById(R.id.X);
        ImageView Y =findViewById(R.id.Y);
        ImageView Z=findViewById(R.id.Z);
        String result;
        int starting=index;

        offset1=offset1+1;      //Rotazione del rotore (che avviene virtualmente prima di premere il tasto)
        if(offset1==selected_rotor_1[52]) offset2=offset2+1;    //Controllo per l'incremento del secondo e del terzo rotore
        if(offset2==selected_rotor_2[52]) offset3=offset3+1;

        if(offset1==27) offset1=1;      //Controllo dell'indice quando si arriva alla fine degli elementi del rotore per farlo ripartire dall'inizio
        if(offset2==27) offset2=1;
        if(offset3==27) offset3=1;

        if(index==crypt_preferences.getInt("first_pair1_key",0))
            index=crypt_preferences.getInt("first_pair2_key",0);
        else if(index==crypt_preferences.getInt("first_pair2_key",0))
            index=crypt_preferences.getInt("first_pair1_key",0);
        if(index==crypt_preferences.getInt("second_pair1_key",0))
            index=crypt_preferences.getInt("second_pair2_key",0);
        else if(index==crypt_preferences.getInt("second_pair2_key",0))
            index=crypt_preferences.getInt("second_pair1_key",0);

        index=index+offset1;        //Incremento dell'indice dovuto alla rotazione rotore
        if(index>26) index=index-26; if(index<=0) index=index+26;       //controllo per mantenere l'indice all'interno del range di elementi del rotore
        index=index+selected_rotor_1[index-1];                          //incremento effettivo dovuto al rotore
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index-offset1;                                            //ripristino della posizione assolta sottraendo l'offset dovuto alla rotazione del rotore
        if(index>26) index=index-26; if(index<=0) index=index+26;

        index=index+offset2;
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index+selected_rotor_2[index-1];
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index-offset2;
        if(index>26) index=index-26; if(index<=0) index=index+26;

        index=index+offset3;
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index+selected_rotor_3[index-1];
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index-offset3;
        if(index>26) index=index-26; if(index<=0) index=index+26;

        index=index+offset4;
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index+selected_reflector_1[index-1];
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index-offset4;
        if(index>26) index=index-26; if(index<=0) index=index+26;

        index=index+offset3;
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index+selected_rotor_3[26+index-1];
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index-offset3;
        if(index>26) index=index-26; if(index<=0) index=index+26;

        index=index+offset2;
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index+selected_rotor_2[26+index-1];
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index-offset2;
        if(index>26) index=index-26; if(index<=0) index=index+26;

        index=index+offset1;
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index+selected_rotor_1[26+index-1];
        if(index>26) index=index-26; if(index<=0) index=index+26;
        index=index-offset1;
        if(index>26) index=index-26; if(index<=0) index=index+26;

        if(index==crypt_preferences.getInt("first_pair1_key",0))
            index=crypt_preferences.getInt("first_pair2_key",0);
        else if(index==crypt_preferences.getInt("first_pair2_key",0))
            index=crypt_preferences.getInt("first_pair1_key",0);
        if(index==crypt_preferences.getInt("second_pair1_key",0))
            index=crypt_preferences.getInt("second_pair2_key",0);
        else if(index==crypt_preferences.getInt("second_pair2_key",0))
            index=crypt_preferences.getInt("second_pair1_key",0);

        if(cr_decr_switch.isChecked())
        {
            crypt_preferences=getSharedPreferences(CRYPTPREFERENCES,Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=crypt_preferences.edit();
            if(i<100){
                result=String.valueOf(letters[index-1]);
                if(result.equals("A"))
               {
                   A.setVisibility(View.VISIBLE);
                   ImageView images[]={B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                   for (ImageView view : images)
                       view.setVisibility(View.INVISIBLE);
               }
               if(result.equals("B"))
                {
                    B.setVisibility(View.VISIBLE);
                    ImageView images[]={A,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("C"))
                {
                    C.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);

                }
                if(result.equals("D"))
                {
                  D.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("E"))
                {
                    E.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("F"))
                {
                    F.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("G"))
                {
                    G.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("H"))
                {
                   H.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("I"))
                {
                    I.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("J"))
                {
                    J.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("K"))
                {
                    K.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("L"))
                {
                    L.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("M"))
                {
                    M.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("N"))
                {
                    N.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("O"))
                {
                    O.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("P"))
                {
                   P.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("Q"))
                {
                    Q.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("R"))
                {
                   r.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("S"))
                {
                    S.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("T"))
                {
                    T.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("U"))
                {
                  U.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("V"))
                {
                    V.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("W"))
                {
                    W.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("X"))
                {
                    X.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("Y"))
                {
                   Y.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("Z"))
                {
                    Z.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                i= (byte) (i+1);
                editor.putString("original_text_key",String.format("%s%s",crypt_preferences.getString("original_text_key",""), String.valueOf(letters[starting-1])));
                editor.putString("decrypted_text2_key",String.format("%s%s", crypt_preferences.getString("decrypted_text2_key",""), result));
            }
            else{
                Toast toast=Toast.makeText(getApplicationContext(),R.string.max_reached,Toast.LENGTH_SHORT);
                toast.show();
            }
            editor.apply();
        }
        else
        {
            crypt_preferences=getSharedPreferences(CRYPTPREFERENCES,Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=crypt_preferences.edit();
            if(i<100&&(i%5==0)&&i!=0){
                result=String.valueOf(letters[index-1]);
                if(result.equals("A"))
                {
                    A.setVisibility(View.VISIBLE);
                    ImageView images[]={B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("B"))
                {
                    B.setVisibility(View.VISIBLE);
                    ImageView images[]={A,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("C"))
                {
                    C.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);

                }
                if(result.equals("D"))
                {
                    D.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("E"))
                {
                    E.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("F"))
                {
                    F.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("G"))
                {
                    G.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("H"))
                {
                    H.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("I"))
                {
                    I.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("J"))
                {
                    J.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("K"))
                {
                    K.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("L"))
                {
                    L.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("M"))
                {
                    M.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("N"))
                {
                    N.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("O"))
                {
                    O.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("P"))
                {
                    P.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("Q"))
                {
                    Q.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("R"))
                {
                    r.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("S"))
                {
                    S.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("T"))
                {
                    T.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("U"))
                {
                    U.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("V"))
                {
                    V.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("W"))
                {
                    W.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("X"))
                {
                    X.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("Y"))
                {
                    Y.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("Z"))
                {
                    Z.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                i= (byte) (i+1);
                editor.putString("original_text_key",String.format("%s%s",crypt_preferences.getString("original_text_key",""), String.valueOf(letters[starting-1])));
                editor.putString("crypted_text2_key",String.format("%s %s",crypt_preferences.getString("crypted_text2_key",""), result));
            }
            else if(i>=100){
                Toast toast=Toast.makeText(getApplicationContext(),R.string.max_reached,Toast.LENGTH_SHORT);
                toast.show();
            }
            else{
                result=String.valueOf(letters[index-1]);
                if(result.equals("A"))
                {
                    A.setVisibility(View.VISIBLE);
                    ImageView images[]={B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("B"))
                {
                    B.setVisibility(View.VISIBLE);
                    ImageView images[]={A,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("C"))
                {
                    C.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);

                }
                if(result.equals("D"))
                {
                    D.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("E"))
                {
                    E.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("F"))
                {
                    F.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("G"))
                {
                    G.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("H"))
                {
                    H.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("I"))
                {
                    I.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("J"))
                {
                    J.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("K"))
                {
                    K.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("L"))
                {
                    L.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("M"))
                {
                    M.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("N"))
                {
                    N.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,O,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("O"))
                {
                    O.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,P,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("P"))
                {
                    P.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,Q,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("Q"))
                {
                    Q.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,r,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("R"))
                {
                    r.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,S,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("S"))
                {
                    S.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,T,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("T"))
                {
                    T.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,U,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("U"))
                {
                    U.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,V,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("V"))
                {
                    V.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,W,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("W"))
                {
                    W.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,X,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("X"))
                {
                    X.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,Y,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("Y"))
                {
                    Y.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Z};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                if(result.equals("Z"))
                {
                    Z.setVisibility(View.VISIBLE);
                    ImageView images[]={A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y};
                    for (ImageView view : images)
                        view.setVisibility(View.INVISIBLE);
                }
                i= (byte) (i+1);
                editor.putString("original_text_key",String.format("%s%s",crypt_preferences.getString("original_text_key",""), String.valueOf(letters[starting-1])));
                editor.putString("crypted_text2_key",String.format("%s%s",crypt_preferences.getString("crypted_text2_key",""), result));

            }
            editor.apply();
        }
    }
    //Per resettare i rotori
    public void reset(View view){
        Rotors.enigma_preferences=getSharedPreferences(Rotors.ENIGMAPREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=Rotors.enigma_preferences.edit();
        editor.putInt("rotor_one_key",0);
        editor.putInt("rotor_two_key",0);
        editor.putInt("rotor_three_key",0);
        editor.putInt("rotor_four_key",0);
        editor.putInt("letter_one_key",0);
        editor.putInt("letter_two_key",0);
        editor.putInt("letter_three_key",0);
        editor.putInt("letter_four_key",0);
        editor.apply();
        Rotors.spinner1.setSelection(Rotors.enigma_preferences.getInt("rotor_one_key",0));
        Rotors.spinner2.setSelection(Rotors.enigma_preferences.getInt("rotor_two_key",0));
        Rotors.spinner3.setSelection(Rotors.enigma_preferences.getInt("rotor_three_key",0));
        Rotors.spinner4.setSelection(Rotors.enigma_preferences.getInt("rotor_four_key",0));
        Rotors.spinner5.setSelection(Rotors.enigma_preferences.getInt("letter_one_key",0));
        Rotors.spinner6.setSelection(Rotors.enigma_preferences.getInt("letter_two_key",0));
        Rotors.spinner7.setSelection(Rotors.enigma_preferences.getInt("letter_three_key",0));
        Rotors.spinner8.setSelection(Rotors.enigma_preferences.getInt("letter_four_key",0));

        crypt_preferences=getSharedPreferences(CRYPTPREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2=crypt_preferences.edit();
        editor2.putString("original_text_key","");
        editor2.putString("crypted_text2_key","");
        editor2.putString("decrypted_text2_key","");
        editor.putInt("first_pair1_key",26);
        editor.putInt("first_pair2_key",26);
        editor.putInt("second_pair1_key",26);
        editor.putInt("second_pair2_key",26);
        editor2.apply();
        i=0;
        Toast toast=Toast.makeText(getApplicationContext(),R.string.reset_toast,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void openTexts(View view){
        SharedPreferences.Editor editor=crypt_preferences.edit();

        if(cr_decr_switch.isChecked()){
            editor.putInt("crypted_text1_key",4);
            editor.putInt("decrypted_text1_key",0);
        }
        else{
            editor.putInt("crypted_text1_key",0);
            editor.putInt("decrypted_text1_key",4);
        }
        editor.apply();
        Intent intent=new Intent(this,toCrypt.class);
        startActivity(intent);
    }
}
