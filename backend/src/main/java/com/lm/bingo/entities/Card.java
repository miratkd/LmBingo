package com.lm.bingo.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cards")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String userName;
	
	private boolean bingo;
	
	@ManyToOne
	@JoinColumn(name = "admin_code")
	private Admin admin;
	
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
	
	
	public void seddingTable() {
		List<Integer> list = new ArrayList<Integer>();
		boolean repeat;
		Integer finished = 0;
		Random random = new Random();
		Integer randomInt;
		do {
			do {
				randomInt = random.nextInt(99);
				repeat = list.contains(randomInt);
			}while(repeat);
			list.add(randomInt);
			finished += 1;
		}while(finished < 20);
		p1 = list.get(0);
		p2 = list.get(1);
		p3 = list.get(2);
		p4 = list.get(3);
		p5 = list.get(4);
		p6 = list.get(5);
		p7 = list.get(6);
		p8 = list.get(7);
		p9 = list.get(8);
		p10 = list.get(9);
		p11 = list.get(10);
		p12 = list.get(11);
		p13 = list.get(12);
		p14 = list.get(13);
		p15 = list.get(14);
		p16 = list.get(15);
		p17 = list.get(16);
		p18 = list.get(17);
		p19 = list.get(18);
		p20 = list.get(19);
	}
	
	public Card () {
		
	}

	public Card(Integer id, String userName, boolean bingo,Admin admin) {
		this.id = id;
		this.userName = userName;
		this.bingo = bingo;
		this.admin = admin;
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


	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
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
		Card other = (Card) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
