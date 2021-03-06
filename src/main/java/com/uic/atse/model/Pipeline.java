
package com.uic.atse.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stages",
    "post",
    "environment",
    "agent",
    "tools",
    "options",
    "parameters",
    "triggers"
})
public class Pipeline {

    @JsonProperty("stages")
    private List<Stage> stages = null;
    @JsonProperty("post")
    private Post post;
    @JsonProperty("environment")
    private List<Environment> environment = null;
    @JsonProperty("agent")
    private Agent agent;
    @JsonProperty("tools")
    private List<Tool> tools = null;
    @JsonProperty("options")
    private Options options;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("triggers")
    private Triggers triggers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stages")
    public List<Stage> getStages() {
        return stages;
    }

    @JsonProperty("stages")
    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }

    @JsonProperty("post")
    public Post getPost() {
        return post;
    }

    @JsonProperty("post")
    public void setPost(Post post) {
        this.post = post;
    }

    @JsonProperty("environment")
    public List<Environment> getEnvironment() {
        return environment;
    }

    @JsonProperty("environment")
    public void setEnvironment(List<Environment> environment) {
        this.environment = environment;
    }

    @JsonProperty("agent")
    public Agent getAgent() {
        return agent;
    }

    @JsonProperty("agent")
    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    @JsonProperty("tools")
    public List<Tool> getTools() {
        return tools;
    }

    @JsonProperty("tools")
    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    @JsonProperty("options")
    public Options getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(Options options) {
        this.options = options;
    }

    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("triggers")
    public Triggers getTriggers() {
        return triggers;
    }

    @JsonProperty("triggers")
    public void setTriggers(Triggers triggers) {
        this.triggers = triggers;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Pipeline{" +
                "stages=" + stages +
                ", post=" + post +
                ", environment=" + environment +
                ", agent=" + agent +
                ", tools=" + tools +
                ", options=" + options +
                ", parameters=" + parameters +
                ", triggers=" + triggers +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pipeline pipeline = (Pipeline) o;

        if (stages != null ? !stages.equals(pipeline.stages) : pipeline.stages != null) return false;
        if (post != null ? !post.equals(pipeline.post) : pipeline.post != null) return false;
        if (environment != null ? !environment.equals(pipeline.environment) : pipeline.environment != null)
            return false;
        if (agent != null ? !agent.equals(pipeline.agent) : pipeline.agent != null) return false;
        if (tools != null ? !tools.equals(pipeline.tools) : pipeline.tools != null) return false;
        if (options != null ? !options.equals(pipeline.options) : pipeline.options != null) return false;
        if (parameters != null ? !parameters.equals(pipeline.parameters) : pipeline.parameters != null) return false;
        return triggers != null ? triggers.equals(pipeline.triggers) : pipeline.triggers == null;
    }

    @Override
    public int hashCode() {
        int result = stages != null ? stages.hashCode() : 0;
        result = 31 * result + (post != null ? post.hashCode() : 0);
        result = 31 * result + (environment != null ? environment.hashCode() : 0);
        result = 31 * result + (agent != null ? agent.hashCode() : 0);
        result = 31 * result + (tools != null ? tools.hashCode() : 0);
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (parameters != null ? parameters.hashCode() : 0);
        result = 31 * result + (triggers != null ? triggers.hashCode() : 0);
        return result;
    }
}
