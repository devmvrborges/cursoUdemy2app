package frasedodia.studio.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/*
Aplicativo desenvolvido por Maurício Valentim Rodrigues Borges dia 18/01/2017
estudante de Ciência da computação na Faculdade de Jaguariúna.

DESCRIÇÃO: Aplicativo que gera algumas piadas randomicamente atravez de uma String
e de uma classe randomica seria gerador de frases motivadoras, mas fiz com algumas
piadas rápidas para quebrar o gelo no dia-dia.

Desenvolvido durante o Curso Completo do Desenvolvedor Android - Crie 15 Apps (UDEMY)
*/

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "O que o advogado do frango foi fazer na delegacia ?\n\n" +
                    "R: Foi soltar a franga.",
            "Por que na Argentina as vacas vivem olhando pro céu?\n\n" +
                    "R: Porque tem “Boi nos Ares”!",
            "Para que serve óculos verde ?\n\n" +
                    "R: Para verdeperto.",
            "Para que serve óculos vermelho ?\n\n" +
                    "R: Para vermelhor",
            "Para que serve óculos marrom ?\n\n" +
                    "R: Para ver marromenos",
            "Por que a mu lher do Hulk divorciou-se dele ?\n\n" +
                    "R: Porque ela queria um homem mais maduro.",
            "Por que o jacaré tirou o jacarezinho da escola?\n\n" +
                    "R: Porque ele réptil de ano",
            "Você conhece a piada do fotógrafo?\n\n" +
                    "R: Ainda não foi revelada.",
            "Você sabe qual e o contrário de volátil?\n\n" +
                    "R: Vem cá sobrinho",
            "Você sabe qual a diferença entre a lagoa e a padaria?\n\n" +
                    "R: Na lagoa há sapinho, e na padaria, assa pão",
            "O que um cromossomo falou pro outro?\n\n" +
                    "R: Cromossomos bonitos!",
            "Batman pegou seu bat-sapato social e seu bat-blazer. Aonde ele foi?\n\n" +
                    "R: A um bat-zado",
            "Dois litros de leite atravessaram a rua e foram atropelados. Um morreu, o outro não, por quê?\n\n" +
                    "R: Por que um deles era Longa Vida",
            "Se o cachorro tivesse religião, qual seria?\n\n" +
                    "R: Cão-domblé",
            "O que o cavalo foi fazer no orelhão?\n\n" +
                    "R: Passar um trote"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);

        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroaleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[numeroaleatorio]);
            }
        });


    }
}
