package hu.csega.web.components.servlets;

public enum Servlet {
	ON_DEMAND_DUMMY_SERVLET("/api"),
	XTMDUMMY_SERVLET("/project-manager-gui/services/v2/XTMCustomerMTOMWebService"),
	LOG_SERVLET("/log"),
	WELCOME_SERVLET("/welcome"),
	CLAY_TABLET_DUMMY_SERVLET("/claytablet/ui"),
	MEMOQ_DUMMY_SERVLET("/memoq/ui"),
	CONSUMER_SERVLET("/consumer"),
	CLAY_TABLET_DOWNLOAD_SERVLET("/claytablet/download"),
	UISERVLET("/ui"),
	OAUTH2_CALLBACK("/oauth2callback"),
	DROPBOX_DOWNLOAD_SERVLET("/1/files/auto"),
	DROPBOX_DUMMY_SERVLET("/1/metadata"),
	OIDCDUMMY_SERVLET("/project-manager-gui"),
	GEO_FLUENT_DUMMY_SERVLET("/translation/v2"),
	OAUTH2_START("/oauth2");

	private Servlet(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	private String url;
}