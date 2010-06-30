package com.blogspot.francisoud.frontal.jms;

public class Demand {

	private final String demand;

	private String codeInsee;
	private String ui;
	private String origin;
	private String domain;

	public Demand(final String demand) {
		this.demand = demand;
		parse(demand);
	}

	public String getCodeInsee() {
		return codeInsee;
	}

	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}

	public String getUi() {
		return ui;
	}

	public void setUi(String ui) {
		this.ui = ui;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	private void parse(final String demand) {
		// TODO
		codeInsee = "01234156";
		ui = "blagnac";
		origin = "Oceane";
		domain = "SAV";
	}

	public String getDemand() {
		return demand;
	}
}
