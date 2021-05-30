package com.lm.bingo.DTOs;

import java.io.Serializable;

public class CardDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
    private String userName;
	
	private Integer adminCode;
	
	public CardDto() {
		
	}

	public CardDto(String userName, Integer adminCode) {
		this.userName = userName;
		this.adminCode = adminCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		CardDto other = (CardDto) obj;
		if (adminCode == null) {
			if (other.adminCode != null)
				return false;
		} else if (!adminCode.equals(other.adminCode))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	

}
