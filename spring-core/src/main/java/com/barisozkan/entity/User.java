package com.barisozkan.entity;

//lombok yapısı bizim getter,setter ve constructor yapısını otomatik tanımlamamızı saglar.
//bir kütüphane yani 
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter					
@AllArgsConstructor		//parametreli constructor
@NoArgsConstructor		//parametresiz constructor
@ToString
public class User {
	
	private String firstName;

}
