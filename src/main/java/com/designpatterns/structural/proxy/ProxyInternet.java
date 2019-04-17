package com.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private RealInternet internet;

	private static List<String> bannedSites;

	static {
		fillBannedSites();
	}

	private static void fillBannedSites() {
		bannedSites = new ArrayList<String>();
		bannedSites.add("banned_site1");
		bannedSites.add("banned_site2");
		bannedSites.add("banned_site3");
		bannedSites.add("banned_site4");
		bannedSites.add("banned_site5");
	}

	public ProxyInternet() {
		internet = new RealInternet();
	}

	@Override
	public String connect(final String url) {
		if (bannedSites.contains(url))
			return "URL is blocked";
		return internet.connect(url);
	}

}
