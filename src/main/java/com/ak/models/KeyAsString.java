package com.ak.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

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

    public TreeMap<String,TrasiiKey> convertToKeys(){
    	TreeMap<String,TrasiiKey> tmpKeys = new TreeMap<String,TrasiiKey>();
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
            tmpKeys.put(chunks[5], curr);
        }
        return tmpKeys;
    }
}
