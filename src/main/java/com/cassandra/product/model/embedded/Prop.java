package com.cassandra.product.model.embedded;

import com.cassandra.product.model.enums.PropType;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@UserDefinedType("prop")
public class Prop {

	private String name;
	private String value;
	private PropType type;
	
	
}
