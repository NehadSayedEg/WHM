package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.DocumentType;
import com.example.whm.Model.Store;

import java.util.List;

@Dao
public interface DocumentTypeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<DocumentType> documentTypeList);


    @Query("SELECT * FROM  document_types_table")
    LiveData<List<DocumentType>> getAllDocumentype();


    @Query("DELETE  FROM  document_types_table")
    void deleteAllDocumentType();


}
