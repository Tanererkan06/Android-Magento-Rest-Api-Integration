package com.ipragmatech.oauthmagentogoogle.utils;


public class Constants {

	//You Custom Consumer Key
	public static final String CONSUMER_KEY = "xxxxxxxxxxxxxxxx";
	//You Custom Consumer SECRET
	public static final String CONSUMER_SECRET = "xxxxxxxxxxxxxxxx";
	//Your Base URL for the site
	public static final String BASE_URL = "http://www.xxx.com/";

	public static final String REQUEST_URL 		= BASE_URL + "oauth/initiate";
	public static final String ACCESS_URL 		= BASE_URL + "oauth/token";
	public static final String AUTHORIZE_URL 	= BASE_URL + "oauth/authorize";
    public static final String API_REQUEST 		= BASE_URL + "api/rest/";

	public static final String PRODUCT_API_REQUEST 		=   API_REQUEST+"products";
	
	public static final String ENCODING 		= "UTF-8";

    public static final String OAUTH_CALLBACK_URL = "http://localhost/";

}
