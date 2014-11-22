package com.biplav.tweedeo.utils;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.http.client.URL;
import com.google.gwt.regexp.shared.MatchResult;
import com.google.gwt.regexp.shared.RegExp;

public class UrlParser {

	/*
	 * Return a hashMap of host and query Params as key value pair
	 */
	
	public static String encode(String msg) {
		if(msg == null) return "";
		return URL.encode(msg);
	}

	public static HashMap<String, String> getUrlProperties(String url) {
		String[] firstSplit = url.split("\\?");
		Logger.log("FacebookApi.getUrlProperties()" + firstSplit[0]);
		HashMap<String, String> queryParameters = new HashMap<String, String>();
		queryParameters.put("host", firstSplit[0]);
		if (firstSplit.length < 2)
			return queryParameters;
		String[] queryStrings = firstSplit[1].split("&");
		for (String params : queryStrings) {
			String[] keyValue = params.split("=");
			queryParameters.put(keyValue[0], keyValue[1]);
		}
		return queryParameters;
	}

	public static String getUrlMatches(String data) {
		String regexUrl = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		return getMatch(data, regexUrl);
	}
	
	public static String getYoutubeMatches(String data) {
		if(data.contains("beedio.com")) {
			String id=getUrlProperties(data).get("yt");
			if(id != null) return id;
		}
		String url = getUrlMatches(data);
		if(url != null && url.contains("youtube")) {
			Logger.log("UrlParser.getYoutubeMatches() " + url);
			return getYoutubeVideoId(url);
		} else if(url != null && url.contains("youtu.be")) {
			Logger.log("UrlParser.getYoutubeMatches() " + url);
			return url.substring(url.lastIndexOf("/"));
		} 
		return null;
	}
	
	public static String getYoutubeVideoId(String url) {
		HashMap<String, String> urlProp = getUrlProperties(url);
		if(urlProp.get("v") != null) return urlProp.get("v");
		else {
			String host = urlProp.get("host");
			if(host !=null) {
				host =host.replace("http://","");
				String[] restParams = host.split("/");
				for(int index = 1; index < restParams.length; index++) {
					if(restParams[index].equalsIgnoreCase("v")) {
						if((index+1) < restParams.length)
							return restParams[++index];
					}
					else if(restParams[index].equalsIgnoreCase("embed")) {
						if((index+1) < restParams.length)
							return restParams[++index];
					}
					else if(restParams[index].equalsIgnoreCase("videos")) {
						if((index+1) < restParams.length)
							return restParams[++index];
					}
				}
			}
		}
		return null;
	}

	public static String getYoutubeMatchesWithRegex(String data) {
		try {
			//String regexUrl = "https?:\\/\\/(?:[0-9A-Z-]+\\.)?(?:youtu\\.be\\/|youtube\\.com\\S*[^\\w\\-\\s])([\\w\\-]{11})(?=[^\\w\\-]|$)(?![?=&+%\\w]*(?:['\"][^<>]*>|<\\/a>))[?=&+%\\w]*";
			String regexUrl = "(.*)https?:\\/\\/(?:[0-9A-Z-]+\\.)?(?:youtu\\.be\\/|youtube\\.com\\S*[^\\w\\-\\s])([\\w\\-]{11})(?=[^\\w\\-]|$)(?![?=&+%\\w]*(?:['\"][^<>]*>|<\\/a>))[?=&+%\\w](.*)";
			return getMatch(data, regexUrl);
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getMatch(String s, String pattern) {
		try {
			if (s == null || s.isEmpty())
				return null;
			// ArrayList<String> response = null;
			// Pattern patt = Pattern.compile(pattern);
			RegExp patt = RegExp.compile(pattern);
			// Matcher matcher = patt.matcher(s);
			MatchResult matcher = patt.exec(s);
			boolean matchFound = patt.test(s);
			if (!matchFound)
				return null;
			for (int i = 0; i <= matcher.getGroupCount(); i++) {
				String groupStr = matcher.getGroup(i);
				if(groupStr != null) return groupStr;
				Logger.log("UrlParser.getMatch() " + groupStr + " " + s);
			}
			

		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

}
