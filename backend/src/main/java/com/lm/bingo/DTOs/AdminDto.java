package com.lm.bingo.DTOs;

import java.io.Serializable;

import com.lm.bingo.entities.Admin;

public class AdminDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long code;
	
	public AdminDto() {
		
	}

	public AdminDto(Long code) {
		this.code = code;
	}
	public AdminDto(Admin admin) {
		this.code = admin.getCode().longValue();
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
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
		AdminDto other = (AdminDto) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	
	
}
