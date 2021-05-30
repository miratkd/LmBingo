package com.lm.bingo.DTOs;

import java.io.Serializable;

import com.lm.bingo.entities.Number;

public class NumberDto implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer value;
	
	private Integer adminCode;
	
	public NumberDto() {
		
	}

	public NumberDto(Integer value, Integer adminCode) {
		this.value = value;
		this.adminCode = adminCode;
	}
	
	public NumberDto(Number entity) {
		this.value = entity.getValue();
		this.adminCode = entity.getAdmin().getCode();
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(Integer adminCode) {
		this.adminCode = adminCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminCode == null) ? 0 : adminCode.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberDto other = (NumberDto) obj;
		if (adminCode == null) {
			if (other.adminCode != null)
				return false;
		} else if (!adminCode.equals(other.adminCode))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	
}
