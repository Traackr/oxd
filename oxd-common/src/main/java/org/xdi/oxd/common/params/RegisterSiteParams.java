package org.xdi.oxd.common.params;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * @author Yuriy Zabrovarnyy
 * @version 0.9, 24/09/2015
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterSiteParams implements HasProtectionAccessTokenParams {

    @JsonProperty(value = "op_host")
    private String op_host;
    @JsonProperty(value = "op_discovery_path")
    private String op_discovery_path;
    @JsonProperty(value = "authorization_redirect_uri")
    private String authorization_redirect_uri;
    @JsonProperty(value = "post_logout_redirect_uri")
    private String post_logout_redirect_uri;
    @JsonProperty(value = "protection_access_token")
    private String protection_access_token;

    @JsonProperty(value = "redirect_uris")
    private List<String> redirect_uris;
    @JsonProperty(value = "response_types")
    private List<String> response_types;
    @JsonProperty(value = "claims_redirect_uri")
    private List<String> claims_redirect_uri;

    @JsonProperty(value = "client_id")
    private String client_id;
    @JsonProperty(value = "client_secret")
    private String client_secret;
    @JsonProperty(value = "client_registration_access_token")
    private String client_registration_access_token;
    @JsonProperty(value = "client_registration_client_uri")
    private String client_registration_client_uri;
    @JsonProperty(value = "client_name")
    private String client_name;
    @JsonProperty(value = "client_jwks_uri")
    private String client_jwks_uri;
    @JsonProperty(value = "client_token_endpoint_auth_method")
    private String client_token_endpoint_auth_method;
    @JsonProperty(value = "client_request_uris")
    private List<String> client_request_uris;
    @JsonProperty(value = "client_frontchannel_logout_uris")
    private List<String> client_frontchannel_logout_uris;
    @JsonProperty(value = "client_sector_identifier_uri")
    private String client_sector_identifier_uri;

    @JsonProperty(value = "scope")
    private List<String> scope;
    @JsonProperty(value = "ui_locales")
    private List<String> ui_locales;
    @JsonProperty(value = "claims_locales")
    private List<String> claims_locales;
    @JsonProperty(value = "acr_values")
    private List<String> acr_values;
    @JsonProperty(value = "grant_types")
    private List<String> grant_types;
    @JsonProperty(value = "contacts")
    private List<String> contacts;
    @JsonProperty(value = "trusted_client")
    private Boolean trusted_client = false;
    @JsonProperty(value = "oxd_rp_programming_language")
    private String oxd_rp_programming_language;

    public RegisterSiteParams() {
    }

    public String getClientRegistrationAccessToken() {
        return client_registration_access_token;
    }

    public void setClientRegistrationAccessToken(String clientRegistrationAccessToken) {
        this.client_registration_access_token = clientRegistrationAccessToken;
    }

    public String getClientRegistrationClientUri() {
        return client_registration_client_uri;
    }

    public void setClientRegistrationClientUri(String clientRegistrationClientUri) {
        this.client_registration_client_uri = clientRegistrationClientUri;
    }

    public String getOxdRpProgrammingLanguage() {
        return oxd_rp_programming_language;
    }

    public void setOxdRpProgrammingLanguage(String oxdRpProgrammingLanguage) {
        this.oxd_rp_programming_language = oxdRpProgrammingLanguage;
    }

    public String getProtectionAccessToken() {
        return protection_access_token;
    }

    public void setProtectionAccessToken(String protectionAccessToken) {
        this.protection_access_token = protectionAccessToken;
    }

    public Boolean getTrustedClient() {
        return trusted_client;
    }

    public void setTrustedClient(Boolean trustedClient) {
        this.trusted_client = trustedClient;
    }

    public String getClientName() {
        return client_name;
    }

    public void setClientName(String clientName) {
        this.client_name = clientName;
    }

    public String getOpHost() {
        return op_host;
    }

    public void setOpHost(String opHost) {
        this.op_host = opHost;
    }

    public String getOpDiscoveryPath() {
        return op_discovery_path;
    }

    public void setOpDiscoveryPath(String opDiscoveryPath) {
        this.op_discovery_path = opDiscoveryPath;
    }

    public String getClientSectorIdentifierUri() {
        return client_sector_identifier_uri;
    }

    public void setClientSectorIdentifierUri(String clientSectorIdentifierUri) {
        this.client_sector_identifier_uri = clientSectorIdentifierUri;
    }

    public List<String> getClientFrontchannelLogoutUri() {
        return client_frontchannel_logout_uris;
    }

    public void setClientFrontchannelLogoutUri(List<String> clientFrontchannelLogoutUri) {
        this.client_frontchannel_logout_uris = clientFrontchannelLogoutUri;
    }

    public List<String> getClientRequestUris() {
        return client_request_uris;
    }

    public void setClientRequestUris(List<String> clientRequestUris) {
        this.client_request_uris = clientRequestUris;
    }

    public String getClientTokenEndpointAuthMethod() {
        return client_token_endpoint_auth_method;
    }

    public void setClientTokenEndpointAuthMethod(String clientTokenEndpointAuthMethod) {
        this.client_token_endpoint_auth_method = clientTokenEndpointAuthMethod;
    }

    public String getPost_logout_redirect_uri() {
        return post_logout_redirect_uri;
    }

    public void setPost_logout_redirect_uri(String post_logout_redirect_uri) {
        this.post_logout_redirect_uri = post_logout_redirect_uri;
    }

    public String getClientJwksUri() {
        return client_jwks_uri;
    }

    public void setClientJwksUri(String clientJwksUri) {
        this.client_jwks_uri = clientJwksUri;
    }

    public String getAuthorizationRedirectUri() {
        return authorization_redirect_uri;
    }

    public void setAuthorizationRedirectUri(String authorizationRedirectUri) {
        this.authorization_redirect_uri = authorizationRedirectUri;
    }

    public List<String> getClaimsLocales() {
        return claims_locales;
    }

    public void setClaimsLocales(List<String> claimsLocales) {
        this.claims_locales = claimsLocales;
    }

    public String getClientId() {
        return client_id;
    }

    public void setClientId(String clientId) {
        this.client_id = clientId;
    }

    public String getClientSecret() {
        return client_secret;
    }

    public void setClientSecret(String clientSecret) {
        this.client_secret = clientSecret;
    }

    public List<String> getGrantType() {
        return grant_types;
    }

    public void setGrantType(List<String> grantType) {
        this.grant_types = grantType;
    }

    public List<String> getRedirectUris() {
        return redirect_uris;
    }

    public void setRedirectUris(List<String> redirectUris) {
        this.redirect_uris = redirectUris;
    }

    public List<String> getResponseTypes() {
        return response_types;
    }

    public void setResponseTypes(List<String> responseTypes) {
        this.response_types = responseTypes;
    }

    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public List<String> getUiLocales() {
        return ui_locales;
    }

    public void setUiLocales(List<String> uiLocales) {
        this.ui_locales = uiLocales;
    }

    public List<String> getAcrValues() {
        return acr_values;
    }

    public void setAcrValues(List<String> acrValues) {
        this.acr_values = acrValues;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public List<String> getClaimsRedirectUri() {
        return claims_redirect_uri;
    }

    public void setClaimsRedirectUri(List<String> claimsRedirectUri) {
        this.claims_redirect_uri = claimsRedirectUri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RegisterSiteParams");
        sb.append("{acr_values=").append(acr_values);
        sb.append(", op_host='").append(op_host).append('\'');
        sb.append(", op_discovery_path='").append(op_discovery_path).append('\'');
        sb.append(", authorization_redirect_uri='").append(authorization_redirect_uri).append('\'');
        sb.append(", redirect_uris=").append(redirect_uris);
        sb.append(", claims_redirect_uri=").append(claims_redirect_uri);
        sb.append(", response_types=").append(response_types);
        sb.append(", client_id='").append(client_id).append('\'');
        sb.append(", client_secret='").append(client_secret).append('\'');
        sb.append(", client_name='").append(client_name).append('\'');
        sb.append(", client_sector_identifier_uri='").append(client_sector_identifier_uri).append('\'');
        sb.append(", scope=").append(scope);
        sb.append(", ui_locales=").append(ui_locales);
        sb.append(", claims_locales=").append(claims_locales);
        sb.append(", grant_types=").append(grant_types);
        sb.append(", contacts=").append(contacts);
        sb.append('}');
        return sb.toString();
    }

    @JsonIgnore
    @Override
    public String getOxdId() {
        return "no";
    }
}

