package com.funlab.spotty.security.oauth2.user;

import java.util.Map;

import com.funlab.spotty.exception.OAuth2AuthenticationProcessingException;
import com.funlab.spotty.entity.AuthProvider;

public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(AuthProvider.spotify.toString())) {
            return new SpotifyOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException(
                    "Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }

}