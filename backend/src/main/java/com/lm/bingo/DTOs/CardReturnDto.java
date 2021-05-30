package com.lm.bingo.DTOs;

import java.io.Serializable;

import com.lm.bingo.entities.Card;

public class CardReturnDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
    private Integer id;
	
	private String userName;
	
	private boolean bingo;
	
	private Integer adminCode;
	
	private Integer p1;
	private Integer p2;
	private Integer p3;
	private Integer p4;
	private Integer p5;
	private Integer p6;
	private Integer p7;
	private Integer p8;
	private Integer p9;
	private Integer p10;
	private Integer p11;
	private Integer p12;
	private Integer p13;
	private Integer p14;
	private Integer p15;
	private Integer p16;
	private Integer p17;
	private Integer p18;
	private Integer p19;
	private Integer p20;
	
	public CardReturnDto() {
		
	}

	public CardReturnDto(Integer id, String userName, boolean bingo, Integer adminCode, Integer p1, Integer p2,
			Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10,
			Integer p11, Integer p12, Integer p13, Integer p14, Integer p15, Integer p16, Integer p17, Integer p18,
			Integer p19, Integer p20) {
		this.id = id;
		this.userName = userName;
		this.bingo = bingo;
		this.adminCode = adminCode;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.p7 = p7;
		this.p8 = p8;
		this.p9 = p9;
		this.p10 = p10;
		this.p11 = p11;
		this.p12 = p12;
		this.p13 = p13;
		this.p14 = p14;
		this.p15 = p15;
		this.p16 = p16;
		this.p17 = p17;
		this.p18 = p18;
		this.p19 = p19;
		this.p20 = p20;
	}
	
	public CardReturnDto(Card entity) {
		this.id = entity.getId();
		this.userName = entity.getUserName();
		this.bingo = entity.isBingo();
		this.adminCode = entity.getAdmin().getCode();
		this.p1 = entity.getP1();
		this.p2 = entity.getP2();
		this.p3 = entity.getP3();
		this.p4 = entity.getP4();
		this.p5 = entity.getP5();
		this.p6 = entity.getP6();
		this.p7 = entity.getP7();
		this.p8 = entity.getP8();
		this.p9 = entity.getP9();
		this.p10 = entity.getP10();
		this.p11 = entity.getP11();
		this.p12 = entity.getP12();
		this.p13 = entity.getP13();
		this.p14 = entity.getP14();
		this.p15 = entity.getP15();
		this.p16 = entity.getP16();
		this.p17 = entity.getP17();
		this.p18 = entity.getP18();
		this.p19 = entity.getP19();
		this.p20 = entity.getP20();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isBingo() {
		return bingo;
	}

	public void setBingo(boolean bingo) {
		this.bingo = bingo;
	}

	public Integer getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(Integer adminCode) {
		this.adminCode = adminCode;
	}

	public Integer getP1() {
		return p1;
	}

	public void setP1(Integer p1) {
		this.p1 = p1;
	}

	public Integer getP2() {
		return p2;
	}

	public void setP2(Integer p2) {
		this.p2 = p2;
	}

	public Integer getP3() {
		return p3;
	}

	public void setP3(Integer p3) {
		this.p3 = p3;
	}

	public Integer getP4() {
		return p4;
	}

	public void setP4(Integer p4) {
		this.p4 = p4;
	}

	public Integer getP5() {
		return p5;
	}

	public void setP5(Integer p5) {
		this.p5 = p5;
	}

	public Integer getP6() {
		return p6;
	}

	public void setP6(Integer p6) {
		this.p6 = p6;
	}

	public Integer getP7() {
		return p7;
	}

	public void setP7(Integer p7) {
		this.p7 = p7;
	}

	public Integer getP8() {
		return p8;
	}

	public void setP8(Integer p8) {
		this.p8 = p8;
	}

	public Integer getP9() {
		return p9;
	}

	public void setP9(Integer p9) {
		this.p9 = p9;
	}

	public Integer getP10() {
		return p10;
	}

	public void setP10(Integer p10) {
		this.p10 = p10;
	}

	public Integer getP11() {
		return p11;
	}

	public void setP11(Integer p11) {
		this.p11 = p11;
	}

	public Integer getP12() {
		return p12;
	}

	public void setP12(Integer p12) {
		this.p12 = p12;
	}

	public Integer getP13() {
		return p13;
	}

	public void setP13(Integer p13) {
		this.p13 = p13;
	}

	public Integer getP14() {
		return p14;
	}

	public void setP14(Integer p14) {
		this.p14 = p14;
	}

	public Integer getP15() {
		return p15;
	}

	public void setP15(Integer p15) {
		this.p15 = p15;
	}

	public Integer getP16() {
		return p16;
	}

	public void setP16(Integer p16) {
		this.p16 = p16;
	}

	public Integer getP17() {
		return p17;
	}

	public void setP17(Integer p17) {
		this.p17 = p17;
	}

	public Integer getP18() {
		return p18;
	}

	public void setP18(Integer p18) {
		this.p18 = p18;
	}

	public Integer getP19() {
		return p19;
	}

	public void setP19(Integer p19) {
		this.p19 = p19;
	}

	public Integer getP20() {
		return p20;
	}

	public void setP20(Integer p20) {
		this.p20 = p20;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CardReturnDto other = (CardReturnDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	

}
