package com.ak.models;

import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by amolina on 29/05/17.
 */
public class KeyAsString implements Serializable {

    private List<String> registros;

    public List<String> getRegistros() {
        return registros;
    }

    public void setRegistros(List<String> registros) {
        this.registros = registros;
    }

    public List<TrasiiKey> convertToKeys(){
        List<TrasiiKey> tmpKeys = new ArrayList<>();
        String[] chunks;
        TrasiiKey curr;
        for(String completeKey : getRegistros()){
            chunks = completeKey.split("\\|\\|");
            curr = new TrasiiKey();
            curr.setCompaak(chunks[0]);
            curr.setEmpresa(chunks[1]);
            curr.setEjercio(new BigDecimal(chunks[2]));
            curr.setPeriodo(chunks[3]);
            curr.setEminif(chunks[4]);
            curr.setFacnum(chunks[5]);
            curr.setFacfec(chunks[6]);
            curr.setFacter(chunks[7]);
            tmpKeys.add(curr);
        }
        return tmpKeys;
    }
}
