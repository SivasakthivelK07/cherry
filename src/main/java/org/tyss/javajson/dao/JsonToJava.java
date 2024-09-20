package org.tyss.javajson.dao;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class JsonToJava {
	private String name = "{\"id\":1,\"name\":\"FN01\",\"email\":\"fn01@gmail.com\",\"salary\":25000.0}";
}
