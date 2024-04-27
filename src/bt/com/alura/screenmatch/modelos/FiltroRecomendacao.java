package bt.com.alura.screenmatch.modelos;

import bt.com.alura.screenmatch.calculos.Classificavel;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("está entre os preferidos do momento");
        }else if(classificavel.getClassificacao()>=2){
            System.out.println("muito bem avaliado no momento!");
        }else{
            System.out.println("coloque na sua lsita para asssitir depois");
        }//
    }
}
