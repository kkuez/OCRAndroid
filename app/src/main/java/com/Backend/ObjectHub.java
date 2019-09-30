package com.Backend;

import com.ObjectTemplates.Document;

import java.util.ArrayList;
import java.util.List;

public class ObjectHub {

    private ObjectHub instance;

    private List<Document> documentList;

    private ObjectHub(){
        documentList = new ArrayList<>();
    }

    public ObjectHub getInstance(){
        if(instance == null){
            instance = new ObjectHub();
        }
        return instance;
    }



}
