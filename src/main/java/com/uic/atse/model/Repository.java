package com.uic.atse.model;

import org.json.simple.JSONObject;

public class Repository {

    private String repositoryName;

    private String jenkinsFileUrl;

    private String jenkinsFileContent;

    private JSONObject json;

    public JSONObject getJson() {
        return json;
    }

    public void setJson(JSONObject json) {
        this.json = json;
    }

    public String getJenkinsFileContent() {
        return jenkinsFileContent;
    }

    public void setJenkinsFileContent(String jenkinsFileContent) {
        this.jenkinsFileContent = jenkinsFileContent;
    }

    public Repository() {
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getJenkinsFileUrl() {
        return jenkinsFileUrl;
    }

    public void setJenkinsFileUrl(String jenkinsFileUrl) {
        this.jenkinsFileUrl = jenkinsFileUrl;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "repositoryName='" + repositoryName + '\'' +
                ", jenkinsFileUrl='" + jenkinsFileUrl + '\'' +
                ", jenkinsFileContent='" + jenkinsFileContent + '\'' +
                ", json=" + json +
                '}';
    }
}
